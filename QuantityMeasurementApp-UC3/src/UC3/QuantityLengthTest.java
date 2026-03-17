package UC3;

import org.junit.Test;
import static org.junit.Assert.*;

public class QuantityLengthTest {

    @Test
    public void testEquality_FeetToFeet_SameValue() {
        QuantityLength quantity1 = new QuantityLength(1.0, LengthUnit.FEET);
        QuantityLength quantity2 = new QuantityLength(1.0, LengthUnit.FEET);
        assertEquals("Identical feet measurements should be equal", quantity1, quantity2);
    }

    @Test
    public void testEquality_InchToInch_SameValue() {
        QuantityLength quantity1 = new QuantityLength(1.0, LengthUnit.INCH);
        QuantityLength quantity2 = new QuantityLength(1.0, LengthUnit.INCH);
        assertEquals("Identical inch measurements should be equal", quantity1, quantity2);
    }

    @Test
    public void testEquality_FeetToInch_EquivalentValue() {
        QuantityLength feet = new QuantityLength(1.0, LengthUnit.FEET);
        QuantityLength inches = new QuantityLength(12.0, LengthUnit.INCH);
        assertEquals("1 foot should equal 12 inches", feet, inches);
    }

    @Test
    public void testEquality_InchToFeet_EquivalentValue() {
        QuantityLength inches = new QuantityLength(12.0, LengthUnit.INCH);
        QuantityLength feet = new QuantityLength(1.0, LengthUnit.FEET);
        assertEquals("12 inches should equal 1 foot", inches, feet);
    }

    @Test
    public void testEquality_FeetToFeet_DifferentValue() {
        QuantityLength quantity1 = new QuantityLength(1.0, LengthUnit.FEET);
        QuantityLength quantity2 = new QuantityLength(2.0, LengthUnit.FEET);
        assertNotEquals("Different feet measurements should not be equal", quantity1, quantity2);
    }

    @Test
    public void testEquality_InchToInch_DifferentValue() {
        QuantityLength quantity1 = new QuantityLength(1.0, LengthUnit.INCH);
        QuantityLength quantity2 = new QuantityLength(2.0, LengthUnit.INCH);
        assertNotEquals("Different inch measurements should not be equal", quantity1, quantity2);
    }

    @Test
    public void testEquality_SameReference() {
        QuantityLength quantity = new QuantityLength(1.0, LengthUnit.FEET);
        assertEquals("Object should equal itself (reflexive property)", quantity, quantity);
    }

    @Test
    public void testEquality_NullComparison() {
        QuantityLength quantity = new QuantityLength(1.0, LengthUnit.FEET);
        assertNotEquals("Object should not equal null", quantity, null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEquality_NullUnit() {
        new QuantityLength(1.0, null);
    }

    @Test
    public void testEquality_DifferentTypes() {
        QuantityLength quantity = new QuantityLength(1.0, LengthUnit.FEET);
        String notAQuantity = "not a quantity";
        assertNotEquals("Quantity should not equal objects of different types", quantity, notAQuantity);
    }

    @Test
    public void testEquality_YardToFeet_EquivalentValue() {
        QuantityLength yard = new QuantityLength(1.0, LengthUnit.YARD);
        QuantityLength feet = new QuantityLength(3.0, LengthUnit.FEET);
        assertEquals("1 yard should equal 3 feet", yard, feet);
    }

    @Test
    public void testEquality_CentimeterToInch_EquivalentValue() {
        QuantityLength cm = new QuantityLength(30.48, LengthUnit.CENTIMETER);
        QuantityLength inch = new QuantityLength(12.0, LengthUnit.INCH);
        assertEquals("30.48 cm should equal 12 inches (1 foot)", cm, inch);
    }

    @Test
    public void testEquality_TransitiveProperty() {
        QuantityLength feet1 = new QuantityLength(1.0, LengthUnit.FEET);
        QuantityLength inches = new QuantityLength(12.0, LengthUnit.INCH);
        QuantityLength feet2 = new QuantityLength(1.0, LengthUnit.FEET);
        
        assertEquals("Transitive property: a=b and b=c implies a=c", feet1, feet2);
        assertEquals("Transitive property: a=b", feet1, inches);
        assertEquals("Transitive property: b=c", inches, feet2);
    }

    @Test
    public void testEquality_SymmetricProperty() {
        QuantityLength feet = new QuantityLength(1.0, LengthUnit.FEET);
        QuantityLength inches = new QuantityLength(12.0, LengthUnit.INCH);
        
        assertTrue("Symmetric property: if a.equals(b) then b.equals(a)", feet.equals(inches));
        assertTrue("Symmetric property: if b.equals(a) then a.equals(b)", inches.equals(feet));
    }

    @Test
    public void testEquality_ConsistentProperty() {
        QuantityLength feet = new QuantityLength(1.0, LengthUnit.FEET);
        QuantityLength inches = new QuantityLength(12.0, LengthUnit.INCH);
        
        assertTrue("Consistent property: multiple calls return same result", feet.equals(inches));
        assertTrue("Consistent property: multiple calls return same result", feet.equals(inches));
        assertTrue("Consistent property: multiple calls return same result", feet.equals(inches));
    }

    @Test
    public void testHashCodeConsistency() {
        QuantityLength quantity1 = new QuantityLength(1.0, LengthUnit.FEET);
        QuantityLength quantity2 = new QuantityLength(12.0, LengthUnit.INCH);
        
        assertEquals("Equal objects should have same hash code", quantity1.hashCode(), quantity2.hashCode());
    }

    @Test
    public void testToString() {
        QuantityLength quantity = new QuantityLength(1.0, LengthUnit.FEET);
        String expected = "Quantity(1.0, feet)";
        assertEquals("toString should return formatted string", expected, quantity.toString());
    }

    @Test
    public void testGetValue() {
        QuantityLength quantity = new QuantityLength(1.5, LengthUnit.INCH);
        assertEquals("getValue should return correct value", 1.5, quantity.getValue(), 0.001);
    }

    @Test
    public void testGetUnit() {
        QuantityLength quantity = new QuantityLength(1.0, LengthUnit.FEET);
        assertEquals("getUnit should return correct unit", LengthUnit.FEET, quantity.getUnit());
    }

    @Test
    public void testConvertToBaseUnit() {
        QuantityLength feet = new QuantityLength(2.0, LengthUnit.FEET);
        QuantityLength inches = new QuantityLength(24.0, LengthUnit.INCH);
        
        assertEquals("Feet should convert to base unit correctly", 2.0, feet.convertToBaseUnit(), 0.001);
        assertEquals("Inches should convert to base unit correctly", 2.0, inches.convertToBaseUnit(), 0.001);
    }
}
