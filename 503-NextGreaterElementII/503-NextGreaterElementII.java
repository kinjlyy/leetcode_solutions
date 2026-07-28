// Last updated: 7/28/2026, 7:18:40 PM
1class Solution {
2    public int[] nextGreaterElements(int[] nums) {
3        int n=nums.length;
4        int[] ans=new int[n];
5        Arrays.fill(ans,-1);
6        Stack<Integer> st=new Stack<>();
7        for(int i=0;i<2*n;i++){
8            int idx=i%n;
9            while(!st.isEmpty() && nums[idx]>nums[st.peek()]){
10                   int id=st.pop();
11                   ans[id]=nums[idx];
12            }
13            st.push(idx);
14        }
15        return ans;
16        
17    }
18}