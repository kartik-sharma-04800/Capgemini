import java.util.Stack;
public class SortStackRecursion {
    public void sort(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int x = s.pop();
        sort(s);
        insert(s, x);
    }
    private void insert(Stack<Integer> s, int x) {
        if (s.isEmpty() || s.peek() <= x) {
            s.push(x);
            return;
        }
        int y = s.pop();
        insert(s, x);
        s.push(y);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(3);
        s.push(1);
        s.push(2);
        new SortStackRecursion().sort(s);
        while (!s.isEmpty()) {
            System.out.print(s.pop() + " ");
        }
        System.out.println();
    }
}
