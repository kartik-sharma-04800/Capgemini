package UC3;

public class SimpleTestRunner {
    
    private static int testsRun = 0;
    private static int testsPassed = 0;
    
    public static void main(String[] args) {
        System.out.println("=== Running UC3 Test Suite ===\n");
        

        testEquality_FeetToFeet_SameValue();
        testEquality_InchToInch_SameValue();
        testEquality_FeetToInch_EquivalentValue();
        testEquality_InchToFeet_EquivalentValue();
        testEquality_FeetToFeet_DifferentValue();
        testEquality_InchToInch_DifferentValue();
        testEquality_SameReference();
        testEquality_NullComparison();
        testEquality_NullUnit();
        testEquality_DifferentTypes();
        testEquality_YardToFeet_EquivalentValue();
        testEquality_CentimeterToInch_EquivalentValue();
        testEquality_TransitiveProperty();
        testEquality_SymmetricProperty();
        testEquality_ConsistentProperty();
        testHashCodeConsistency();
        testToString();
        testGetValue();
        testGetUnit();
        testConvertToBaseUnit();
        
        System.out.println("\n=== Test Results ===");
        System.out.println("Tests Run: " + testsRun);
        System.out.println("Tests Passed: " + testsPassed);
        System.out.println("Tests Failed: " + (testsRun - testsPassed));
        System.out.println("Success Rate: " + (testsPassed * 100.0 / testsRun) + "%");
        
        if (testsPassed == testsRun) {
            System.out.println("\n✅ All tests passed! UC3 implementation is working correctly.");
        } else {
            System.out.println("\n❌ Some tests failed. Please check the implementation.");
        }
    }
    
    private static void assertTrue(String message, boolean condition) {
        testsRun++;
        if (condition) {
            testsPassed++;
            System.out.println("✅ PASS: " + message);
        } else {
            System.out.println("❌ FAIL: " + message);
        }
    }
    
    private static void assertEquals(String message, Object expected, Object actual) {
        testsRun++;
        boolean equal = (expected == null && actual == null) || 
                       (expected != null && expected.equals(actual));
        if (equal) {
            testsPassed++;
            System.out.println("✅ PASS: " + message);
        } else {
            System.out.println("❌ FAIL: " + message + " - Expected: " + expected + ", Actual: " + actual);
        }
    }
    
    private static void assertNotEquals(String message, Object expected, Object actual) {
        testsRun++;
        boolean notEqual = (expected == null && actual != null) || 
                          (expected != null && !expected.equals(actual));
        if (notEqual) {
            testsPassed++;
            System.out.println("✅ PASS: " + message);
        } else {
            System.out.println("❌ FAIL: " + message + " - Both values are equal: " + expected);
        }
    }
    
    private static void testEquality_FeetToFeet_SameValue() {
        QuantityLength quantity1 = new QuantityLength(1.0, LengthUnit.FEET);
        QuantityLength quantity2 = new QuantityLength(1.0, LengthUnit.FEET);
        assertEquals("Identical feet measurements should be equal", quantity1, quantity2);
    }

    private static void testEquality_InchToInch_SameValue() {
        QuantityLength quantity1 = new QuantityLength(1.0, LengthUnit.INCH);
        QuantityLength quantity2 = new QuantityLength(1.0, LengthUnit.INCH);
        assertEquals("Identical inch measurements should be equal", quantity1, quantity2);
    }

    private static void testEquality_FeetToInch_EquivalentValue() {
        QuantityLength feet = new QuantityLength(1.0, LengthUnit.FEET);
        QuantityLength inches = new QuantityLength(12.0, LengthUnit.INCH);
        assertEquals("1 foot should equal 12 inches", feet, inches);
    }

    private static void testEquality_InchToFeet_EquivalentValue() {
        QuantityLength inches = new QuantityLength(12.0, LengthUnit.INCH);
        QuantityLength feet = new QuantityLength(1.0, LengthUnit.FEET);
        assertEquals("12 inches should equal 1 foot", inches, feet);
    }

    private static void testEquality_FeetToFeet_DifferentValue() {
        QuantityLength quantity1 = new QuantityLength(1.0, LengthUnit.FEET);
        QuantityLength quantity2 = new QuantityLength(2.0, LengthUnit.FEET);
        assertNotEquals("Different feet measurements should not be equal", quantity1, quantity2);
    }

    private static void testEquality_InchToInch_DifferentValue() {
        QuantityLength quantity1 = new QuantityLength(1.0, LengthUnit.INCH);
        QuantityLength quantity2 = new QuantityLength(2.0, LengthUnit.INCH);
        assertNotEquals("Different inch measurements should not be equal", quantity1, quantity2);
    }

