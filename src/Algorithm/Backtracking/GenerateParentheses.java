package Algorithm.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public List<String> generateParenthesis(int n)
    {
        List<String> res = new ArrayList<>();
        backtracking(res,new StringBuilder(),0,0,n);
        return res;
    }
    private void backtracking(List<String> result,StringBuilder sb,int open,int close,int max)
    {
        if(sb.length()==max*2)
        {
            result.add(sb.toString());
            return;
        }
        if(open<max)
        {
            sb.append('(');
            backtracking(result,sb,open+1,close,max);
            sb.deleteCharAt(sb.length()-1);
        }
        if(close<open)
        {
            sb.append(')');
            backtracking(result,sb,open,close+1,max);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
