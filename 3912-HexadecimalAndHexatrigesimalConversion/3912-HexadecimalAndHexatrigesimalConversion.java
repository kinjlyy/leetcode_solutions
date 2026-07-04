// Last updated: 7/4/2026, 7:41:33 PM
class Solution {
    public String concatHex36(int n) {
        int n2 = n * n;
        int n3 = n * n * n;

        String hex = convertToBase(n2, 16);  
        String base36 = convertToBase(n3, 36);  
        return hex + base36;}
    // Method to convert a number to any base up to 36
    public static String convertToBase(int num, int base) {
        String digits = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        if (num == 0) return "0";
        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            sb.append(digits.charAt(num % base));
            num /= base;
        }
        return sb.reverse().toString();
    }}
    
        
    