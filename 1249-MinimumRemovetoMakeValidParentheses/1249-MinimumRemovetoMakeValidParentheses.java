// Last updated: 7/7/2026, 7:05:01 PM
1class Solution {
2    public String minRemoveToMakeValid(String s) {
3        Stack<Character> st= new Stack<>();
4        int bnd=0;
5        for(int i=0;i<s.length();i++){
6            char c=s.charAt(i);
7            if(c!='(' && c!=')') continue;
8            if(st.isEmpty() && c==')') bnd++;
9            else if(!st.isEmpty() && c==')') st.pop();
10            else st.push(c);
11        }
12        int open=0;
13        while(!st.isEmpty()){
14            st.pop();
15            open++;
16        }
17        StringBuilder sb= new StringBuilder();
18        sb.append(s);
19        
20        for(int i=0;i<sb.length();i++){
21            if(bnd>0 && sb.charAt(i)==')'){
22           
23                sb.deleteCharAt(i);
24                bnd--;
25                i--;
26            
27        }
28        
29        }
30         for(int i=sb.length()-1;i>=0;i--){
31            if(open>0 && sb.charAt(i)=='(' ){
32            
33                sb.deleteCharAt(i);
34                open--;
35                
36            
37        }
38        
39        }
40        return sb.toString();
41    }
42}