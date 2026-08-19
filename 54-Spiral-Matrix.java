class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> list=new ArrayList<>();
        int top=0,left=0,bottom=matrix.length-1,right=matrix[0].length-1;
        spiral(matrix,bottom,top,left,right,list);
        return list;
    }
    public void spiral(int matrix[][],int bottom,int top,int left,int right,ArrayList<Integer> list){
        if(top>bottom || left>right)
            return;
        
        for(int i=left;i<=right;i++)
            list.add(matrix[top][i]);
        top++;

        for(int i=top;i<=bottom;i++)
            list.add(matrix[i][right]);
        right--;

        if(bottom>=top){           
            for(int i=right;i>=left;i--)
                list.add(matrix[bottom][i]);
            bottom--;
        }

        if(right>=left){           
            for(int i=bottom;i>=top;i--)
                list.add(matrix[i][left]);
            left++;
        }
        spiral(matrix,bottom,top,left,right,list);
    }
}