public class TokenPass
{
    private int[] board;
    private int currentPlayer;
    public TokenPass(int playerCount)
    {
        board = new int[playerCount];
        currentPlayer = (int) (Math.random()-1);
        for(int i = 0;  i<playerCount; i++)
        {
            board[i] = (int) (Math.random()*10+1);
        }
    }
    public void distributeCurrentPlayerTokens()
    {
        int numberOfTokens = board[currentPlayer];
        for(int k = 0; numberOfTokens > k; k++) {
            nextPlayer();
            board[currentPlayer] += 1;
            numberOfTokens -= 1;
        }
    }
    public void printBoard()
    {
        for(int i = 0; i< board.length; i++)
        {
            System.out.println("[" + board[i] + "]");
        }
    }
    public void nextPlayer()
    {
        int nextPlayer = currentPlayer;
        nextPlayer = (nextPlayer +1) % board.length;
    }
    public int gameOver()
    {
        boolean gameOn = true;
        while (gameOn)
        {
            if (board[currentPlayer] == 0)
            {
                gameOn = false;
            }
        }
        return currentPlayer;
    }
}
