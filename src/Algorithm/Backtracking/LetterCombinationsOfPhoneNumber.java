package Algorithm.Backtracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LetterCombinationsOfPhoneNumber
{
    public List<String> letterCombinations(String digits)
    {
        List<String> list = new ArrayList<String>();
        if(digits == null || digits.length() == 0)
            return list;
        StringBuilder sb=new StringBuilder();
        HashMap<Character, String> map = new HashMap<Character, String>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        Backtracking(list,map,sb,digits,0);
        return list;
    }
    public void Backtracking(List<String> list,HashMap<Character, String> map,StringBuilder sb,String digits,int index)
    {
        if(sb.length() == digits.length())
        {
            list.add(sb.toString());
            return;
        }
        String letters = map.get(digits.charAt(index));
        for(var chars : letters.toCharArray())
        {
            sb.append(chars);
            Backtracking(list,map,sb,digits,index+1);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
