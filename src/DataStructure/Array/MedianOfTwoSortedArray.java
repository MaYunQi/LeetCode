package DataStructure.Array;

import jdk.jshell.spi.ExecutionControl;

public class MedianOfTwoSortedArray {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) throws Exception {
        if(nums1.length > nums2.length)
            return findMedianSortedArrays(nums2, nums1);
        int m = nums1.length;
        int n = nums2.length;

        throw new Exception("Not implemented");
    }
}
