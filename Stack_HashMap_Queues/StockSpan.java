import java.util.*;
public class StockSpan {
    public int[] span(int[] a) {
        int n = a.length;
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            int s = 1;
            for (int j = i - 1; j >= 0 && a[j] <= a[i]; j--) {
                s++;
            }
            res[i] = s;
        }
        return res;
    }
    public static void main(String[] args) {
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        int[] sp = new StockSpan().span(prices);
        for (int x : sp) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
