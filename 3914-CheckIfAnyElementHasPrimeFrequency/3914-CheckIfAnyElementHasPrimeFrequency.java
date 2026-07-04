// Last updated: 7/4/2026, 7:41:31 PM
class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num:nums){
            if(map.containsKey(num)) map.put(num,map.get(num)+1);
            else map.put(num,1);
        }
        for(int i:map.values()){
            if(prime(i)) return true;
        }
        return false;

        
    }
    public boolean prime(int i){
        if(i==1) return false;
        if(i==2) return true;
        for(int j=2;j<i;j++){
            if(i%j==0) return false;
        }
        return true;
    }
}