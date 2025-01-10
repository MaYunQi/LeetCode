package DataStructure.String;

public class ZigzagConversion
{
    public String convert(String s, int numRows) {
        if(numRows == 1||numRows>=s.length())
            return s;
        StringBuilder res = new StringBuilder();
        int cycle=2*numRows-2;
        for(int row=0;row<numRows;row++)
        {
            for(int j=row;j<s.length();j+=cycle)
            {
                res.append(s.charAt(j));

                int diagonal=j+cycle-2*row;
                if(row!=0&&row!=numRows-1&&diagonal<s.length())
                    res.append(s.charAt(diagonal));
            }
        }
        return res.toString();
    }
}
