// Last updated: 7/4/2026, 7:40:42 PM
class Solution {
    public int[] minOperations(int[] nums) {
        int n=nums.length;
        int[] ans= new int[n];
        for(int i=0;i<n;i++){
            int x=nums[i];
            int d=0;
            while(true){
                if(pal(x-d)){ans[i]=d; break;}
                if(pal(x+d)){ans[i]=d; break;}
                d++;
            }
        }
        return ans;
        
    }
    public boolean pal(int x){
        if(x<=0) return false;
        String b= Integer.toBinaryString(x);
        int i=0;
        int j=b.length()-1;
        while(i<j){
            if(b.charAt(i++)!=b.charAt(j--)) return false;
        }
        return true;
    }
}