class Solution {
    public int[] searchRange(int[] arr, int k) {
        int n=arr.length;
        int lo=0;
        int hi=n-1;
        int ans=-1;
        int[] an=new int[2];
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]==k) {
               ans=mid;
                hi=mid-1;
                
            }
            else if(arr[mid]<k) lo=mid+1;
            else hi=mid-1;

        }
       an[0]=ans;
        int lo1=0;
        int hi1=n-1;
        int ans1=-1;
        while(lo1<=hi1){
            int mid=lo1+(hi1-lo1)/2;
            if(arr[mid]==k) {
               ans1=mid;
                lo1=mid+1;
                
            }
            else if(arr[mid]<k) lo1=mid+1;
            else hi1=mid-1;

        }
        an[1]=ans1;
        return an;

        
    }
}