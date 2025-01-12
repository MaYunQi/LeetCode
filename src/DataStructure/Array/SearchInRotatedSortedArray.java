package DataStructure.Array;

public class SearchInRotatedSortedArray {
    public int search(int[] nums, int target)
    {
        if(nums == null || nums.length == 0)
            return -1;
        int start = 0, end = nums.length - 1;
        while(start <= end)
        {
            int mid=start + (end - start)/2;
            if(nums[mid] == target)
                return mid;
            if(nums[start]<=nums[mid])
            {
                if(nums[start]<target&&target<nums[mid])
                    end=mid-1;
                else if(nums[start]==target)
                    return start;
                else
                    start=mid+1;
            }
            else
            {
                if(nums[mid]<target&&target<nums[end])
                    start=mid+1;
                else if(nums[end]==target)
                    return end;
                else
                    end=mid-1;
            }
        }
        return -1;
    }
}
