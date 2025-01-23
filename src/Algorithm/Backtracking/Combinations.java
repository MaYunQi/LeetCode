package Algorithm.Backtracking;
import java.util.ArrayList;
import java.util.List;
public class Combinations
{
    public List<List<Integer>> combine(int n, int k)
    {
        List<List<Integer>> result = new ArrayList<>();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++)
        {
            nums[i] = i+1;
        }
        List<Integer> list= new ArrayList<>();
        backtracking(nums,k,list,result);
        return result;
    }
    private void backtracking(int[] nums,int k,List<Integer> list,List<List<Integer>> result)
    {
        if(list.size()==k)
        {
            result.add(new ArrayList<>(list));
            return;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(list.contains(nums[i]))
                break;
            list.add(nums[i]);
            backtracking(nums,k,list,result);
            list.remove(list.size()-1);
        }
    }
}
