import java.io.*;
import java.util.*;

public class TopKFrequentWords {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        int k = sc.nextInt();
        Map<String,Integer> freq = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.toLowerCase().split("[^a-z0-9']+");
                for (String p : parts) if (!p.isEmpty()) freq.put(p, freq.getOrDefault(p, 0) + 1);
            }
        }
        PriorityQueue<Map.Entry<String,Integer>> pq = new PriorityQueue<>((e1,e2)-> e1.getValue().equals(e2.getValue()) ? e1.getKey().compareTo(e2.getKey()) : Integer.compare(e1.getValue(), e2.getValue()));
        for (Map.Entry<String,Integer> e : freq.entrySet()) {
            pq.offer(e);
            if (pq.size() > k) pq.poll();
        }
        List<String> res = new ArrayList<>();
        while (!pq.isEmpty()) res.add(0, pq.poll().getKey());
        for (String w : res) System.out.println(w);
    }
}
