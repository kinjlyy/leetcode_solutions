// Last updated: 7/4/2026, 7:40:33 PM
class Solution {
    public long maximumScore(int[] nums, String s) {
        PriorityQueue<Integer> maxheap=new PriorityQueue<>(Collections.reverseOrder());
        long total=0;
        for(int i=0;i<s.length();i++){
            maxheap.add(nums[i]);
            if(s.charAt(i)=='1'){
                if(!maxheap.isEmpty()){
                    total+=maxheap.poll();
                }
            }
        }
        return total;
        
    }
}