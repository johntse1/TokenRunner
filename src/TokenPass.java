public class TokenPass
{
    private int[] board;
    private int currentPlayer;
    public TokenPass(int playerCount)
    {
        this.board = new int[playerCount];
        for(int i = 0;  i<playerCount; i++)
        {
            board[i] = (int) (Math.random()*10)+1;
        }
        currentPlayer = (int) (playerCount * Math.random()-1);
    }
    public void distributeCurrentPlayerTokens()
    {
        int nextPlayer = currentPlayer;
        int numberOfTokens = board[currentPlayer];
        board[currentPlayer] = 0;
        while (numberOfTokens > 0)
        {
            nextPlayer = (nextPlayer+1) % board.length;
            board[currentPlayer]++;
            numberOfTokens--;
        }
    }
    public void printBoard()
    {
        for(int i = 0; i< board.length; i++)
        {
            System.out.println("player" + i + " " + board[i]);
        }
        System.out.println(currentPlayer);
    }
    public void nextPlayer()
    {
        currentPlayer++;
        if(currentPlayer == board.length)
        {
            currentPlayer = 0;
        }
    }
    public int gameOver()
    {
        int loop = -1;
        for(int i = 0; i < board.length; i++)
        {
            if(board[i] == 0)
            {
                loop = i;
            }
        }
        return loop;
    }
}
