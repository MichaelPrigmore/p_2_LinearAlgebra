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

	private int enter_An_Int_Greater_Than_Zero()
	{
		int num = 2;

		do
		{
			if (num < 2)
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
		while (num < 1);

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

	// public void print_Matrix()
	// {
	// for (int m = 0; m < mat.get_My_Matrix().length; m++)
	// {
	// for (int n = 0; n < mat.get_My_Matrix()[m].length; n++)
	// {
	// System.out.print(fmt.format(mat.get_My_Matrix()[m][n]) + "\t");
	// }
	// System.out.println();
	// }
	// }

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

}
