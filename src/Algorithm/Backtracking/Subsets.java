package Algorithm.Backtracking;
import java.util.ArrayList;
import java.util.List;
public class Subsets
{
    public List<List<Integer>> subsets(int[] nums)
    {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        backtraking(nums,0, subset, result);
        return result;
    }
    private void backtraking(int[] nums,int n,List<Integer> subset,List<List<Integer>> result)
    {
        result.add(new ArrayList<>(subset));

        for(int i = n;i<nums.length;i++)
        {
            subset.add(nums[i]);
            backtraking(nums,i+1,subset,result);
            subset.remove(subset.size()-1);
        }
    }
}
