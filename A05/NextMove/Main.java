public class Main
{
	public static void main(String[] args)
	{
		NextMove brain = new SmartMove();

		// next move 1,1
		char board1[][] =
		{
			{'O', 'X', 'X'},
			{'O', ' ', ' '},
			{'X', ' ', 'O'}
		};

		// next move 2,1
		char board2[][] =
		{
			{'O', 'X', 'X'},
			{'O', 'X', 'O'},
			{'X', ' ', 'O'}
		};

		// next move 1,2
		char board3[][] =
		{
			{'O', 'X', 'X'},
			{'X', 'X', ' '},
			{'O', ' ', 'O'}
		};

		// next move 2,1
		char board4[][] =
		{
			{'O', ' ', 'X'},
			{'X', 'X', 'X'},
			{' ', 'O', 'O'}
		};

		// next move 2,2
		char board5[][] =
		{
			{'O', ' ', ' '},
			{' ', ' ', ' '},
			{'X', 'X', ' '}
		};

		Move mv = brain.getNextMove(board1);
		System.out.println(mv);
		mv = brain.getNextMove(board2);
		System.out.println(mv);
		mv = brain.getNextMove(board3);
		System.out.println(mv);
		mv = brain.getNextMove(board4);
		System.out.println(mv);
		mv = brain.getNextMove(board5);
		System.out.println(mv);
	}
}
