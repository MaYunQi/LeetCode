package Algorithm.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class NQueens {
    public List<List<String>> solveNQueens(int n)
    {
        List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                board[i][j] = '.';
            }
        }
        backtracking(n,0,board,result);
        return result;
    }
    private void backtracking(int n,int row,char[][] board,List<List<String>> result)
    {
        if(row == n)
        {
            result.add(convertBoardToList(board,n));
            return;
        }
        for(int col = 0;col<n;col++)
        {
            if(isSafe(row,col,board,n))
            {
                board[row][col] = 'Q';
                backtracking(n,row+1,board,result);
                board[row][col] = '.';
            }
        }
    }
    private boolean isSafe(int row,int col,char[][] board,int n)
    {
        for(int i = 0;i<n;i++)
        {
            if(board[i][col] == 'Q')
                return false;
        }
        for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--)
        {
            if(board[i][j] == 'Q')
                return false;
        }
        for(int i=row-1,j=col+1;i>=0&&j<n;i--,j++)
        {
            if(board[i][j] == 'Q')
                return false;
        }
        return true;
    }
    private List<String> convertBoardToList(char[][] board,int n)
    {
        List<String> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<n;i++)
        {
            char[] chars = board[i];
            result.add(new String(chars));
        }
        return result;
    }
}
