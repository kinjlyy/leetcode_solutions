// Last updated: 7/7/2026, 1:27:02 PM
1class Solution {
2    public String removeKdigits(String num, int k) {
3        if(num.length()==k) return "0";
4        Stack<Integer> st= new Stack<>();
5        st.push(num.charAt(0)-'0');
6        for(int i=1;i<num.length();i++){
7            
8            int s=num.charAt(i)-'0';
9            while(!st.isEmpty() && st.peek()>s && k>0) {
10                st.pop();
11                k--;}
12                st.push(s);
13
14
15        }
16        if(k>0){
17            while(k>0){
18                st.pop();
19                k--;
20
21            }
22        }
23       StringBuilder sb= new StringBuilder();
24        while(!st.isEmpty()){
25            sb.append(st.pop());
26
27        }
28        StringBuilder ans = sb.reverse();
29
30while(ans.length() > 1 && ans.charAt(0) == '0'){
31    ans.deleteCharAt(0);
32}
33
34return ans.toString();
35
36    }
37}