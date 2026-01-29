public class Runner {
    public static void main(String[] args) {
        QueueUsingStacks q = new QueueUsingStacks();
        q.enqueue(1);
        q.enqueue(2);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());

        java.util.Stack<Integer> s = new java.util.Stack<>();
        s.push(3);
        s.push(1);
        s.push(2);
        new SortStackRecursion().sort(s);
        while (!s.isEmpty()) System.out.print(s.pop() + " ");
        System.out.println();

        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        int[] sp = new StockSpan().span(prices);
        for (int x : sp) System.out.print(x + " ");
        System.out.println();

        int[] arr = {1, 3, -3, 5, 3, 6, 7};
        int[] sw = new SlidingWindowMaximum().maxSlidingWindow(arr, 3);
        for (int x : sw) System.out.print(x + " ");
        System.out.println();

        int[] petrol = {4, 6, 7, 4};
        int[] dist = {6, 5, 3, 5};
        System.out.println(new CircularTour().startIndex(petrol, dist));

        int[] arr2 = {3, 4, -7, 3, 1, 3, 1, -4, -2, -2};
        java.util.List<int[]> zs = new ZeroSumSubarrays().find(arr2);
        for (int[] p : zs) System.out.print("[" + p[0] + "," + p[1] + "]");
        System.out.println();

        int[] arr3 = {10, 15, 3, 7};
        System.out.println(new PairWithSum().exists(arr3, 17));

        int[] arr4 = {100, 4, 200, 1, 3, 2};
        System.out.println(new LongestConsecutiveSequence().longest(arr4));

        CustomHashMap m = new CustomHashMap();
        m.put(1, 10);
        m.put(2, 20);
        System.out.println(m.get(1));
        m.remove(1);
        System.out.println(m.get(1));
        System.out.println(m.size());

        int[] arr5 = {2, 7, 11, 15};
        int[] ts = new TwoSum().twoSum(arr5, 9);
        if (ts.length == 2) System.out.println(ts[0] + " " + ts[1]); else System.out.println();
    }
}
