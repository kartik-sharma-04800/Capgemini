import java.util.*;
public class SlidingWindowMaximum {
    public int[] maxSlidingWindow(int[] a, int k) {
        if (k <= 0 || a.length == 0 || k > a.length) {
            return new int[0];
        }
        int n = a.length;
        int[] res = new int[n - k + 1];
        for (int i = 0; i + k <= n; i++) {
            int m = a[i];
            for (int j = i + 1; j < i + k; j++) {
                if (a[j] > m) {
                    m = a[j];
                }
            }
            res[i] = m;
        }
        return res;
    }
    public static void main(String[] args) {
        int[] a = {1, 3, -3, 5, 3, 6, 7};
        int[] r = new SlidingWindowMaximum().maxSlidingWindow(a, 3);
        for (int x : r) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
