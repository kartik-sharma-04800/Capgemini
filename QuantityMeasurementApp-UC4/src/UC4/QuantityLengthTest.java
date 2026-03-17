package UC4;

import org.junit.Test;
import static org.junit.Assert.*;

public class QuantityLengthTest {

    @Test
    public void testFeetToFeet_Equal() {
        assertEquals(new QuantityLength(1.0, LengthUnit.FEET), new QuantityLength(1.0, LengthUnit.FEET));
    }

    @Test
    public void testInchToInch_Equal() {
        assertEquals(new QuantityLength(1.0, LengthUnit.INCH), new QuantityLength(1.0, LengthUnit.INCH));
    }

    @Test
    public void testFeetToInch_Equal() {
        assertEquals(new QuantityLength(1.0, LengthUnit.FEET), new QuantityLength(12.0, LengthUnit.INCH));
    }

    @Test
    public void testFeetToFeet_NotEqual() {
        assertNotEquals(new QuantityLength(1.0, LengthUnit.FEET), new QuantityLength(2.0, LengthUnit.FEET));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNullUnit_ThrowsException() {
        new QuantityLength(1.0, null);
    }

    @Test
    public void testHashCode_EqualObjects() {
        assertEquals(new QuantityLength(1.0, LengthUnit.FEET).hashCode(),
                new QuantityLength(12.0, LengthUnit.INCH).hashCode());
    }

    @Test
    public void testYardToYard_Equal() {
        assertEquals(new QuantityLength(1.0, LengthUnit.YARD), new QuantityLength(1.0, LengthUnit.YARD));
    }

    @Test
    public void testYardToFeet_Equal() {
        assertEquals(new QuantityLength(1.0, LengthUnit.YARD), new QuantityLength(3.0, LengthUnit.FEET));
    }

    @Test
    public void testYardToInches_Equal() {
        assertEquals(new QuantityLength(1.0, LengthUnit.YARD), new QuantityLength(36.0, LengthUnit.INCH));
    }

    @Test
    public void testYardToFeet_NotEqual() {
        assertNotEquals(new QuantityLength(1.0, LengthUnit.YARD), new QuantityLength(2.0, LengthUnit.FEET));
    }

    @Test
    public void testYardToYard_NotEqual() {
        assertNotEquals(new QuantityLength(1.0, LengthUnit.YARD), new QuantityLength(2.0, LengthUnit.YARD));
    }

    @Test
    public void testCmToCm_Equal() {
        assertEquals(new QuantityLength(2.0, LengthUnit.CENTIMETER), new QuantityLength(2.0, LengthUnit.CENTIMETER));
    }

    @Test
    public void testCmToInch_Equal() {
        assertEquals(new QuantityLength(1.0, LengthUnit.CENTIMETER), new QuantityLength(0.393701, LengthUnit.INCH));
    }

    @Test
    public void testCmToFeet_NotEqual() {
        assertNotEquals(new QuantityLength(1.0, LengthUnit.CENTIMETER), new QuantityLength(1.0, LengthUnit.FEET));
    }

    @Test
    public void testCmToCm_NotEqual() {
        assertNotEquals(new QuantityLength(1.0, LengthUnit.CENTIMETER), new QuantityLength(2.0, LengthUnit.CENTIMETER));
    }

    @Test
    public void testTransitive_YardFeetInches() {
        QuantityLength yard   = new QuantityLength(1.0,  LengthUnit.YARD);
        QuantityLength feet   = new QuantityLength(3.0,  LengthUnit.FEET);
        QuantityLength inches = new QuantityLength(36.0, LengthUnit.INCH);
        assertEquals(yard, feet);
        assertEquals(feet, inches);
        assertEquals(yard, inches);
    }

    @Test
    public void testYardToCm_Equal() {
        assertEquals(new QuantityLength(1.0, LengthUnit.YARD), new QuantityLength(91.44, LengthUnit.CENTIMETER));
    }
}