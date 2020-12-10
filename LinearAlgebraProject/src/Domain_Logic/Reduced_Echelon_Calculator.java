package Domain_Logic;

import java.util.Arrays;

import edu.princeton.cs.introcs.StdOut;

public class Reduced_Echelon_Calculator
{
	private double[][] matrix;
	// int m;
	// int n;
	int pivot_Column;
	int nonzero_Row;
	double divisor;
	double multiplier;
	double[] current_Base_Row;
	double[] temp_Row;

	public enum Sign
	{
		POSITIVE, NEGATIVE, ZERO;
	}

	public Reduced_Echelon_Calculator(double[][] matrix_to_reduce)
	{
		matrix = matrix_to_reduce;
		pivot_Column = -1;

	}

	public double[][] compute()
	{
		Sign sign;

		for (int m = 0; m < matrix.length; m++)
		{
			find_Next_Pivot_Column(m);

			current_Base_Row = Arrays.copyOfRange(matrix[m], pivot_Column, matrix[m].length);

			// Do something if pivot is zero *******************
			// If the pivot is negative, multiple row by -1.
			if (get_sign(matrix[m][pivot_Column]) == Sign.NEGATIVE)
			{
				for (int n = pivot_Column; n < matrix[0].length; n++)
				{
					matrix[m][n] = matrix[m][n] * (-1.0);
				}
			}

			// Divide row by divisor to get pivot equal to 1.
			divisor = matrix[m][pivot_Column];
			for (int n = pivot_Column; n < matrix[0].length; n++)
			{
				matrix[m][n] = matrix[m][n] / divisor;
			}

			// If on the last row, your done. Only do the next operations if m
			// is not the last row.
			if (m != (matrix.length - 1))
			{
				for (int m2 = m + 1; m2 < matrix.length; m2++)
				{
					switch (get_sign(matrix[m2][pivot_Column]))
					{
					case POSITIVE:
						multiplier = matrix[m2][pivot_Column];
						for (int n = pivot_Column; n < matrix[0].length; n++)
						{
							matrix[m2][n] = matrix[m2][n] * (-1.0);
						}
						break;
					case NEGATIVE:
						// DO SOMETHING
						break;
					case ZERO:
						// DO SOMETHING
						break;
					}
				}
			}

		}

		return matrix;
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
			}

		}
	}

	public boolean equalsZero(double num)
	{
		return (num < .0000001);
	}

	public Sign get_sign(double num)
	{
		Sign sign;
		if (num > .0000001)
		{
			sign = Sign.POSITIVE;
		}
		else if (num < .0000001)
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
