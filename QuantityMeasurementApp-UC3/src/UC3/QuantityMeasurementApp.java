package UC3;

public class QuantityMeasurementApp {
    
    public static void main(String[] args) {
        System.out.println("=== UC3: Generic Quantity Class for DRY Principle ===\n");
        

        demonstrateCrossUnitEquality();
        

        demonstrateSameUnitEquality();
        

        demonstrateInequality();
        

        demonstrateAdditionalUnits();
        
        System.out.println("\n=== All demonstrations completed successfully! ===");
        System.out.println("\nKey Concepts Demonstrated:");
        System.out.println("- DRY Principle: Single generic class handles all length units");
        System.out.println("- Polymorphism: Enum handles multiple unit types");
        System.out.println("- Type Safety: Only valid units are accepted");
        System.out.println("- Equals Contract: Reflexive, Symmetric, Transitive, Consistent");
        System.out.println("- Encapsulation: Value and unit bundled together");
        System.out.println("- Scalability: Easy to add new units without code duplication");
    }
    
    private static void demonstrateCrossUnitEquality() {
        System.out.println("--- Cross-Unit Equality Demonstrations ---");
        
        QuantityLength oneFoot = new QuantityLength(1.0, LengthUnit.FEET);
        QuantityLength twelveInches = new QuantityLength(12.0, LengthUnit.INCH);
        
        System.out.println("Input: " + oneFoot + " and " + twelveInches);
        System.out.println("Output: Equal (" + oneFoot.equals(twelveInches) + ")");
        System.out.println();
        
        QuantityLength oneYard = new QuantityLength(1.0, LengthUnit.YARD);
        QuantityLength threeFeet = new QuantityLength(3.0, LengthUnit.FEET);
        
        System.out.println("Input: " + oneYard + " and " + threeFeet);
        System.out.println("Output: Equal (" + oneYard.equals(threeFeet) + ")");
        System.out.println();
        
        QuantityLength thirtyPoint48CM = new QuantityLength(30.48, LengthUnit.CENTIMETER);
        QuantityLength oneFootAgain = new QuantityLength(1.0, LengthUnit.FEET);
        
        System.out.println("Input: " + thirtyPoint48CM + " and " + oneFootAgain);
        System.out.println("Output: Equal (" + thirtyPoint48CM.equals(oneFootAgain) + ")");
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
        
        // Demonstrate null comparison
        System.out.println("Input: " + foot1 + " and null");
        System.out.println("Output: Equal (" + foot1.equals(null) + ")");
        System.out.println();
    }
    
    private static void demonstrateAdditionalUnits() {
        System.out.println("--- Additional Unit Demonstrations ---");
        
        // Demonstrate reflexive property
        QuantityLength quantity = new QuantityLength(5.0, LengthUnit.YARD);
        System.out.println("Reflexive Property: " + quantity + ".equals(" + quantity + ") = " + quantity.equals(quantity));
        
        // Demonstrate symmetric property
        QuantityLength quantityInFeet = new QuantityLength(15.0, LengthUnit.FEET);
        System.out.println("Symmetric Property:");
        System.out.println("  " + quantity + ".equals(" + quantityInFeet + ") = " + quantity.equals(quantityInFeet));
        System.out.println("  " + quantityInFeet + ".equals(" + quantity + ") = " + quantityInFeet.equals(quantity));
        
        // Demonstrate transitive property
        QuantityLength quantityInInches = new QuantityLength(180.0, LengthUnit.INCH);
        System.out.println("Transitive Property:");
        System.out.println("  " + quantity + ".equals(" + quantityInFeet + ") = " + quantity.equals(quantityInFeet));
        System.out.println("  " + quantityInFeet + ".equals(" + quantityInInches + ") = " + quantityInFeet.equals(quantityInInches));
        System.out.println("  " + quantity + ".equals(" + quantityInInches + ") = " + quantity.equals(quantityInInches));
        System.out.println();
    }
}
