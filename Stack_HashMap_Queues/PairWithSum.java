import java.util.*;
public class PairWithSum {
    public boolean exists(int[] a, int target) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == target) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] a = {10, 15, 3, 7};
        System.out.println(new PairWithSum().exists(a, 17));
    }
}
