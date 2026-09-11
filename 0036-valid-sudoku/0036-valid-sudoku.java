class Solution 
{
    public boolean isValidSudoku(char[][] board) 
    {
        HashSet<String> set=new HashSet<>();
        int n=board.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(board[i][j]=='.')
                {
                    continue;
                }
                String row="r"+i+""+board[i][j];
                String col="c"+j+""+board[i][j];
                int box=(i/3)*3+(j/3);
                String num=box+""+board[i][j];
                if(set.contains(row) || set.contains(col) || set.contains(num))
                {
                    return false;
                }
                set.add(row);
                set.add(col);
                set.add(num);
            }
        }
        return true;
    }
}