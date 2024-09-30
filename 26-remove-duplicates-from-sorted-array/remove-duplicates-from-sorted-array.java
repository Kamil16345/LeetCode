class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(!seen.contains(nums[i])){
                seen.add(nums[i]);
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }
}