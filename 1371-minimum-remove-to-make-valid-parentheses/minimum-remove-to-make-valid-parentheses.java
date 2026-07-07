class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Character> st= new Stack<>();
        int bnd=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c!='(' && c!=')') continue;
            if(st.isEmpty() && c==')') bnd++;
            else if(!st.isEmpty() && c==')') st.pop();
            else st.push(c);
        }
        int open=0;
        while(!st.isEmpty()){
            st.pop();
            open++;
        }
        StringBuilder sb= new StringBuilder();
        sb.append(s);
        
        for(int i=0;i<sb.length();i++){
            if(bnd>0 && sb.charAt(i)==')'){
           
                sb.deleteCharAt(i);
                bnd--;
                i--;
            
        }
        
        }
         for(int i=sb.length()-1;i>=0;i--){
            if(open>0 && sb.charAt(i)=='(' ){
            
                sb.deleteCharAt(i);
                open--;
                
            
        }
        
        }
        return sb.toString();
    }
}