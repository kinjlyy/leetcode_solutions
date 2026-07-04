// Last updated: 7/4/2026, 7:40:11 PM
class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder str=  new StringBuilder();
        for(String word:words){
            int sum=0;
            for(char ch:word.toCharArray()){
                sum+=weights[ch-'a'];
            }
            int mod=sum%26;
            char mapp=(char)('z'-mod);
            str.append(mapp);
        }
        return str.toString();
       
        
    }
}