package Presentation_Logic;

import java.text.DecimalFormat;
import java.util.ArrayList;

import Domain_Logic.Matrix_Manager;
import Domain_Logic.Reduced_Echelon_Calculator;
import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class Linear_Algebra_UI
{
	private Matrix_Manager mat;
	DecimalFormat fmt = new DecimalFormat("0.###");

	public Linear_Algebra_UI()
	{
		StdOut.print("Welcome to the reduced row echelon form calculator!\n\n");

		// StdOut.print("Enter the number of rows in your matrix: \n");
		// int m = StdIn.readInt();

		// StdOut.print("Enter the number of columns in your matrix: \n");
		// int n = StdIn.readInt();

		// this.mat = new Matrix_Manager(m, n);
	}

	public void setup_matrix()
	{

		for (int m = 0; m < mat.get_My_Matrix().length; m++)
		{
			for (int n = 0; n < mat.get_My_Matrix()[m].length; n++)
			{
				StdOut.print("Enter the value at position (" + m + ", " + n + ") of the matrix: ");

				double value = StdIn.readDouble();

				mat.set_Value_At_Index(m, n, value);
			}

		}

		StdOut.print("\n");
	}

	public void print_Matrix()
	{
		for (int m = 0; m < mat.get_My_Matrix().length; m++)
		{
			for (int n = 0; n < mat.get_My_Matrix()[m].length; n++)
			{
				StdOut.print(fmt.format(mat.get_My_Matrix()[m][n]) + "\t");
			}
			StdOut.print("\n");
		}
	}

	public void print_Matrix(double[][] matrix)
	{
		for (int m = 0; m < matrix.length; m++)
		{
			for (int n = 0; n < matrix[m].length; n++)
			{
				StdOut.print(fmt.format(matrix[m][n]) + "\t");
			}
			StdOut.print("\n");
		}
	}

	public void print_Matrix_Column_Traversal()
	{
		for (int n = 0; n < mat.get_My_Matrix()[0].length; n++)
		{
			for (int m = 0; m < mat.get_My_Matrix().length; m++)
			{
				StdOut.print(mat.get_My_Matrix()[m][n] + "\t");
			}
			StdOut.print("\n");
		}
	}

	public static void main(String[] args)
	{
		Linear_Algebra_UI appTester = new Linear_Algebra_UI();
		// appTester.setup_matrix();
		// appTester.print_Matrix();
		// appTester.print_Matrix_Column_Traversal();

		// double[][] matrix =
		// {
		// { 1, 2, 3, 4 },
		// { 5, 6, 7, 8 } };

		double[][] matrix =
		{
				{ 1, 2, 3, 4 },
				{ 5, 6, 7, 8 },
				{ 9, 10, 11, 12 } };

		// double[][] matrix =
		// {
		// { 1, 2, 3 },
		// { 1, 2, 3 },
		// { 1, 2, 3 } };

		appTester.print_Matrix(matrix);
		StdOut.print("\n");

		Reduced_Echelon_Calculator calculator = new Reduced_Echelon_Calculator(matrix);

		matrix = calculator.computeEchelonForm();
		appTester.print_Matrix(matrix);

		matrix = calculator.computeReducedEchelonForm();
		appTester.print_Matrix(matrix);
	}

}
