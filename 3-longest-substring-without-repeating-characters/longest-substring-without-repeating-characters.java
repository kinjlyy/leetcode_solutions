class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set=new HashSet<>();
        if(s.length()==0) return 0;
        int i=0;
        int j=0;
        int max=1;
        while(j<s.length() && i<=j){
            char c=s.charAt(j);
            while(!set.isEmpty() && set.contains(c)) {
                set.remove(s.charAt(i));
                i++;
                }
            set.add(c);
            max=Math.max(max, j-i+1);
            j++;
        }
        return max;
        
    }
}