package DataStructure.Array;


public class MedianOfTwoSortedArray {
    public double findMedianSortedArrays(int[] nums1, int[] nums2)  {
        if(nums1.length > nums2.length)
            return findMedianSortedArrays(nums2, nums1);
        int m = nums1.length;
        int n = nums2.length;
        int totalLeft=(m+n+1)/2;
        int left=0,right=m;
        while(left<=right)
        {
            int partition1 =left+ (right-left)/2;
            int partition2 =totalLeft-partition1;
            int left1=(partition1==0)?Integer.MIN_VALUE:nums1[partition1-1];
            int right1=(partition1==m)?Integer.MAX_VALUE:nums1[partition1+1];
            int left2=(partition2==0)?Integer.MIN_VALUE:nums2[partition2-1];
            int right2=(partition2==m)?Integer.MAX_VALUE:nums2[partition2+1];
            if(left1<=right2&&left2<=right1)
            {
                if((m+n)%2==0)
                    return (Math.max(left1,left2)+Math.max(right1,right2))/2.0;
                else
                    return Math.max(left1,left2);
            }
            else if(left1>right2)
                right=partition1-1;
            else
                left=partition1+1;
        }
        return 0;
    }

}
