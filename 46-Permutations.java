class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> current=new ArrayList<>();
        List<List<Integer>> result=new ArrayList<>();
        boolean used[]=new boolean[nums.length];
        backtrack(nums,used,current,result);
        return result;
    }
    public void backtrack(int nums[],boolean used[],List<Integer> current,List<List<Integer>> result){
        if(current.size()==nums.length){
            result.add(new ArrayList<>(current));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(used[i])
                continue;
            
            current.add(nums[i]);//found
            used[i]=true;

            backtrack(nums,used,current,result);//explore

            current.remove(current.size()-1);//undo
            used[i]=false;
        }
    }
}