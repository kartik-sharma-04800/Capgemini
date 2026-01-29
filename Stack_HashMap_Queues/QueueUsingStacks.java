import java.util.Stack;
public class QueueUsingStacks {
    private Stack<Integer> in = new Stack<>();
    private Stack<Integer> out = new Stack<>();
    public void enqueue(int x) {
        in.push(x);
    }
    public int dequeue() {
        if (out.isEmpty()) {
            while (!in.isEmpty()) {
                out.push(in.pop());
            }
        }
        if (out.isEmpty()) {
            throw new java.util.NoSuchElementException();
        }
        return out.pop();
    }
    public boolean isEmpty() {
        return in.isEmpty() && out.isEmpty();
    }
    public static void main(String[] args) {
        QueueUsingStacks q = new QueueUsingStacks();
        q.enqueue(1);
        q.enqueue(2);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }
}
