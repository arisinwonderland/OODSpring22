public class Move
{
	private int m_row;
	private int m_col;

	public Move(int row, int col)
	{
		m_row = row;
		m_col = col;
	}

	public int getRow()
	{ return m_row; }

	public int getCol()
	{ return m_col; }

	@Override
	public String toString()
	{
		return String.format("Next move: %d, %d", m_row, m_col);
	}

}
