package UC2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class QuantityMeasurementAppTest {

    @Test
    void givenTwoFeetValues_whenBothAreOneFoot_thenShouldBeEqual() {
        QuantityMeasurementApp.Feet feet1 = new QuantityMeasurementApp.Feet(1.0);
        QuantityMeasurementApp.Feet feet2 = new QuantityMeasurementApp.Feet(1.0);
        assertTrue(feet1.equals(feet2), "1.0 ft and 1.0 ft should be equal");
    }

    @Test
    void givenTwoFeetValues_whenValuesAreDifferent_thenShouldNotBeEqual() {
        QuantityMeasurementApp.Feet feet1 = new QuantityMeasurementApp.Feet(1.0);
        QuantityMeasurementApp.Feet feet2 = new QuantityMeasurementApp.Feet(2.0);
        assertFalse(feet1.equals(feet2), "1.0 ft and 2.0 ft should not be equal");
    }

    @Test
    void givenFeetValue_whenComparedWithNull_thenShouldReturnFalse() {
        QuantityMeasurementApp.Feet feet1 = new QuantityMeasurementApp.Feet(1.0);
        assertFalse(feet1.equals(null), "A Feet value compared to null should return false");
    }

    @Test
    void givenFeetValue_whenComparedWithNonNumericInput_thenShouldReturnFalse() {
        QuantityMeasurementApp.Feet feet1 = new QuantityMeasurementApp.Feet(1.0);
        assertFalse(feet1.equals("one foot"), "A Feet value compared to a String should return false");
    }

    @Test
    void givenFeetValue_whenComparedWithItself_thenShouldBeEqual() {
        QuantityMeasurementApp.Feet feet1 = new QuantityMeasurementApp.Feet(1.0);
        assertTrue(feet1.equals(feet1), "A Feet value compared to itself should return true");
    }
}

