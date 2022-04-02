public class SmartMove extends NextMove { 
  @Override
  public Move getNextMove(char board[][]) {
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[0].length; j++) {
        if (board[i][j] == ' ') { // space is blank
          if (board[i][(j+1)%3] == board[i][(j+2)%3] && board[i][(j+1)%3] != ' ') { // other spaces in row are identical and non-blank
            // System.out.printf("%d: %d, %d, %d\n", i, j, (j+1)%3, (j+2)%3);
            return new Move(i,j);
          }
        }
      }  
    }
    return super.getNextMove(board);
  }
}