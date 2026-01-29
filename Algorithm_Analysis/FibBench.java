public class FibBench {
    static long fibRec(int n) {
        if (n <= 1) {
            return n;
        }
        return fibRec(n - 1) + fibRec(n - 2);
    }

    static long fibIter(int n) {
        if (n <= 1) {
            return n;
        }
        long a = 0;
        long b = 1;
        for (int i = 2; i <= n; i++) {
            long s = a + b;
            a = b;
            b = s;
        }
        return b;
    }

    public static void main(String[] args) {
        int n = 45;

        long t1 = System.nanoTime();
        long r1 = fibIter(n);
        long t2 = System.nanoTime();

        long t3 = System.nanoTime();
        long r2 = fibRec(40);
        long t4 = System.nanoTime();

        System.out.println("Iter fib(" + n + ")=" + r1 + " ns=" + (t2 - t1));
        System.out.println("Rec fib(40)=" + r2 + " ns=" + (t4 - t3));
    }
}
