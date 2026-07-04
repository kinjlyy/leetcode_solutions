// Last updated: 7/4/2026, 7:42:53 PM
class Solution {
    public boolean canAliceWin(int[] nums) {
        int num1=0;
        int num2=0;
        for(int num:nums){
            if((num<10)) num1+=num;
            else num2+=num;
            
        }
        if(num1==num2){
            return false;
        }
        return true;
        
    }
}