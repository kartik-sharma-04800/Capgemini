import java.util.*;

public class SortBench {
    static void bubbleSort(int[] a) {
        for (int n = a.length; n > 1; n--) {
            boolean swapped = false;
            for (int i = 1; i < n; i++) {
                if (a[i - 1] > a[i]) {
                    int t = a[i];
                    a[i] = a[i - 1];
                    a[i - 1] = t;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    static void mergeSort(int[] a) {
        mergeSort(a, new int[a.length], 0, a.length - 1);
    }

    static void mergeSort(int[] a, int[] tmp, int l, int r) {
        if (l >= r) {
            return;
        }
        int m = (l + r) >>> 1;
        mergeSort(a, tmp, l, m);
        mergeSort(a, tmp, m + 1, r);

        int i = l;
        int j = m + 1;
        int k = l;

        while (i <= m && j <= r) {
            if (a[i] <= a[j]) {
                tmp[k++] = a[i++];
            } else {
                tmp[k++] = a[j++];
            }
        }

        while (i <= m) {
            tmp[k++] = a[i++];
        }

        while (j <= r) {
            tmp[k++] = a[j++];
        }

        for (i = l; i <= r; i++) {
            a[i] = tmp[i];
        }
    }

    static void quickSort(int[] a) {
        quickSort(a, 0, a.length - 1);
    }

    static void quickSort(int[] a, int l, int r) {
        if (l >= r) {
            return;
        }
        int i = l;
        int j = r;
        int p = a[(l + r) >>> 1];

        while (i <= j) {
            while (a[i] < p) {
                i++;
            }
            while (a[j] > p) {
                j--;
            }
            if (i <= j) {
                int t = a[i];
                a[i] = a[j];
                a[j] = t;
                i++;
                j--;
            }
        }

        if (l < j) {
            quickSort(a, l, j);
        }
        if (i < r) {
            quickSort(a, i, r);
        }
    }

    public static void main(String[] args) {
        int N = 100_000;
        int[] base = new Random(1).ints(N, 0, N).toArray();

        int[] a1 = Arrays.copyOf(base, N);
        long t1 = System.nanoTime();
        bubbleSort(a1);
        long t2 = System.nanoTime();
        System.out.println("Bubble ns: " + (t2 - t1));

        int[] a2 = Arrays.copyOf(base, N);
        long t3 = System.nanoTime();
        mergeSort(a2);
        long t4 = System.nanoTime();
        System.out.println("Merge ns: " + (t4 - t3));

        int[] a3 = Arrays.copyOf(base, N);
        long t5 = System.nanoTime();
        quickSort(a3);
        long t6 = System.nanoTime();
        System.out.println("Quick ns: " + (t6 - t5));
    }
}
