package Algorithm.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public List<List<Integer>> permute(int[] nums)
    {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        backtracking(nums,list,result);
        return result;
    }
    public void backtracking(int[] nums,List<Integer> list,List<List<Integer>> result)
    {
        if(list.size()==nums.length)
        {
            result.add(new ArrayList<>(list));
            return;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(list.contains(nums[i]))
                continue;
            list.add(nums[i]);
            backtracking(nums,list,result);
            list.remove(list.size()-1);
        }
    }
}
