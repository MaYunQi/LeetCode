package Algorithm.Backtracking;

public class SudokuSolver
{
    public void solveSudoku(char[][] board)
    {
        solver(board);
    }
    private boolean solver(char[][] board)
    {
        for(int row = 0; row < 9; row++)
        {
            for(int col = 0; col < 9; col++)
            {
                if(board[row][col] == '.')
                {
                    for(char ch = '1'; ch <= '9'; ch++)
                    {
                        if(isValid(row,col,ch,board))
                        {
                            board[row][col] = ch;
                            if(solver(board))
                            {
                                return true;
                            }
                            board[row][col] = '.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    private boolean isValid(int row,int col, char number,char[][] board)
    {
        for(int i = 0;i<board.length;i++)
        {
            if(board[row][i] == number)
                return false;
        }
        for(int i = 0;i<board.length;i++)
        {
            if(board[i][col] == number)
                return false;
        }
        int startRow = row/3*3;
        int startCol = col/3*3;
        for(int i = startRow;i<startRow+3;i++)
        {
            for(int j =startCol;j<startCol+3;j++)
            {
                if(board[i][j] == number)
                    return false;
            }
        }
        return true;
    }
}
