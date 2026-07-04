// Last updated: 7/4/2026, 7:40:18 PM
class Solution {
    public int[] bestTower(int[][] towers, int[] center, int radius) {
        int max=Integer.MIN_VALUE;
        int idxi=0,idxj=0;
        int[] arr = new int[2];
        int[] arr1={-1,-1};
        for(int i=0;i<towers.length;i++){
            int dis=Math.abs(towers[i][0]-center[0])+Math.abs(towers[i][1]-center[1]);

            if(dis<=radius){
                if(towers[i][2]>max){
                    max=towers[i][2];
                    idxi=towers[i][0];
                    idxj=towers[i][1];
                }
                if(towers[i][2]==max){
                    if(towers[i][0]<idxi) {
                        idxi=towers[i][0];
                        idxj=towers[i][1];
                    }
                    if(towers[i][0]==idxi){
                        if(towers[i][1]<idxj){
                            idxi=towers[i][0];
                            idxj=towers[i][1];
                        }
                    }

                }
            }
        }
        arr[0]=idxi;
        arr[1]=idxj;
        return max==Integer.MIN_VALUE?arr1:arr;
       
        
    }
}