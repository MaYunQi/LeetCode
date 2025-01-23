package Algorithm.Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target)
    {
        List<List<Integer>> result = new ArrayList<>();
        if(candidates == null || candidates.length == 0)
            return result;
        List<Integer> temp = new ArrayList<>();
        backtracking(result,temp,candidates,target,0);
        return result;
    }
    public void backtracking(List<List<Integer>> res,List<Integer> temp,int[] candidates,int target,int index)
    {
        if(target == 0)
        {
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int i=index;i<candidates.length;i++)
        {
            if(candidates[i] > target)
                continue;
            temp.add(candidates[i]);
            backtracking(res,temp,candidates,target-candidates[i],i);
            temp.remove(temp.size()-1);
        }
    }
}
