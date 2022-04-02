public class NextMove {
  public Move getNextMove(char board[][]) {
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[0].length; j++) {
        if (board[i][j] == ' ') {
          return new Move(i,j);
        }
      }  
    }
    return new Move(-1,-1);
  }
}