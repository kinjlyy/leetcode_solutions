// Last updated: 7/4/2026, 7:40:47 PM
class Solution {
    public int largestPrime(int n) {
        int res=0;
        int sum=0;
        for(int i=1;i<=n;i++){
            if(isPrime(i)){
                sum+=i;
                if(sum>n)break;
                if(isPrime(sum)){
                    res=sum;
                }
            }
        }
        return res;
    }
     public boolean isPrime(int num){
        int count=0;
        if(num<2)return false;
        for(int i=2;i*i<=num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}