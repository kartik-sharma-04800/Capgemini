package UC2;

public class QuantityMeasurementApp {

    public static class Feet {
        private final double value;

        public Feet(double value) {
            this.value = value;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Feet other = (Feet) obj;
            return Double.compare(this.value, other.value) == 0;
        }

        @Override
        public String toString() {
            return value + " ft";
        }
    }

    public static boolean areFeetEqual(double a, double b) {
        return new Feet(a).equals(new Feet(b));
    }

    public static void main(String[] args) {
        System.out.println("=== Feet ===");
        System.out.println("1.0 ft == 1.0 ft : " + areFeetEqual(1.0, 1.0));
        System.out.println("1.0 ft == 2.0 ft : " + areFeetEqual(1.0, 2.0));
    }
}