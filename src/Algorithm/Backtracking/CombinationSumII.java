package Algorithm.Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {
    public List<List<Integer>> combinationSum(int[] candidates, int target)
    {
        List<List<Integer>> result = new ArrayList<>();
        if(candidates == null || candidates.length == 0)
            return result;
        Arrays.sort(candidates);
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
            if(i>index && candidates[i] == candidates[i-1])
                continue;
            if(candidates[i] > target)
                break;
            temp.add(candidates[i]);
            backtracking(res,temp,candidates,target-candidates[i],i+1);
            temp.remove(temp.size()-1);
        }
    }
}
