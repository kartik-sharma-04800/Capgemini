public class CustomHashMap {
    static class Node {
        int key;
        int value;
        Node next;
        Node(int k, int v) { key = k; value = v; }
    }
    private Node[] table;
    private int size;
    public CustomHashMap() { table = new Node[16]; }
    private int index(int key) {
        return Math.abs(key) % table.length;
    }
    public void put(int key, int value) {
        int i = index(key);
        Node head = table[i];
        for (Node n = head; n != null; n = n.next) {
            if (n.key == key) { n.value = value; return; }
        }
        Node n = new Node(key, value);
        n.next = head;
        table[i] = n;
        size++;
    }
    public Integer get(int key) {
        int i = index(key);
        for (Node n = table[i]; n != null; n = n.next) {
            if (n.key == key) return n.value;
        }
        return null;
    }
    public void remove(int key) {
        int i = index(key);
        Node prev = null;
        Node cur = table[i];
        while (cur != null) {
            if (cur.key == key) {
                if (prev == null) table[i] = cur.next; else prev.next = cur.next;
                size--;
                return;
            }
            prev = cur;
            cur = cur.next;
        }
    }
    public int size() { return size; }
    public static void main(String[] args) {
        CustomHashMap m = new CustomHashMap();
        m.put(1, 10);
        m.put(2, 20);
        System.out.println(m.get(1));
        m.remove(1);
        System.out.println(m.get(1));
        System.out.println(m.size());
    }
}
