// Last updated: 7/4/2026, 7:41:14 PM

class Solution {
    public boolean partitionArray(int[] nums, int k) {
        int n = nums.length;

        
        if (n % k != 0) return false;

        int groups = n / k;

        
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        
        for (int count : freq.values()) {
            if (count > groups) return false;
        }

        return true;
    }
}
