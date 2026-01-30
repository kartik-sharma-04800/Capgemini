import java.util.*;

public class CompareStringBufferVsStringBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.hasNextInt() ? sc.nextInt() : 1000000;
        long t1 = System.nanoTime();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < n; i++) sbf.append("hello");
        long t2 = System.nanoTime();
        StringBuilder sbd = new StringBuilder();
        for (int i = 0; i < n; i++) sbd.append("hello");
        long t3 = System.nanoTime();
        System.out.println((t2 - t1) + " " + (t3 - t2));
    }
}
