import java.io.*;
import java.nio.charset.*;
import java.util.*;

public class InputStreamReaderReadFile {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        String charsetName = sc.nextLine();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path), Charset.forName(charsetName)))) {
            String line;
            while ((line = br.readLine()) != null) System.out.println(line);
        }
    }
}
