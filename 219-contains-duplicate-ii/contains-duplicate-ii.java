class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                ArrayList<Integer> numberIndexes = map.get(nums[i]);
                numberIndexes.add(i);
                if (numberIndexes.size() >= 2 && numberIndexes.get(numberIndexes.size() - 1) - numberIndexes.get(numberIndexes.size() - 2) <= k) {
                    return true;
                }
            } else {
                ArrayList<Integer> keyNums = new ArrayList<>();
                keyNums.add(i);
                map.put(nums[i], keyNums);
            }
        }
        return false;
    }
}