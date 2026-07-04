class Solution {
    public int findMinArrowShots(int[][] arr) {
        Arrays.sort(arr, (a,b)->Integer.compare(a[1],b[1]));
        int grp=1;
        int head=arr[0][1];
        for(int i=1;i<arr.length;i++){
            if(head>=arr[i][0]) continue;            
            
            else {
                head=arr[i][1];
                grp++;
                }
        }
        return grp;
        
    }
}