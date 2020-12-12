package Extra;

import java.util.Scanner;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class scratch
{
	public static void main(String[] args)
	{
		// int[][] matrix =
		// {
		// { 1, 2, 3, 4 },
		// { 5, 6, 7, 8 } };
		// StdOut.print(matrix.length);
		// StdOut.print("\n");
		// StdOut.print(matrix[0].length);

		// double input = 0;
		// System.out.println("Enter an Integer value ");
		// Scanner scan = new Scanner(System.in);
		// if (scan.hasNextDouble())
		// {
		// input = scan.nextDouble();
		// if (input > 0)
		// System.out.println("You entered a positive integer " + input);
		// else
		// {
		// System.out.println("You entered a negative integer " + input);
		// }
		// }
		// else
		// {
		// System.out.println("Please Enter Valid Integer");
		// }

		// Scanner scanner = new Scanner(System.in);
		//
		// int number;
		// do
		// {
		// System.out.print("Please enter a positive number: ");
		// while (!scanner.hasNextInt())
		// {
		// String input = scanner.next();
		// System.out.printf("\"%s\" is not a valid number.\n", input);
		// }
		// number = scanner.nextInt();
		// }
		// while (number < 0);
		//
		// System.out.printf("You have entered a positive number %d.\n",
		// number);
		// }

		// For educational purposes. Uncomment to use. Not needed for the
		// overall
		// program.
		//
		// public void print_Matrix_Column_Traversal()
		// {
		// for (int n = 0; n < mat.get_My_Matrix()[0].length; n++)
		// {
		// for (int m = 0; m < mat.get_My_Matrix().length; m++)
		// {
		// System.out.println(mat.get_My_Matrix()[m][n] + "\t");
		// }
		// System.out.println();
		// }

		// Code below was part of Reduced_Echelon_Calculator. This was
		// refactored to be much shorter.
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
