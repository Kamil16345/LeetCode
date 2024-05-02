import java.util.ArrayList;
import java.util.Collections;

//Task 88
public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = new int[]{2,5,6};
        int n = 3;
        merge(nums1, m, nums2, n);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
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

    public static int[] removeTrailingZeroes(int[] numbers) {
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
