import java.util.Arrays;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int initialIndex = nums1.length-nums2.length;
        int zeroToIncrease=0;
        for (int i = initialIndex; i < nums1.length; i++) {
            nums1[i]=nums2[zeroToIncrease];
            zeroToIncrease++;
        }
        Arrays.sort(nums1);
    }
}