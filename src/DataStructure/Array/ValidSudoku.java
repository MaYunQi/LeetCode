package DataStructure.Array;

import java.util.HashSet;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board)
    {
        HashSet<String> set = new HashSet<>();
        for(int i = 0; i < 9; i++)
        {
            for(int j = 0; j < 9; j++)
            {
                char c=board[i][j];
                if(c!='.')
                {
                    String rowKey="row"+i+c;
                    String colKey="col"+j+c;
                    String boxKey="box"+(i / 3) + (j / 3)+c;
                    if(!set.add(rowKey) || !set.add(colKey) || !set.add(boxKey))
                        return false;
                }
            }
        }
        return true;
    }
}
