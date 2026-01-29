import java.util.*;
public class TwoSum {
    public int[] twoSum(int[] a, int target) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[0];
    }
    public static void main(String[] args) {
        int[] a = {2, 7, 11, 15};
        int[] r = new TwoSum().twoSum(a, 9);
        if (r.length == 2) {
            System.out.println(r[0] + " " + r[1]);
        } else {
            System.out.println();
        }
    }
}
