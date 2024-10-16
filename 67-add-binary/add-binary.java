class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int aIndex = a.length() - 1;
        int bIndex = b.length() - 1;
        int carry = 0;
        while(aIndex>=0 || bIndex>=0||carry==1){
            if(aIndex>=0){
                carry+=a.charAt(aIndex--)-'0';
            }
            if(bIndex>=0){
                carry+=b.charAt(bIndex--)-'0';
            }
            sb.append(carry%2);
            carry=carry/2;
        }
        return sb.reverse().toString();
    }
}