class Solution {
    public int maxScore(int[] card, int k) {
        int n=(card.length);
        int sum=0;
        int min=Integer.MAX_VALUE;
        int w=n-k;
        int i=0;
        int j=0;
        int sum1=0;
        for(int l:card){
            sum1+=l;
        }
        while(j<n){            
            if(j>=w){
                min=Math.min(min,sum);
                sum-=card[i];
                i++;
            }
            sum+=card[j];
            j++;

        }
        min = Math.min(min, sum);
        return sum1-min;
    }
}