public class StringConcatBench {
    public static void main(String[] args) {
        int N = 100_000;

        long t1 = System.nanoTime();
        String s = "";
        for (int i = 0; i < N; i++) {
            s += "a";
        }
        long t2 = System.nanoTime();
        System.out.println("String ns: " + (t2 - t1));

        long t3 = System.nanoTime();
        StringBuilder sb = new StringBuilder(N);
        for (int i = 0; i < N; i++) {
            sb.append('a');
        }
        String s2 = sb.toString();
        long t4 = System.nanoTime();
        System.out.println("StringBuilder ns: " + (t4 - t3));

        long t5 = System.nanoTime();
        StringBuffer sbf = new StringBuffer(N);
        for (int i = 0; i < N; i++) {
            sbf.append('a');
        }
        String s3 = sbf.toString();
        long t6 = System.nanoTime();
        System.out.println("StringBuffer ns: " + (t6 - t5));
    }
}
