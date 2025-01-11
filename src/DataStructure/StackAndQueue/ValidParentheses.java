package DataStructure.StackAndQueue;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s)
    {
        if(s==null)
            return false;
        if(s.startsWith(")")||s.startsWith("}")||s.startsWith("]"))
            return false;
        if(s.length()%2!=0)
            return false;
        Stack<Character> stack = new Stack<Character>();
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(c=='('||c=='{'||c=='[')
                stack.push(c);
            else if(stack.isEmpty())
                return false;
            else if(c==')')
            {
                if(stack.peek()=='(')
                    stack.pop();
                else
                    return false;
            }
            else if(c=='}')
            {
                if(stack.peek()=='{')
                    stack.pop();
                else
                    return false;
            }
            else if(c==']')
            {
                if(stack.peek()=='[')
                    stack.pop();
                else
                    return false;
            }
        }
        return stack.isEmpty();
    }
}
