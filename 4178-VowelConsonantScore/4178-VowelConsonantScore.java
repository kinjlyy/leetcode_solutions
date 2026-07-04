// Last updated: 7/4/2026, 7:40:20 PM
class Solution {
    public int vowelConsonantScore(String s) {
        int n=s.length();
        int v=0,co=0;
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(c=='a' || c=='e'|| c=='i' || c=='o' || c=='u'){
                v++;
            }
            else if(c>=97 && c<=122){
                co++;
            }
        }
        double score;
        return co>0?(int)Math.floor(v/co):0;
        
    }
}