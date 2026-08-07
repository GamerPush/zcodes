class Solution {
    public int firstUniqChar(String s) {
        int n=s.length();
        int []freq=new int[128];
        char []a=s.toCharArray();
        for(int i=0;i<n;i++){
            freq[a[i]]++;
        }
        for(int i=0;i<n;i++){
            if(freq[a[i]]==1){
                return i;
            }
        }
        return -1;
    }
}