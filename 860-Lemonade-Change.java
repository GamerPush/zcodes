class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five=0,ten=0;
        for(int num:bills){
            if(num==5)
                five++;
            else if(num==10){
                if(five==0)
                    return false;
                ten++;five--;
            }
            else if(num==20){
                if(ten>0 && five>0){
                    ten--;five--;
                }
                else if(five>=3)
                    five-=3;
                else
                    return false;
            }
        }
        return true;
    }
}