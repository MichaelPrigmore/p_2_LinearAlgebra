import java.util.ArrayList;
import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class LinearAlgebraApp
{
	private Matrix_Manager mat;

	public LinearAlgebraApp()
	{

	}

	public void print_Matrix(Matrix_Manager manager)
	{
		double[][] table = manager.get_My_Matrix();

		for (int m = 0; m < table.length; m++)
		{
			for (int n = 0; n < table[m].length; n++)
			{
				StdOut.print(table[m][n] + "\t");
			}
			StdOut.print("\n");
		}
	}

	public static void main(String[] args)
	{

	}

}
