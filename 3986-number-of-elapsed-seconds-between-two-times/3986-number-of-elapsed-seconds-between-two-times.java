class Solution 
{ 
    private int sec(String time)
    {
        String[] t= time.split(":");
        int hour = Integer.parseInt(t[0]);
        int min = Integer.parseInt(t[1]);
        int sec = Integer.parseInt(t[2]);

        int res = hour*3600 + min*60 + sec;
        return res;
    }
    public int secondsBetweenTimes(String startTime, String endTime) 
    {
        int time1 = sec(startTime);
        int time2 = sec(endTime);

        return time2 - time1;   
    }
}