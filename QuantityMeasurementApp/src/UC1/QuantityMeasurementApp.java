package UC1;

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

        public static void main(String[] args) {
            Feet feet1 = new Feet(1.0);
            Feet feet2 = new Feet(1.0);

            System.out.println("Comparing " + feet1 + " and " + feet2 + ":");
            System.out.println("Equal: " + feet1.equals(feet2));

            Feet feet3 = new Feet(2.0);
            System.out.println("\nComparing " + feet1 + " and " + feet3 + ":");
            System.out.println("Equal: " + feet1.equals(feet3));
        }
}

