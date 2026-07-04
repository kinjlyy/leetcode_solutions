// Last updated: 7/4/2026, 7:40:56 PM
class Solution {
    public boolean scoreBalance(String s) {
         if (s == null || s.length() < 2) return false;
        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            total += (s.charAt(i) - 'a' + 1);
        }
        int left = 0;
        // iterate until second-last char so right part is non-empty
        for (int i = 0; i < s.length() - 1; i++) {
            left += (s.charAt(i) - 'a' + 1);
            if (left == total - left) return true;
        }
        return false;
    }
}