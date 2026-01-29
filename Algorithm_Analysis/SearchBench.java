import java.util.*;

public class SearchBench {
    static int linearSearch(int[] a, int x) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int N = 1_000_000;
        int[] a = new Random(1).ints(N, 0, N * 2).toArray();
        int target = a[N / 2];

        long t1 = System.nanoTime();
        int i1 = linearSearch(a, target);
        long t2 = System.nanoTime();

        int[] b = Arrays.copyOf(a, a.length);
        Arrays.sort(b);
        long t3 = System.nanoTime();
        int i2 = Arrays.binarySearch(b, target);
        long t4 = System.nanoTime();

        System.out.println("Linear search (ns): " + (t2 - t1) + " idx=" + i1);
        System.out.println("Sort (ns): " + (t3 - t2));
        System.out.println("Binary search (ns): " + (t4 - t3) + " idx=" + i2);
    }
}
