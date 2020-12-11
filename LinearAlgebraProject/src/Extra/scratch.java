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

		Scanner scanner = new Scanner(System.in);

		int number;
		do
		{
			System.out.print("Please enter a positive number: ");
			while (!scanner.hasNextInt())
			{
				String input = scanner.next();
				System.out.printf("\"%s\" is not a valid number.\n", input);
			}
			number = scanner.nextInt();
		}
		while (number < 0);

		System.out.printf("You have entered a positive number %d.\n", number);
	}
}
