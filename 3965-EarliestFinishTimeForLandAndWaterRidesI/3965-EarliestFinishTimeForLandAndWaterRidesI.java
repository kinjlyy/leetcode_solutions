// Last updated: 7/4/2026, 7:41:18 PM
class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration,
                                   int[] waterStartTime, int[] waterDuration) {
        int minTime = Integer.MAX_VALUE;

        
        for (int i = 0; i < landStartTime.length; i++) {
            for (int j = 0; j < waterStartTime.length; j++) {
               
                int landStart = landStartTime[i];
                int landEnd = landStart + landDuration[i];
                int waterStart = Math.max(waterStartTime[j], landEnd);
                int finishTime = waterStart + waterDuration[j];
                minTime = Math.min(minTime, finishTime);

                
                int waterStartAlt = waterStartTime[j];
                int waterEnd = waterStartAlt + waterDuration[j];
                int landStartAlt = Math.max(landStartTime[i], waterEnd);
                int finishTimeAlt = landStartAlt + landDuration[i];
                minTime = Math.min(minTime, finishTimeAlt);
            }
        }

        return minTime;
    }
}