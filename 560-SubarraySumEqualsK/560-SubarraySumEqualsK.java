// Last updated: 7/19/2026, 11:46:48 AM
1class Solution {
2    public int subarraySum(int[] nums, int k) {
3        int n = nums.length;
4        int cnt = 0;
5
6        HashMap<Integer, Integer> map = new HashMap<>();
7
8        int[] pre = new int[n];
9        pre[0] = nums[0];
10
11        map.put(pre[0], 1);
12
13        if (pre[0] == k)
14            cnt++;
15
16        for (int i = 1; i < n; i++) {
17            pre[i] = nums[i] + pre[i - 1];
18
19            if (map.containsKey(pre[i] - k))
20                cnt += map.get(pre[i] - k);
21
22            map.put(pre[i], map.getOrDefault(pre[i], 0) + 1);
23
24            if (pre[i] == k)
25                cnt++;
26        }
27
28        return cnt;
29    }
30}