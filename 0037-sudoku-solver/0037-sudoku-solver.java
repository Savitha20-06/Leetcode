class Solution 
{
    public void solveSudoku(char[][] board) 
    {
        solve(board);
    }
    static boolean solve(char[][] board)
    {
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board.length;j++)
            {
                if(board[i][j]=='.')
                {
                    for(char num='1';num<='9';num++)
                    {
                        if(isValid(i,j,board,num))
                        {
                            board[i][j]=num;
                            if(solve(board))
                            {
                                return true;
                            }
                            board[i][j]='.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    static boolean isValid(int row,int col,char[][] board,char num)
    {
        for(int i=0;i<9;i++)
        {
            if(board[row][i]==num)
            {
                return false;
            }
        }
        for(int i=0;i<9;i++)
        {
            if(board[i][col]==num)
            {
                return false;
            }
        }
        int startrow=row/3*3;
        int startcol=col/3*3;
        for(int i=startrow;i<startrow+3;i++)
        {
            for(int j=startcol;j<startcol+3;j++)
            {
                if(board[i][j]==num)
                {
                    return false;
                }
            }
        }
        return true;
    }
}