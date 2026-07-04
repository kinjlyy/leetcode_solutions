// Last updated: 7/4/2026, 7:40:15 PM
class Solution {
    public int[] minDistinctFreqPair(int[] nums) {
        Map<Integer, Integer> map= new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
            
        }
        if(map.size()<2) return new int[]{-1,-1};
        List<Integer> val= new ArrayList<>(map.keySet());
        Collections.sort(val);
        for(int i=0;i<val.size();i++){
            for(int j=i+1;j<val.size();j++){
            int x=val.get(i);
            int y=val.get(j);
            if(!map.get(x).equals(map.get(y)))return new int[] {x,y};
        }}
        
    
    return new int[]{-1,-1};}
}