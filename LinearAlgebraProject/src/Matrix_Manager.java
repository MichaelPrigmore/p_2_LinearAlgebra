import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class Matrix_Manager
{
	private int number_Of_Rows_In_Matrix;
	private int number_Of_Columns_In_Matrix;
	private double[][] my_Matrix;

	public Matrix_Manager()
	{

	}

	public Matrix_Manager(int m, int n)
	{
		this.number_Of_Rows_In_Matrix = m;
		this.number_Of_Columns_In_Matrix = n;
		this.my_Matrix = new double[m][n];
	}

	public double get_Value_At_Index(int m, int n)
	{
		return this.my_Matrix[m][n];
	}

	public void set_Value_At_Index(int m, int n, double value)
	{
		this.my_Matrix[m][n] = value;
	}

	public static void main(String[] args)
	{
		double[][] array =
		{
				{ 1, 2, 300, 4 },
				{ 5, 6, 7, 8 } };

		// array[1] = 10;
		for (int m = 0; m < array.length; m++)
		{
			for (int n = 0; n < array[m].length; n++)
			{
				StdOut.print(array[m][n] + "\t");
			}
			StdOut.print("\n");
		}
	}

	public double[][] get_My_Matrix()
	{
		return this.my_Matrix;
	}

}
