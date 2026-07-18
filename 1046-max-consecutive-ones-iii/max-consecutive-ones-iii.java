class Solution {
    public int longestOnes(int[] nums, int k) {
        int max=0;
        int g=k;
        int i=0;
        for (int j = 0; j < nums.length; j++) {

            if (nums[j] == 0)
                g--;

            if (g < 0) {     

                if (nums[i] == 0)
                    g++;

                i++;
            }

            max = Math.max(max, j - i + 1);
        }

           
        
        return max;
        
    }
}