class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans=new ArrayList<>();
        while(left<=right){
            isSelfDividing(left);
            if(isSelfDividing(left))
                ans.add(left);
            left++;
        }

        return ans;
    }
    public static boolean isSelfDividing(int left){
        int temp=left;
        while(left>0){
            int dig=left%10;
            if(dig==0||temp%dig!=0)
                return false;
            left/=10;
        }
        return true;
    }
}