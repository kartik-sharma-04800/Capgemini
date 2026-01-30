import java.io.*;
import java.nio.charset.*;
import java.text.*;
import java.util.*;

public class UTF16UniqueCodePoints {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        Set<Integer> set = new HashSet<>();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path), Charset.forName("UTF-16")))) {
            String line;
            while ((line = br.readLine()) != null) {
                String n = Normalizer.normalize(line, Normalizer.Form.NFC);
                n.codePoints().forEach(set::add);
            }
        }
        System.out.println(set.size());
    }
}
