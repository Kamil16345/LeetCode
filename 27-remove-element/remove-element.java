class Solution {
    public int removeElement(int[] nums, int val) {
        int end=nums.length;
        int start=0;
        while(end>start){
            if(nums[end-1]==val){
                end--;
            }else if(nums[start]==val){
                nums[start]=nums[end-1];
                start++;
                end--;
            }else{
                start++;
            }
        }
        return end;
    }
}