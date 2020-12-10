package Presentation_Logic;
import java.util.ArrayList;

import Domain_Logic.Matrix_Manager;
import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class Linear_Algebra_UI
{
	private Matrix_Manager mat;

	public Linear_Algebra_UI()
	{
		StdOut.print("Welcome to the reduced row echelon form calculator!\n\n");

		StdOut.print("Enter the number of rows in your matrix: \n");
		int m = StdIn.readInt();

		StdOut.print("Enter the number of columns in your matrix: \n");
		int n = StdIn.readInt();

		this.mat = new Matrix_Manager(m, n);
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
				StdOut.print(mat.get_My_Matrix()[m][n] + "\t");
			}
			StdOut.print("\n");
		}
	}

}
