class Test {
    public static void main(String[] args) {
        System.out.println("Testing conversions...");
        
        assert QuantityLength.convert(1.0, LengthUnit.FEET, LengthUnit.INCHES) == 12.0;
        assert QuantityLength.convert(24.0, LengthUnit.INCHES, LengthUnit.FEET) == 2.0;
        assert QuantityLength.convert(1.0, LengthUnit.YARDS, LengthUnit.INCHES) == 36.0;
        assert Math.abs(QuantityLength.convert(2.54, LengthUnit.CM, LengthUnit.INCHES) - 1.0) < 1e-6;
        
        QuantityLength q1 = new QuantityLength(1.0, LengthUnit.FEET);
        QuantityLength q2 = new QuantityLength(12.0, LengthUnit.INCHES);
        assert q1.equals(q2);
        
        try {
            QuantityLength.convert(1.0, null, LengthUnit.INCHES);
            assert false;
        } catch (IllegalArgumentException e) {}
        
        try {
            new QuantityLength(Double.NaN, LengthUnit.FEET);
            assert false;
        } catch (IllegalArgumentException e) {}
        
        System.out.println("All tests passed!");
    }
}
