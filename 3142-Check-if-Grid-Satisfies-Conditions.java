class Solution {
    public boolean satisfiesConditions(int[][] grid) {
        int rows=grid.length;
        int cols=grid[0].length;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(i<rows-1 && grid[i][j]!=grid[i+1][j])
                    return false;
                if(j<cols-1 && grid[i][j]==grid[i][j+1])
                    return false;
            }
        }
        return true;
    }
}