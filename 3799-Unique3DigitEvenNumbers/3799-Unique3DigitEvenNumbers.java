// Last updated: 7/4/2026, 7:41:57 PM
 class Solution {
    public int totalNumbers(int[] digits) {
        Set<Integer> result = new HashSet<>();

        int n = digits.length;
        for(int i = 0; i < n; i++)
        {
            if(digits[i] == 0) continue;

            for(int j = 0; j < n; j++)
            {
                if(i == j) continue;

                for(int k = 0; k < n; k++)
                {
                    if(i == k || j == k) continue;

                    if(digits[k] % 2 == 0)
                        result.add((digits[i] * 100 + digits[j] * 10 + digits[k]));
                }
            }
        }

        return result.size();
    }
}