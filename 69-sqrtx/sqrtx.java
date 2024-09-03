class Solution {
    public int mySqrt(int x) {
        double sqrt = Math.sqrt(x);
        double floor = Math.floor(sqrt);
        return (int)floor;
    }
}