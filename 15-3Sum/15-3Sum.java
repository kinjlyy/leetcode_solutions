// Last updated: 7/18/2026, 2:26:18 PM
1class Solution {
2    public List<List<Integer>> threeSum(int[] nums) {
3        List<List<Integer>> ll= new ArrayList<>();
4        Arrays.sort(nums);
5        for(int i=0;i<nums.length;i++){
6            if(i>0 && nums[i-1]==nums[i]) continue;
7            int l=i+1;
8            int r=nums.length-1;
9          
10            while(l<r){
11                  List<Integer> li= new ArrayList<>();
12                if(nums[i]+nums[l]+nums[r]==0){
13                    li.add(nums[i]);
14                    li.add(nums[l]);
15                    li.add(nums[r]);
16                    l++;
17                    r--;
18                    while(l<r && nums[l]==nums[l-1]) l++;
19                    while(l<r && nums[r]==nums[r+1]) r--;
20                }
21                else if(nums[i]+nums[l]+nums[r]<0) l++;
22                else r--;
23                if(!li.isEmpty()) ll.add(li);
24
25
26            }
27
28        }
29        return ll;
30        
31    }
32}