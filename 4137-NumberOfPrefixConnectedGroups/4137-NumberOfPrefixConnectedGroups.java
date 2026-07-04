// Last updated: 7/4/2026, 7:40:30 PM
class Solution {
    public int prefixConnected(String[] words, int k) {
        HashMap<String,Integer> map= new HashMap<>();
        for(String word:words){
            if(word.length()>=k){
                String pre=word.substring(0,k);
                map.put(pre,map.getOrDefault(pre,0)+1);
            }
        }
        int count=0;
        for(int fre:map.values()){
            if(fre>=2){
                count++;}            
        }
    return count;
        
    }
}