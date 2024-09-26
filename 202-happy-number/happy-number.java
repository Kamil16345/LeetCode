class Solution {
    public static boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        while(!seen.contains(n)){
            if(n==1){
                return true;
            }
            seen.add(n);
            n=getNext(n);
        }
        return false;
    }

    private static int getNext(int n) {
        int sum=0;
        while(n>0){
            int i = n % 10;
            sum+=i*i;
            n=n/10;
        }
        return sum;
    }
}