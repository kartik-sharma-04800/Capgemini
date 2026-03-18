class QuantityMeasurementApp {
    static void show(double v, LengthUnit f, LengthUnit t) {
        System.out.printf("%.2f %s = %.6f %s%n", v, f, QuantityLength.convert(v, f, t), t);
    }
    
    static void show(QuantityLength q, LengthUnit t) {
        System.out.println(q + " = " + q.to(t));
    }
    
    static void showAddition(QuantityLength q1, QuantityLength q2) {
        QuantityLength result = QuantityLength.add(q1, q2);
        System.out.println(q1 + " + " + q2 + " = " + result);
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
        
        System.out.println("\n=== Addition Operations ===");
        showAddition(new QuantityLength(1.0, LengthUnit.FEET), new QuantityLength(2.0, LengthUnit.FEET));
        showAddition(new QuantityLength(1.0, LengthUnit.FEET), new QuantityLength(12.0, LengthUnit.INCHES));
        showAddition(new QuantityLength(12.0, LengthUnit.INCHES), new QuantityLength(1.0, LengthUnit.FEET));
        showAddition(new QuantityLength(1.0, LengthUnit.YARDS), new QuantityLength(3.0, LengthUnit.FEET));
        showAddition(new QuantityLength(36.0, LengthUnit.INCHES), new QuantityLength(1.0, LengthUnit.YARDS));
        showAddition(new QuantityLength(2.54, LengthUnit.CM), new QuantityLength(1.0, LengthUnit.INCHES));
        showAddition(new QuantityLength(5.0, LengthUnit.FEET), new QuantityLength(0.0, LengthUnit.INCHES));
        showAddition(new QuantityLength(5.0, LengthUnit.FEET), new QuantityLength(-2.0, LengthUnit.FEET));
    }
}
