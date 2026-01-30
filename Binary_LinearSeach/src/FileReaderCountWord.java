import java.io.*;
import java.util.*;

public class FileReaderCountWord {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        String target = sc.nextLine();
        int count = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("\\s+");
                for (String p : parts) if (p.equals(target)) count++;
            }
        }
        System.out.println(count);
    }
}
