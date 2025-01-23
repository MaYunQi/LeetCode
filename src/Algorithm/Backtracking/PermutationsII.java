package Algorithm.Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationsII {
    public List<List<Integer>> permute(int[] nums)
    {
        Arrays.sort(nums);
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        boolean[] visited=new boolean[nums.length];
        backtracking(nums,list,result,visited);
        return result;
    }
    public void backtracking(int[] nums,List<Integer> list,List<List<Integer>> result,boolean[] visited)
    {
        if(list.size()==nums.length)
        {
            result.add(new ArrayList<>(list));
            return;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(visited[i])
                continue;
            if(i>0&&nums[i]==nums[i-1]&&!visited[i-1])
                continue;
            visited[i]=true;
            list.add(nums[i]);
            backtracking(nums,list,result,visited);
            visited[i]=false;
            list.remove(list.size()-1);
        }
    }
}
