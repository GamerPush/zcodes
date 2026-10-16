class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1 || numRows>=s.length())
            return s;
        char a[][]=new char[numRows][s.length()];
        boolean goingDown=true;
        int row=0,col=0;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            a[row][col]=s.charAt(i);
            if(goingDown){
                if(row==numRows-1){
                    row--;col++;
                    goingDown=false;
                }
                else
                    row++;
            }
            else{
                if(row==0){
                    row++;
                    goingDown=true;
                }
                else
                    row--;col++;
            }
        }
        for(int i=0;i<numRows;i++){
            for(int j=0;j<s.length();j++){
                if(a[i][j]!='\u0000'){
                    sb.append(a[i][j]);
                }
            }
        }
        return sb.toString();
    }
}