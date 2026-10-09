class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        List<Integer> list=new ArrayList<>();
        for(int x:asteroids){
            list.add(x);
        }
        int i=0;
        while(i<list.size()){
            if(list.get(i)<0 && i>0 && list.get(i-1)>0){
                if(Math.abs(list.get(i))>list.get(i-1)){
                    i--;
                    list.remove(i);
                }
                else if(Math.abs(list.get(i))==list.get(i-1)){
                    list.remove(i);
                    list.remove(i-1);
                    i=Math.max(0,i-1);
                }
                else
                    list.remove(i);
            }
            else
                i++;
        }
        int ans[]=new int[list.size()];
        for(int j=0;j<ans.length;j++){
            ans[j]=list.get(j);
        }
        return ans;
    }
}