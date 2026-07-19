class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int cnt = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        int[] pre = new int[n];
        pre[0] = nums[0];

        map.put(pre[0], 1);

        if (pre[0] == k)
            cnt++;

        for (int i = 1; i < n; i++) {
            pre[i] = nums[i] + pre[i - 1];

            if (map.containsKey(pre[i] - k))
                cnt += map.get(pre[i] - k);

            map.put(pre[i], map.getOrDefault(pre[i], 0) + 1);

            if (pre[i] == k)
                cnt++;
        }

        return cnt;
    }
}