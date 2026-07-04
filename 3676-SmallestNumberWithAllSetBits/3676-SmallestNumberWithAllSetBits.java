// Last updated: 7/4/2026, 7:42:19 PM
class Solution {
    public int smallestNumber(int n) {
        while ((n & (n + 1)) != 0) {  
          n++; 
}
     return n;
        
    }
}