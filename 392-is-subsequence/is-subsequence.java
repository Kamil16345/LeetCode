class Solution {
    public boolean isSubsequence(String s, String t) {
      if(s.length()==0 ){
        return true;
      }
      if(t.length()==0){
        return false;
      }
      int sPointer=0;
      for(int i=0; i<t.length(); i++){
        if(sPointer==s.length()-1 && t.charAt(i)==s.charAt(sPointer)){
            return true;
        }else if(t.charAt(i)==s.charAt(sPointer)){
            sPointer++;
        }
      }
      return false;
    }
}