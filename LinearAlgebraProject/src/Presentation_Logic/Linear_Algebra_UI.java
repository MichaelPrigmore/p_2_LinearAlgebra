package Presentation_Logic;

import java.text.DecimalFormat;
import java.util.Scanner;

import Domain_Logic.Matrix_Manager;
import Domain_Logic.Reduced_Echelon_Calculator;

public class Linear_Algebra_UI
{
	private Reduced_Echelon_Calculator calculator;
	private DecimalFormat fmt;
	private Scanner scan;
	boolean valid_Input;
	private final int MIN_ROW_OR_COL_LENGTH = 2;

	public Linear_Algebra_UI()
	{
		this.scan = new Scanner(System.in);
		this.fmt = new DecimalFormat("0.###");

		System.out.print("Welcome to the Echelon Calculator!\n\n");

		System.out.print("Enter the number of rows for your matrix (must be an integer greater than 1): ");
		int m = enter_An_Int_Greater_Than_Zero();

		System.out.print("Enter the number of columns for your matrix (must be an integer greater than 1): ");
		int n = enter_An_Int_Greater_Than_Zero();

		System.out.println();

		this.calculator = new Reduced_Echelon_Calculator(m, n);
	}

	public Linear_Algebra_UI(String testing)
	{
		this.fmt = new DecimalFormat("0.###");
	}

	private int enter_An_Int_Greater_Than_Zero()
	{
		int num = MIN_ROW_OR_COL_LENGTH;

		do
		{
			if (num < MIN_ROW_OR_COL_LENGTH)
			{
				System.out.print(
						"\nValidation error. The integer must be greater than 1. " + "Please enter a valid ingeger:");
			}

			while (!scan.hasNextInt())
			{
				String input = scan.next();
				System.out.printf("\nValidation error. \"%s\" is not a valid number. Please enter a valid ingeger:",
						input);
			}
			num = scan.nextInt();

		}
		while (num < MIN_ROW_OR_COL_LENGTH);

		return num;
	}

	private double enter_A_Double()
	{
		double num = 1;

		while (!scan.hasNextDouble())
		{
			String input = scan.next();
			System.out.printf("\nValidation error. \"%s\" is not a number. Please enter a number:", input);
		}
		num = scan.nextDouble();

		return num;
	}

	public void setup_matrix()
	{

		for (int m = 0; m < calculator.getManager().get_My_Matrix().length; m++)
		{
			for (int n = 0; n < calculator.getManager().get_My_Matrix()[m].length; n++)
			{
				System.out.print("Enter the value at position (" + m + ", " + n + ") of the matrix: ");

				double value = enter_A_Double();

				calculator.getManager().set_Value_At_Index(m, n, value);
			}

		}

		System.out.println("\n");
	}

	public void print_Matrix(double[][] matrix)
	{
		for (int m = 0; m < matrix.length; m++)
		{
			for (int n = 0; n < matrix[m].length; n++)
			{
				System.out.print(fmt.format(matrix[m][n]) + "\t");
			}
			System.out.println();
		}
	}

	public void solve()
	{
		System.out.println("Original Matrix: ");
		System.out.println();

		print_Matrix(calculator.getManager().get_My_Matrix());

		System.out.println();

		calculator.computeEchelonForm();

		System.out.println("An Echelon Form: ");
		System.out.println();

		print_Matrix(calculator.getManager().get_My_Matrix());

		System.out.println();

		calculator.computeReducedEchelonForm();

		System.out.println("Unique Reduced Echelon Form: ");
		System.out.println();

		print_Matrix(calculator.getManager().get_My_Matrix());

		System.out.println();

	}

	// public static void main(String[] args)
	// {
	// Linear_Algebra_UI appTester = new Linear_Algebra_UI("testing");
	//
	// // double[][] matrix =
	// // {
	// // { 1, 2, 1, 1, 8 },
	// // { 1, 2, 2, -1, 12 },
	// // { 2, 4, 0, 6, 4 } };
	//
	// double[][] matrix =
	// {
	// { 1, 2, 3, 4, 5 },
	// { 6, 7, 8, 9, 11 },
	// { 12, 13, 14, 15, 16 },
	// { 17, 18, 19, 20, 21 } };
	//
	// double[][] expected_Output =
	// {
	// { 1, 2, 0, 3, 0 },
	// { 0, 0, 1, -2, 0 },
	// { 0, 0, 0, 0, 1 } };
	//
	// Reduced_Echelon_Calculator calculator = new
	// Reduced_Echelon_Calculator(matrix);
	//
	// appTester.print_Matrix(calculator.getManager().get_My_Matrix());
	// System.out.println();
	//
	// matrix = calculator.computeEchelonForm();
	// appTester.print_Matrix(calculator.getManager().get_My_Matrix());
	// System.out.println();
	//
	// matrix = calculator.computeReducedEchelonForm();
	// appTester.print_Matrix(calculator.getManager().get_My_Matrix());
	// System.out.println();
	//
	// }

}
