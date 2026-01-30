import java.io.*;
import java.util.*;

public class FileReaderReadLines {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) System.out.println(line);
        }
    }
}
