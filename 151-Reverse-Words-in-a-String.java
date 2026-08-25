class Solution {
    public String reverseWords(String s) {
        s=s.trim().replaceAll("\\s+"," ");
        String []str=s.split(" ");
        StringBuilder sb=new StringBuilder();
        for(int i=str.length-1;i>=0;i--){
            sb.append(str[i]);
            if(i!=0)
                sb.append(" ");
        }
        String strs=sb.toString();
        return strs;
    }
}