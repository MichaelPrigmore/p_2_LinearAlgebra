package Domain_Logic;

public class pivot_Indicies
{
	private int row_Pivot_Index;
	private int column_Pivot_Index;

	public pivot_Indicies()
	{

	}

	public pivot_Indicies(int row, int column)
	{
		this.row_Pivot_Index = row;
		this.column_Pivot_Index = column;
	}

	public int getRow_Pivot_Index()
	{
		return row_Pivot_Index;
	}

	public void setRow_Pivot_Index(int row_Pivot_Index)
	{
		this.row_Pivot_Index = row_Pivot_Index;
	}

	public int getColumn_Pivot_Index()
	{
		return column_Pivot_Index;
	}

	public void setColumn_Pivot_Index(int column_Pivot_Index)
	{
		this.column_Pivot_Index = column_Pivot_Index;
	}
}