    private static void testEquality_SameReference() {
        QuantityLength quantity = new QuantityLength(1.0, LengthUnit.FEET);
        assertEquals("Object should equal itself (reflexive property)", quantity, quantity);
    }

    private static void testEquality_NullComparison() {
        QuantityLength quantity = new QuantityLength(1.0, LengthUnit.FEET);
        assertNotEquals("Object should not equal null", quantity, null);
    }

    private static void testEquality_NullUnit() {
        try {
            new QuantityLength(1.0, null);
            assertTrue("Should throw IllegalArgumentException for null unit", false);
        } catch (IllegalArgumentException e) {
            assertTrue("Should throw IllegalArgumentException for null unit", true);
        }
    }

    private static void testEquality_DifferentTypes() {
        QuantityLength quantity = new QuantityLength(1.0, LengthUnit.FEET);
        String notAQuantity = "not a quantity";
        assertNotEquals("Quantity should not equal objects of different types", quantity, notAQuantity);
    }

    private static void testEquality_YardToFeet_EquivalentValue() {
        QuantityLength yard = new QuantityLength(1.0, LengthUnit.YARD);
        QuantityLength feet = new QuantityLength(3.0, LengthUnit.FEET);
        assertEquals("1 yard should equal 3 feet", yard, feet);
    }

    private static void testEquality_CentimeterToInch_EquivalentValue() {
        QuantityLength cm = new QuantityLength(30.48, LengthUnit.CENTIMETER);
        QuantityLength inch = new QuantityLength(12.0, LengthUnit.INCH);
        assertEquals("30.48 cm should equal 12 inches (1 foot)", cm, inch);
    }

    private static void testEquality_TransitiveProperty() {
        QuantityLength feet1 = new QuantityLength(1.0, LengthUnit.FEET);
        QuantityLength inches = new QuantityLength(12.0, LengthUnit.INCH);
        QuantityLength feet2 = new QuantityLength(1.0, LengthUnit.FEET);
        
        assertTrue("Transitive property: a=b and b=c implies a=c", feet1.equals(feet2));
        assertTrue("Transitive property: a=b", feet1.equals(inches));
        assertTrue("Transitive property: b=c", inches.equals(feet2));
    }

    private static void testEquality_SymmetricProperty() {
        QuantityLength feet = new QuantityLength(1.0, LengthUnit.FEET);
        QuantityLength inches = new QuantityLength(12.0, LengthUnit.INCH);
        
        assertTrue("Symmetric property: if a.equals(b) then b.equals(a)", feet.equals(inches));
        assertTrue("Symmetric property: if b.equals(a) then a.equals(b)", inches.equals(feet));
    }

    private static void testEquality_ConsistentProperty() {
        QuantityLength feet = new QuantityLength(1.0, LengthUnit.FEET);
        QuantityLength inches = new QuantityLength(12.0, LengthUnit.INCH);
        
        assertTrue("Consistent property: multiple calls return same result", feet.equals(inches));
        assertTrue("Consistent property: multiple calls return same result", feet.equals(inches));
        assertTrue("Consistent property: multiple calls return same result", feet.equals(inches));
    }

    private static void testHashCodeConsistency() {
        QuantityLength quantity1 = new QuantityLength(1.0, LengthUnit.FEET);
        QuantityLength quantity2 = new QuantityLength(12.0, LengthUnit.INCH);
        
        assertEquals("Equal objects should have same hash code", quantity1.hashCode(), quantity2.hashCode());
    }

    private static void testToString() {
        QuantityLength quantity = new QuantityLength(1.0, LengthUnit.FEET);
        String expected = "Quantity(1.0, feet)";
        assertEquals("toString should return formatted string", expected, quantity.toString());
    }

    private static void testGetValue() {
        QuantityLength quantity = new QuantityLength(1.5, LengthUnit.INCH);
        assertEquals("getValue should return correct value", 1.5, quantity.getValue());
    }

    private static void testGetUnit() {
        QuantityLength quantity = new QuantityLength(1.0, LengthUnit.FEET);
        assertEquals("getUnit should return correct unit", LengthUnit.FEET, quantity.getUnit());
    }

    private static void testConvertToBaseUnit() {
        QuantityLength feet = new QuantityLength(2.0, LengthUnit.FEET);
        QuantityLength inches = new QuantityLength(24.0, LengthUnit.INCH);
        
        assertEquals("Feet should convert to base unit correctly", 2.0, feet.convertToBaseUnit());
        assertEquals("Inches should convert to base unit correctly", 2.0, inches.convertToBaseUnit());
    }
}
