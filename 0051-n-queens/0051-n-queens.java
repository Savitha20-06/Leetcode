// class Solution 
// {
//     public List<List<String>> res=new ArrayList<>();
//     public List<List<String>> solveNQueens(int n) 
//     {
//         char board[][]=new char[n][n];
//         for(int i=0;i<n;i++)
//         {
//             Arrays.fill(board[i],'.');
//         }
//         backtrack(board,0);
//         return res;
//     }
//     public void backtrack(char board[][],int row)
//     {
//         if(row==board.length)
//         {
//             ArrayList<String> l=new ArrayList<>();
//             for(int i=0;i<board.length;i++)
//             {
//                 l.add(new String(board[i]));
//             }
//             res.add(l);
//             return;
//         }
//         for(int col=0;col<board[row].length;col++)
//         {
//             if(isSafe(board,row,col))
//             {
//                 board[row][col]='Q';
//                 backtrack(board,row+1);
//                 board[row][col]='.';
//             }
//         }
//     }
//         public boolean isSafe(char board[][],int row,int col)
//         {
//             for(int i=0;i<row;i++)
//             {
//                 if(board[i][col]=='Q')
//                 return false;
//                 for(int j=0;j<board[row].length;j++)
//                 {
//                     if(board[i][j]=='Q')
//                     {
//                         if(Math.abs(row-i)==Math.abs(col-j))
//                         return false;
//                     }
//                 }
//             }
//             return true;
//         }
//     }


class Solution {
    
    public List<List<String>> solveNQueens(int n) {
        
        List<List<String>> result = new ArrayList<>();
        
        char[][] board = new char[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        
        solve(0, board, n, result);
        
        return result;
    }
    
    static void solve(int row, char[][] board, int n,
                      List<List<String>> result) {
        
        if (row == n) {
            List<String> list = new ArrayList<>();
            
            for (int i = 0; i < n; i++) {
                list.add(new String(board[i]));
            }
            
            result.add(list);
            return;
        }
        
        for (int col = 0; col < n; col++) {
            
            if (isSafe(row, col, board, n)) {
                
                board[row][col] = 'Q';
                
                solve(row + 1, board, n, result);
                
                board[row][col] = '.';
            }
        }
    }
    
    static boolean isSafe(int row, int col,
                          char[][] board, int n) {
        
        // Check column
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        
        // Check upper-left diagonal
        int i = row - 1;
        int j = col - 1;
        
        while (i >= 0 && j >= 0) {
            if (board[i][j] == 'Q') {
                return false;
            }
            i--;
            j--;
        }
        
        // Check upper-right diagonal
        i = row - 1;
        j = col + 1;
        
        while (i >= 0 && j < n) {
            if (board[i][j] == 'Q') {
                return false;
            }
            i--;
            j++;
        }
        
        return true;
    }
}