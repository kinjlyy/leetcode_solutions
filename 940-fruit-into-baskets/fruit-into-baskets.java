class Solution {
    public int totalFruit(int[] arr) {
        int n= arr.length;
        int i=0;
        int j=0;
        int max=0;
        HashMap<Integer, Integer> map= new HashMap<>();
        while(j<n && i<n){
            map.put(arr[j], map.getOrDefault(arr[j],0)+1);
            int dist=map.size();
            if(dist>2) {
                if(map.get(arr[i])==1) map.remove(arr[i]);
                else{
                    map.put(arr[i], map.get(arr[i])-1);
                }
                i++;
                }
            max=Math.max(max,j-i+1);

            j++; 

        }
        return max;
        
    }
}