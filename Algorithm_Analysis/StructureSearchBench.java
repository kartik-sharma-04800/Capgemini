import java.util.*;

public class StructureSearchBench {
    public static void main(String[] args) {
        int N = 1_000_000;
        int target = N - 1;

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = i;
        }

        HashSet<Integer> hs = new HashSet<>(N * 2);
        for (int i = 0; i < N; i++) {
            hs.add(i);
        }

        TreeSet<Integer> ts = new TreeSet<>();
        for (int i = 0; i < N; i++) {
            ts.add(i);
        }

        long t1 = System.nanoTime();
        int idx = -1;
        for (int i = 0; i < N; i++) {
            if (arr[i] == target) {
                idx = i;
                break;
            }
        }
        long t2 = System.nanoTime();

        long t3 = System.nanoTime();
        boolean h = hs.contains(target);
        long t4 = System.nanoTime();

        long t5 = System.nanoTime();
        boolean t = ts.contains(target);
        long t6 = System.nanoTime();

        System.out.println("Array linear ns: " + (t2 - t1) + " idx=" + idx);
        System.out.println("HashSet ns: " + (t4 - t3) + " found=" + h);
        System.out.println("TreeSet ns: " + (t6 - t5) + " found=" + t);
    }
}
