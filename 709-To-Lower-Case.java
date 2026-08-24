class Solution {
    public String toLowerCase(String s) {
        char[] str = s.toCharArray();
        for(int i = 0;i<s.length();i++){
           if(str[i] >='A' && str[i] <='Z'){
            str[i] = (char)(str[i]+32);
           }
        }

        return new String(str);
    }
}