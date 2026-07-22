// Last updated: 7/22/2026, 9:54:40 PM
1class Solution {
2    public String longestPalindrome(String s) {
3        if (s.length() <= 1) return s;
4
5        int max = 1;
6        StringBuilder sb = new StringBuilder(s.substring(0, 1));
7
8        for (int i = 0; i < s.length(); i++) {
9
10            // Odd length palindrome
11            int l = i;
12            int r = i;
13
14            while (l >= 0 && r < s.length() &&
15                   s.charAt(l) == s.charAt(r)) {
16
17                if (r - l + 1 > max) {
18                    sb = new StringBuilder(s.substring(l, r + 1));
19                    max = r - l + 1;
20                }
21
22                l--;
23                r++;
24            }
25
26            // Even length palindrome
27            l = i;
28            r = i + 1;
29
30            while (l >= 0 && r < s.length() &&
31                   s.charAt(l) == s.charAt(r)) {
32
33                if (r - l + 1 > max) {
34                    sb = new StringBuilder(s.substring(l, r + 1));
35                    max = r - l + 1;
36                }
37
38                l--;
39                r++;
40            }
41        }
42
43        return sb.toString();
44    }
45}