class Solution {
    public int[][] generateMatrix(int n) {
        int top=0,bottom=n-1,left=0,right=n-1,j=1;
        int m[][]=new int[n][n];
        spiral(m,n,j,top,bottom,left,right);
        return m;
    }
    static void spiral(int [][]m,int n,int j,int top,int bottom,int left,int right){
        if(top>bottom || left>right)
            return;

        for(int i=left;i<=right;i++)
            m[top][i]=j++;
        top++;

        for(int i=top;i<=bottom;i++)
            m[i][right]=j++;
        right--;

        if(bottom>=top){
            for(int i=right;i>=left;i--)
                m[bottom][i]=j++;
            bottom--;

        }
        if(left<=right){
            for(int i=bottom;i>=top;i--)
                m[i][left]=j++;
            left++;
        }
        spiral(m,n,j,top,bottom,left,right);
    }
}