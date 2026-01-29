public class CircularTour {
    public int startIndex(int[] petrol, int[] distance) {
        int n = petrol.length;
        for (int s = 0; s < n; s++) {
            int tank = 0;
            int count = 0;
            int i = s;
            while (count < n) {
                tank += petrol[i];
                tank -= distance[i];
                if (tank < 0) break;
                i = (i + 1) % n;
                count++;
            }
            if (count == n && tank >= 0) return s;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] petrol = {4, 6, 7, 4};
        int[] dist = {6, 5, 3, 5};
        System.out.println(new CircularTour().startIndex(petrol, dist));
    }
}
