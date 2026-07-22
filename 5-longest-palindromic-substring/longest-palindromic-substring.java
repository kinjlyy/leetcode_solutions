class Solution {
    public String longestPalindrome(String s) {
        if (s.length() <= 1) return s;

        int max = 1;
        StringBuilder sb = new StringBuilder(s.substring(0, 1));

        for (int i = 0; i < s.length(); i++) {

            // Odd length palindrome
            int l = i;
            int r = i;

            while (l >= 0 && r < s.length() &&
                   s.charAt(l) == s.charAt(r)) {

                if (r - l + 1 > max) {
                    sb = new StringBuilder(s.substring(l, r + 1));
                    max = r - l + 1;
                }

                l--;
                r++;
            }

            // Even length palindrome
            l = i;
            r = i + 1;

            while (l >= 0 && r < s.length() &&
                   s.charAt(l) == s.charAt(r)) {

                if (r - l + 1 > max) {
                    sb = new StringBuilder(s.substring(l, r + 1));
                    max = r - l + 1;
                }

                l--;
                r++;
            }
        }

        return sb.toString();
    }
}