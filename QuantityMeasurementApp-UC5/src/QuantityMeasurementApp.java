class QuantityMeasurementApp {
    static void show(double v, LengthUnit f, LengthUnit t) {
        System.out.printf("%.2f %s = %.6f %s%n", v, f, QuantityLength.convert(v, f, t), t);
    }
    
    static void show(QuantityLength q, LengthUnit t) {
        System.out.println(q + " = " + q.to(t));
    }
    
    public static void main(String[] args) {
        System.out.println("=== Unit Conversion ===");
        show(1.0, LengthUnit.FEET, LengthUnit.INCHES);
        show(3.0, LengthUnit.YARDS, LengthUnit.FEET);
        show(36.0, LengthUnit.INCHES, LengthUnit.YARDS);
        show(1.0, LengthUnit.CM, LengthUnit.INCHES);
        
        QuantityLength q = new QuantityLength(2.0, LengthUnit.YARDS);
        show(q, LengthUnit.INCHES);
        show(q, LengthUnit.FEET);
    }
}
