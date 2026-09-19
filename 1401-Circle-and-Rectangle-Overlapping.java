class Solution {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        int closestX=Math.max(x1,Math.min(xCenter,x2)),closestY=Math.max(y1,Math.min(yCenter,y2));
        double distance=Math.pow((Math.pow(closestX-xCenter,2)+Math.pow(closestY-yCenter,2)),0.5);
        if(distance<=radius)
            return true;
        return false;
    }
}