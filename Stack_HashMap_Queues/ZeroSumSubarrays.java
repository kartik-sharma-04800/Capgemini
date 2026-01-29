import java.util.*;
public class ZeroSumSubarrays {
    public List<int[]> find(int[] a) {
        List<int[]> res = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            int sum = 0;
            for (int j = i; j < a.length; j++) {
                sum += a[j];
                if (sum == 0) {
                    res.add(new int[] { i, j });
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] a = {3, 4, -7, 3, 1, 3, 1, -4, -2, -2};
        java.util.List<int[]> r = new ZeroSumSubarrays().find(a);
        for (int[] p : r) {
            System.out.print("[" + p[0] + "," + p[1] + "]");
        }
        System.out.println();
    }
}
