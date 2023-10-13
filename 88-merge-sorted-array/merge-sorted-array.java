class Solution {
public void merge(int[] nums1, int m, int[] nums2, int n) {
        ArrayList<Integer> mergedList = new ArrayList<>();
        int[] removedZeroes1 = removeTrailingZeroes(nums1);
        int[] removedZeroes2 = removeTrailingZeroes(nums2);
        for(int element : removedZeroes1){
                mergedList.add(element);
        }
        for(int element : removedZeroes2){
                mergedList.add(element);
        }
        Collections.sort(mergedList);
        for (int i = 0; i < mergedList.size(); i++) {
            nums1[i] = mergedList.get(i);
        }
    }

    public int[] removeTrailingZeroes(int[] numbers) {
        int lastNonZeroIndex = numbers.length;
        for (int i = numbers.length-1; i>=0; i--) {
            if(numbers[i] != 0){
                break;
            }
            lastNonZeroIndex=i;
        }
        int[] nonTrailingZeroesArray = new int[lastNonZeroIndex];
        for (int i = 0; i < nonTrailingZeroesArray.length; i++) {
            nonTrailingZeroesArray[i]=numbers[i];
        }
        return nonTrailingZeroesArray;
    }
}