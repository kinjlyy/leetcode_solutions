class Solution {
    public String removeKdigits(String num, int k) {
        if(num.length()==k) return "0";
        Stack<Integer> st= new Stack<>();
        st.push(num.charAt(0)-'0');
        for(int i=1;i<num.length();i++){
            
            int s=num.charAt(i)-'0';
            while(!st.isEmpty() && st.peek()>s && k>0) {
                st.pop();
                k--;}
                st.push(s);


        }
        if(k>0){
            while(k>0){
                st.pop();
                k--;

            }
        }
       StringBuilder sb= new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());

        }
        StringBuilder ans = sb.reverse();

while(ans.length() > 1 && ans.charAt(0) == '0'){
    ans.deleteCharAt(0);
}

return ans.toString();

    }
}