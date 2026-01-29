import java.io.*;

public class FileReadBench {
    static long readWithReader(File f) throws Exception {
        long t1 = System.nanoTime();
        try (Reader r = new BufferedReader(new FileReader(f))) {
            char[] buf = new char[8192];
            int n;
            while ((n = r.read(buf)) != -1) {
            }
        }
        return System.nanoTime() - t1;
    }

    static long readWithInputStreamReader(File f) throws Exception {
        long t1 = System.nanoTime();
        try (InputStream in = new BufferedInputStream(new FileInputStream(f));
             Reader r = new BufferedReader(new InputStreamReader(in))) {
            char[] buf = new char[8192];
            int n;
            while ((n = r.read(buf)) != -1) {
            }
        }
        return System.nanoTime() - t1;
    }

    public static void main(String[] args) throws Exception {
        File f = new File(args.length > 0 ? args[0] : "bigfile.txt");
        System.out.println("FileReader ns: " + readWithReader(f));
        System.out.println("InputStreamReader ns: " + readWithInputStreamReader(f));
    }
}
