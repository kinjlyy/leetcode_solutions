// Last updated: 7/4/2026, 7:40:12 PM
class Solution {
    public int[] scoreValidator(String[] events) {
        int c=0;
        int s=0;
        for(int i=0;i<events.length;i++){
            if(c==10) break;
            String str=events[i];
            if(str.equals("W")) c++;
            else if(str.equals("NB") || str.equals("WD")) s++;
            else s+=Integer.parseInt(str);
        }
    
    return new int[]{s,c};}
}
