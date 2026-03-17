package UC4;

public class QuantityMeasurementApp {
    
    public static void main(String[] args) {
        System.out.println("=== UC3: Generic Quantity Class for DRY Principle ===\n");

        demonstrateCrossUnitEquality();
        demonstrateSameUnitEquality();
        demonstrateInequality();
    }
    
    private static void demonstrateCrossUnitEquality() {
        System.out.println("--- Cross-Unit Equality Demonstrations ---");
        
        QuantityLength oneFoot = new QuantityLength(1.0, LengthUnit.FEET);
        QuantityLength twelveInches = new QuantityLength(12.0, LengthUnit.INCH);
        
        System.out.println("Input: " + oneFoot + " and " + twelveInches);
        System.out.println("Output: Equal (" + oneFoot.equals(twelveInches) + ")");
        System.out.println();

    }
    
    private static void demonstrateSameUnitEquality() {
        System.out.println("--- Same-Unit Equality Demonstrations ---");
        
        QuantityLength inch1 = new QuantityLength(1.0, LengthUnit.INCH);
        QuantityLength inch2 = new QuantityLength(1.0, LengthUnit.INCH);
        
        System.out.println("Input: " + inch1 + " and " + inch2);
        System.out.println("Output: Equal (" + inch1.equals(inch2) + ")");
        System.out.println();
        
        QuantityLength foot1 = new QuantityLength(2.5, LengthUnit.FEET);
        QuantityLength foot2 = new QuantityLength(2.5, LengthUnit.FEET);
        
        System.out.println("Input: " + foot1 + " and " + foot2);
        System.out.println("Output: Equal (" + foot1.equals(foot2) + ")");
        System.out.println();
    }
    
    private static void demonstrateInequality() {
        System.out.println("--- Inequality Demonstrations ---");
        
        QuantityLength foot1 = new QuantityLength(1.0, LengthUnit.FEET);
        QuantityLength foot2 = new QuantityLength(2.0, LengthUnit.FEET);
        
        System.out.println("Input: " + foot1 + " and " + foot2);
        System.out.println("Output: Equal (" + foot1.equals(foot2) + ")");
        System.out.println();
        
        QuantityLength inch1 = new QuantityLength(1.0, LengthUnit.INCH);
        QuantityLength inch2 = new QuantityLength(2.0, LengthUnit.INCH);
        
        System.out.println("Input: " + inch1 + " and " + inch2);
        System.out.println("Output: Equal (" + inch1.equals(inch2) + ")");
        System.out.println();
        

    }
    

}
