public class TokenPass
{
    private int[] board;
    private int currentPlayer;
    public TokenPass(int playerCount)
    {
        board = new int[playerCount];
        this.currentPlayer = (int) (Math.random()-1);
        for(int i = 0;  i<playerCount; i++)
        {
            board[i] = (int) (Math.random()*10+1);
        }
    }
    public void distributeCurrentPlayertokens()
    {
        int numberOfTokens = board[currentPlayer];
        for(int j = 0; numberOfTokens < j; j++)
        {
            currentPlayer += 1;
            for(int k = 0; numberOfTokens < k; k++)
            {
                board[currentPlayer] +=1;
                numberOfTokens -= 1;
            }
        }
    }
}
