package DataStructure.String;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s)
    {
        int left=0;
        int length=0;
        HashSet<Character> set=new HashSet<>();
        for(int right=0;right<s.length();right++)
        {
            if(set.contains(s.charAt(right)))
            {
                set.remove(s.charAt(right));
                left++;
            }
            set.add(s.charAt(right));
            length=Math.max(length,right-left+1);
        }
        return length;
    }
}
