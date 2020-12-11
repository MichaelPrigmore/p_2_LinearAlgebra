package Domain_Logic;

import java.util.ArrayList;
import java.util.Arrays;

import Presentation_Logic.Linear_Algebra_UI;
import edu.princeton.cs.introcs.StdOut;

public class Reduced_Echelon_Calculator
{
	private double[][] matrix;
	int pivot_Column;
	int pivot_Row;
	int nonzero_Row;
	double divisor;
	double multiplier;
	double[] current_Base_Row;
	double[] temp_Row;
	ArrayList<pivot_Indicies> list_of_pivots;

	private final double TOL = .0000001;

	double t1;
	double t2;

	public enum Sign
	{
		POSITIVE, NEGATIVE, ZERO;
	}

	public Reduced_Echelon_Calculator(double[][] matrix_to_reduce)
	{
		matrix = matrix_to_reduce;
		pivot_Column = -1;
		list_of_pivots = new ArrayList<pivot_Indicies>();

	}

	public double[][] computeEchelonForm()
	{

		for (int m = 0; m < matrix.length; m++)
		{
			pivot_Row = m;

			find_Next_Pivot_Column(m);

			// if both pivot_Row and pivot_Column are set to be out of bounds by
			// one to big, there are no more pivot positions. Break out of loop.
			if (nonzero_Row == matrix.length && pivot_Column == matrix[0].length)
			{
				break;
			}

			// Make sure the pivot position value is nonzero, swap with a row
			// below if it's not
			if (m != nonzero_Row)
			{
				temp_Row = matrix[m]; // Arrays.copyOfRange(matrix[m], 0,
										// matrix[m].length - 1);
				matrix[m] = matrix[nonzero_Row];
				matrix[nonzero_Row] = temp_Row;
			}

			// If the pivot is negative, multiple row by -1.
			if (get_sign(matrix[m][pivot_Column]) == Sign.NEGATIVE)
			{
				for (int n = pivot_Column; n < matrix[0].length; n++)
				{
					matrix[m][n] = matrix[m][n] * (-1.0);
				}
			}

			// Divide row by divisor (value at pivot position) to get pivot
			// equal to 1.
			divisor = matrix[m][pivot_Column];
			for (int n = pivot_Column; n < matrix[0].length; n++)
			{
				matrix[m][n] = matrix[m][n] / divisor;
			}

			// Copy row where pivot position is so you can use it to modify the
			// rows below to get zeros below pivot position
			current_Base_Row = Arrays.copyOfRange(matrix[m], 0, matrix[m].length);

			// Turn values below pivot into zeros. If on the last row, your
			// done. Only do the next operations if m is not the last row.
			if (m != (matrix.length - 1))
			{
				for (int m2 = m + 1; m2 < matrix.length; m2++)
				{
					multiplier = matrix[m2][pivot_Column];

					for (int n = pivot_Column; n < matrix[0].length; n++)
					{
						matrix[m2][n] = matrix[m2][n] - multiplier * current_Base_Row[n];
					}
					// Refactored to above
					// switch (get_sign(matrix[m2][pivot_Column]))
					// {
					// case POSITIVE:
					// for (int n = pivot_Column; n < matrix[0].length; n++)
					// {
					// // t1 = matrix[m2][n];
					// // t2 = current_Base_Row[n];
					// matrix[m2][n] = matrix[m2][n] - multiplier *
					// current_Base_Row[n]; // **same.
					//
					// }
					// break;
					// case NEGATIVE:
					// for (int n = pivot_Column; n < matrix[0].length; n++)
					// {
					// // t1 = matrix[m2][n];
					// // t2 = current_Base_Row[n];
					// matrix[m2][n] = matrix[m2][n] - multiplier *
					// current_Base_Row[n]; // **same.
					//
					// }
					// break;
					// case ZERO:
					// // Do nothing, move on to next row
					// break;
					// }
				}
			}

		}

		return matrix;
	}

	public double[][] computeReducedEchelonForm()
	{
		generate_List_Of_Pivots();

		// stop before 0, not -1, because we don't need to delete anything above
		// first row.
		for (int i = list_of_pivots.size() - 1; i > 0; i--)
		{
			current_Base_Row = Arrays.copyOfRange(matrix[list_of_pivots.get(i).getRow_Pivot_Index()], 0,
					matrix[list_of_pivots.get(i).getRow_Pivot_Index()].length);

			for (int m2 = list_of_pivots.get(i).getRow_Pivot_Index() - 1; m2 > -1; m2--)
			{
				multiplier = matrix[m2][list_of_pivots.get(i).getColumn_Pivot_Index()];

				for (int n = 0; n < matrix[0].length; n++)
				{
					matrix[m2][n] = matrix[m2][n] - multiplier * current_Base_Row[n];
				}
			}

		}

		return matrix;
	}

	private void generate_List_Of_Pivots()
	{
		int m;
		int n = 0;

		for (m = 0; m < matrix.length; m++)
		{
			if (m == 0)
			{
				list_of_pivots.add(new pivot_Indicies(m, n));
			}
			else
			{
				for (n = 0; n < matrix[0].length; n++)
				{
					if (numbers_Are_Equal(matrix[m][n], 1))
					{
						list_of_pivots.add(new pivot_Indicies(m, n));
						break;
					}
				}
			}
		}

	}

	public void find_Next_Pivot_Column(int row)
	{
		pivot_Column++;

		outerloop: // Used to break out of both loops
		for (int n = pivot_Column; n < matrix[0].length; n++)
		{
			for (int m = row; m < matrix.length; m++)
			{
				if (!equalsZero(matrix[m][n]))
				{
					nonzero_Row = m;
					pivot_Column = n;
					break outerloop;
				}
				else
				{
					// Both of these are outside of bounds to signify no more
					// pivot positions
					nonzero_Row = matrix.length;
					pivot_Column = matrix[0].length;
				}
			}

		}
	}

	public boolean these_Two_Matricies_Are_equal(double[][] mat1, double[][] mat2)
	{
		boolean result = true;

		outerloop: for (int m = 0; m < matrix.length; m++)
		{
			for (int n = 0; n < matrix[m].length; n++)
			{
				if (!numbers_Are_Equal(mat1[m][n], mat2[m][n]))
				{
					result = false;
					break outerloop;
				}
			}
		}

		return result;
	}

	public boolean these_Two_Matricies_Are_equal(double[][] mat1, double[][] mat2, double tol)
	{
		boolean result = true;

		outerloop: for (int m = 0; m < matrix.length; m++)
		{
			for (int n = 0; n < matrix[m].length; n++)
			{
				if (!numbers_Are_Equal(mat1[m][n], mat2[m][n], tol))
				{
					result = false;
					break outerloop;
				}
			}
		}

		return result;
	}

	public boolean numbers_Are_Equal(double num1, double num2)
	{
		return (Math.abs(num1 - num2) < TOL);
	}

	public boolean numbers_Are_Equal(double num1, double num2, double tol)
	{
		return (Math.abs(num1 - num2) < tol);
	}

	public boolean equalsZero(double num)
	{
		return (Math.abs(num) < TOL);
	}

	public Sign get_sign(double num)
	{
		Sign sign;
		if (num > TOL)
		{
			sign = Sign.POSITIVE;
		}
		else if (num < -TOL)
		{
			sign = Sign.NEGATIVE;
		}
		else
		{
			sign = Sign.ZERO;
		}
		return sign;
	}

}
