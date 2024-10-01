class Solution {
    public int majorityElement(int[] nums) {
if (nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        int max = 1;
        int num=nums[0];
        int currSeq = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1] != nums[i]) {
//                temp = nums[i];
                currSeq = 1;
//                num=nums[i];
            } else {
                currSeq++;
            }
            if (currSeq > max) {
                max = currSeq;
                num=nums[i];
            }
        }
        return num;
    }
}