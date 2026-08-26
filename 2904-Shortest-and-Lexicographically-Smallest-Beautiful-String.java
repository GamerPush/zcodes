class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        List<Integer> list=new ArrayList<>();
        int count=0;
        if(!(s.contains("1")))
            return "";

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1')
                list.add(i);
        }
        if(list.size()<k)
            return "";
        String ans="";
        for(int i=0;i+k-1<list.size();i++){
            int first=list.get(i);
            int last=list.get(i+k-1);//current index to k distance 
            String res=s.substring(first,last+1);
            if(ans.equals("") ||
            res.length()<ans.length() ||
            (res.length()==ans.length() && res.compareTo(ans)<0))
                ans=res;
        }
        return ans;
    }
}