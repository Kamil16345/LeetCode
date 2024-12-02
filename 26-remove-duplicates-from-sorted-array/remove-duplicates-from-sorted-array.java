class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        int pointer=0;
        for(int i=0; i<nums.length;i++){
            if(!seen.contains(nums[i])){
                seen.add(nums[i]);
                nums[pointer]=nums[i];
                pointer++;
            }
        }
        return pointer;
    }
}
// 1  1  2
// 0  1  2
// 0,0,1,1,1,2,2,3,3,4