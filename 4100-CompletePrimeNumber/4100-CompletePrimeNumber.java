// Last updated: 7/4/2026, 7:40:41 PM
class Solution {
    public boolean completePrime(int num) {
        String str=String.valueOf(num);
        for(int i=1;i<=str.length();i++){
            if(!prime(Integer.parseInt(str.substring(0,i)))) return false;
            if(!prime(Integer.parseInt(str.substring(str.length()-i)))) return false;
        }
        return true;
        
    }
    public boolean prime(int x){
        if(x<=1) return false;
        for(int i=2;i*i<=x;i++){
            if(x%i==0) return false;
        }
        return true;
    }
}