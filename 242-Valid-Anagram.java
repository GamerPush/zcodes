class Solution {
    public boolean isAnagram(String s, String t) {
      if(s.length() != t.length()){
        return false;
      }
      char[] sarray = s.toCharArray();
      char[] tarray = t.toCharArray();
      Arrays.sort(sarray);
      Arrays.sort(tarray);
     for(int i = 0;i<s.length();i++){
        if(sarray[i] != tarray[i]){
            return false;
        }
     }
     return true;
    }
}