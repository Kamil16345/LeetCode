class Solution {
    public int hammingWeight(int n) {
        int result=0;
        while(n!=0){
            result++;
            n=n&n-1;
        }
        return result;
    }
}