package DataStructure.Number;

import java.util.HashMap;

public class IntegerAndRoman {
    public String intToRoman(int num)
    {
        StringBuilder roman = new StringBuilder();
        int[] values={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] strs={"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        for(int i=0;i<values.length;i++)
        {
            while(num>=values[i])
            {
                num-=values[i];
                roman.append(strs[i]);
            }
        }
        return roman.toString();
    }
    public int romanToInt(String s) {
        HashMap<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);
        int total = 0;
        int pre=0;
        for (int i = s.length() - 1; i >= 0; i--)
        {
            int currentValue = romanValues.get(s.charAt(i));

            if (currentValue < pre) {
                total -= currentValue;
            } else {
                total += currentValue;
            }

            pre = currentValue;
        }

        return total;
    }
}
