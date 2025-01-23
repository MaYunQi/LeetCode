package Algorithm.Backtracking;

public class WordSearch
{
    public boolean exist(char[][] board, String word)
    {
        int row = board.length;
        int col = board[0].length;
        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < col; j++)
                if(backtracking(board,word,0,i,j))
                    return true;
        }
        return false;
    }
    private boolean backtracking(char[][] board,String word,int index,int row,int col)
    {
        if(index == word.length())
            return true;
        if (row < 0 || row >= board.length
                || col < 0 || col >= board[0].length
                || board[row][col] != word.charAt((index)))
            return false;
        char temp = board[row][col];
        board[row][col] = '#';
        boolean found = backtracking(board, word, index + 1, row + 1, col) || // 下
                backtracking(board, word, index + 1, row - 1, col) || // 上
                backtracking(board, word, index + 1, row, col + 1) || // 右
                backtracking(board, word, index + 1, row, col - 1);   // 左
        board[row][col] = temp;
        return found;
    }
}
