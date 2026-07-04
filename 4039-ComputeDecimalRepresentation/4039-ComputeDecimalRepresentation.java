// Last updated: 7/4/2026, 7:41:00 PM
import java.util.*;

class Solution {
    public int[] decimalRepresentation(int n) {
        List<Integer> list = new ArrayList<>();
        int p = 1;
        while (n > 0) {
            int digit = n % 10;
            if (digit != 0) {
                list.add(digit * p);
            }
            n /= 10;
            p *= 10;
        }
        Collections.sort(list, Collections.reverseOrder());
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }

        return res;
    }
}
