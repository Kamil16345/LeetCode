class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        ArrayList<Integer> mergedList = new ArrayList<>();
        int[] removedZeroes1 = removeTrailingZeroes(nums1);
        System.out.println("removedZeroes1: " + Arrays.toString(removedZeroes1));
        int[] removedZeroes2 = removeTrailingZeroes(nums2);
        System.out.println("removedZeroes2: " + Arrays.toString(removedZeroes2));
        for(int element : removedZeroes1){
                mergedList.add(element);
        }
        for(int element : removedZeroes2){
                mergedList.add(element);
        }
        System.out.println("legth: " + mergedList.size());
        Collections.sort(mergedList);
        for (int i = 0; i < mergedList.size(); i++) {
            nums1[i] = mergedList.get(i);
        }
    }

    public int[] removeTrailingZeroes(int[] numbers) {
//        System.out.println("In: " + Arrays.toString(numbers));
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
//        System.out.println("Out: " + Arrays.toString(nonTrailingZeroesArray));
        return nonTrailingZeroesArray;
    }
}