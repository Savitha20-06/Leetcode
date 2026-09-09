class Solution 
{
    public List<List<String>> solveNQueens(int n) 
    {
      List<List<String>> result=new ArrayList<>();
      char[][] board=new char[n][n];
      for(int i=0;i<n;i++)
      {
        for(int j=0;j<n;j++)
        {
            board[i][j]='.';
        }
      }
      solve(0,board,n,result);
      return result;
    }
    static void solve(int row,char[][] board,int n,List<List<String>> result)
    {
        if(row==n)
        {
            ArrayList<String> ans=new ArrayList<>();
            for(int i=0;i<row;i++)
            {
               ans.add(new String(board[i]));
            }
            result.add(ans);
            return;
        }
    
        for(int col=0;col<n;col++)
        {
            if(isSafe(row,col,board,n))
            {
                board[row][col]='Q';
                solve(row+1,board,n,result);
                board[row][col]='.';
            }
        }
    }
    static boolean isSafe(int row,int col,char[][] board,int n)
    {
        for(int i=0;i<row;i++)
        {
            if(board[i][col]=='Q')
            return false;
        }
        int i=row-1;
        int j=col-1;
        while(i>=0 && j>=0)
        {
            if(board[i][j]=='Q')
            return false;
            i--;
            j--;
        }
        i=row-1;
        j=col+1;
        while(i>=0 && j<n)
        {
            if(board[i][j]=='Q')
            return false;
            i--;
            j++;
        }
        return true;
    }
}

