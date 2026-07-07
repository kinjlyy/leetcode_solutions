// Last updated: 7/7/2026, 6:15:55 PM
1import java.util.*;
2
3class Solution {
4    public String removeDuplicateLetters(String s) {
5
6        HashMap<Character, Integer> map = new HashMap<>();
7        Stack<Character> st = new Stack<>();
8        HashSet<Character> set = new HashSet<>();
9
10        for (int i = 0; i < s.length(); i++) {
11            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
12        }
13
14        for (int i = 0; i < s.length(); i++) {
15
16            char c = s.charAt(i);
17            map.put(c, map.get(c) - 1);
18
19            if (set.contains(c))
20                continue;
21
22            while (!st.isEmpty()
23                    && st.peek() > c
24                    && map.get(st.peek()) > 0) {
25
26                set.remove(st.peek());
27                st.pop();
28            }
29
30            st.push(c);
31            set.add(c);
32        }
33
34        StringBuilder sb = new StringBuilder();
35
36        while (!st.isEmpty()) {
37            sb.append(st.pop());
38        }
39
40        return sb.reverse().toString();
41    }
42}