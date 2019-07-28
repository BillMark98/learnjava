public class EightQueen
{
    static int invalidPos = 1;
    static int QueensAt = 2;
    static int validPos = 0;
    static int[][] chessboard = new int[8][8];
    public static void startGame()
    {

    }
    public static void initialize(int[][] arr)
    {
        // assume the arr is 8 * 8 chess boards;
        for(int i = 0; i < 8; i++)
        {
            for(int j = 0; j < 8; j++)
            {
                arr[i][j] = validPos;
            }
        }
    }
    // given the queen at position x,y mark the row ,column, the diagonal 
    // where this queen could attack as invalid position
    public static void markInvalid(int posx,int posy,int[][]arr)
    {
        if(posx < 0 || posx > 7 || posy < 0 || posy > 7)
        {
            System.out.println("Invalid position of the queen.");
            System.exit(0);
        }
        arr[posx][posy] = QueensAt;
        // mark the row posx as invalid
        for(int col = 0; col < 7; col++)
        {
            if(col != posy)
            {
                arr[posx][col] = invalidPos;
            }
        }
        // mark the col posy as invalid;
        for(int row = 0; row < 7; row++)
        {
            if(row != posx)
            {
                arr[row][posy] = invalidPos;
            }
        }
        // mark the diagonal at left hand side as invalid
        int bound = min(posx,posy);
        
        {

        }
    }
    public static int min(int a, int b)
    {
        if(a < b) 
        {
            return a;
        }
        else
        {
            return b;
        }
    }

}