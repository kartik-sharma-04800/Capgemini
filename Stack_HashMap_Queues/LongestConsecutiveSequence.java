import java.util.*;
public class LongestConsecutiveSequence {
    public int longest(int[] a) {
        if (a.length == 0) {
            return 0;
        }
        Arrays.sort(a);
        int best = 1;
        int cur = 1;
        for (int i = 1; i < a.length; i++) {
            if (a[i] == a[i - 1]) {
                continue;
            }
            if (a[i] == a[i - 1] + 1) {
                cur++;
            } else {
                cur = 1;
            }
            if (cur > best) {
                best = cur;
            }
        }
        return best;
    }
    public static void main(String[] args) {
        int[] a = {100, 4, 200, 1, 3, 2};
        System.out.println(new LongestConsecutiveSequence().longest(a));
    }
}
