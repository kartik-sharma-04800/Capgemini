import java.util.*;

public class FirstAndLastOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        int t = sc.nextInt();
        int first = bound(a, t, true);
        int last = bound(a, t, false);
        System.out.println(first + " " + last);
    }
    static int bound(int[] a, int t, boolean first) {
        int l = 0, r = a.length - 1, ans = -1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a[m] == t) { ans = m; if (first) r = m - 1; else l = m + 1; }
            else if (a[m] < t) l = m + 1; else r = m - 1;
        }
        return ans;
    }
}
