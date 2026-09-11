class Solution {
    public int totalNumbers(int[] digits) {
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<digits.length;i++){
            for(int j=0;j<digits.length;j++){
                for(int k=0;k<digits.length;k++){
                    if(digits[i]==0 || digits[k]%2==1)
                        continue;
                    if(i==j || j==k || i==k)
                        continue;
                    set.add(digits[i]*100+digits[j]*10+digits[k]);
                }
            }
        }
        return set.size();
    }
}