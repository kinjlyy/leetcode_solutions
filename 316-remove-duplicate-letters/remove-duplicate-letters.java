import java.util.*;

class Solution {
    public String removeDuplicateLetters(String s) {

        HashMap<Character, Integer> map = new HashMap<>();
        Stack<Character> st = new Stack<>();
        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);
            map.put(c, map.get(c) - 1);

            if (set.contains(c))
                continue;

            while (!st.isEmpty()
                    && st.peek() > c
                    && map.get(st.peek()) > 0) {

                set.remove(st.peek());
                st.pop();
            }

            st.push(c);
            set.add(c);
        }

        StringBuilder sb = new StringBuilder();

        while (!st.isEmpty()) {
            sb.append(st.pop());
        }

        return sb.reverse().toString();
    }
}