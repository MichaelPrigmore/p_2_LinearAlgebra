package Domain_Logic;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class Matrix_Manager
{
	private int rows;
	private int columns;
	private double[][] my_Matrix;

	public Matrix_Manager()
	{
		this.rows = 2;
		this.columns = 2;
		this.my_Matrix = new double[rows][columns];
	}

	public Matrix_Manager(int m, int n)
	{
		this.rows = m;
		this.columns = n;
		this.my_Matrix = new double[m][n];
	}

	public void set_Rows_And_Columns(int m, int n)
	{
		this.rows = m;
		this.columns = n;
		this.my_Matrix = new double[m][n];
	}

	public void setMy_Matrix(double[][] my_Matrix)
	{
		this.my_Matrix = my_Matrix;
	}

	public void set_Value_At_Index(int m, int n, double value)
	{
		this.my_Matrix[m][n] = value;
	}

	public double[][] get_My_Matrix()
	{
		return this.my_Matrix;
	}

}
