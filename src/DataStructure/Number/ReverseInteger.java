package DataStructure.Number;

public class ReverseInteger {
    public int reverse(int x){
        int sign=x>0?1:-1;
        x=Math.abs(x);
        int result=0;
        while(x!=0)
        {
            if(result>(Integer.MAX_VALUE-x%10)/10)
                return 0;
            result=result*10+x%10;
            x=x/10;
        }
        return result*sign;
    }
}
