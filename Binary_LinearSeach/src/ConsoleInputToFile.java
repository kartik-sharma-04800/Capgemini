import java.io.*;
import java.nio.charset.*;
import java.util.*;

public class ConsoleInputToFile {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String outPath = sc.nextLine();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in, Charset.forName("UTF-8"))); FileWriter fw = new FileWriter(outPath)) {
            String line;
            while ((line = br.readLine()) != null) {
                if ("exit".equalsIgnoreCase(line)) break;
                fw.write(line);
                fw.write(System.lineSeparator());
            }
        }
    }
}
