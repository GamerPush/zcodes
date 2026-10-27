class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob){
        int aliceStart=getDay(arriveAlice);
        int aliceEnd=getDay(leaveAlice);
        int bobStart=getDay(arriveBob);
        int bobEnd=getDay(leaveBob);
        int start=Math.max(aliceStart,bobStart);
        int end=Math.min(aliceEnd,bobEnd);
        if(start>end)
            return 0;
        return end-start+1;
    }
    static int getDay(String date){
        String s[]=date.split("-");
        int days=Integer.valueOf(s[1]);
        int month=Integer.valueOf(s[0]);
        int monthDays[]={31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for(int i=0;i<month-1;i++){
            days+=monthDays[i];
        }
        return days;
    }
}