package UC1;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuantityMeasurementAppTest {


        @Test
        void givenTwoFeetValues_whenBothAreOneFoot_thenShouldBeEqual() {
            QuantityMeasurementApp.Feet feet1 = new QuantityMeasurementApp.Feet(1.0);
            QuantityMeasurementApp.Feet feet2 = new QuantityMeasurementApp.Feet(1.0);
            assertEquals(feet1, feet2);
        }


        @Test
        void givenTwoFeetValues_whenValuesAreDifferent_thenShouldNotBeEqual() {
            QuantityMeasurementApp.Feet feet1 = new QuantityMeasurementApp.Feet(1.0);
            QuantityMeasurementApp.Feet feet2 = new QuantityMeasurementApp.Feet(2.0);
            assertNotEquals(feet1, feet2);
        }


        @Test
        void givenFeetValue_whenComparedWithNull_thenShouldReturnFalse() {
            QuantityMeasurementApp.Feet feet1 = new QuantityMeasurementApp.Feet(1.0);
            assertNotEquals(null, feet1);
        }


        @Test
        void givenFeetValue_whenComparedWithNonNumericInput_thenShouldReturnFalse() {
            QuantityMeasurementApp.Feet feet1 = new QuantityMeasurementApp.Feet(1.0);
            String nonNumeric = "one foot";
            assertNotEquals(feet1, nonNumeric);
        }


        @Test
        void givenFeetValue_whenComparedWithItself_thenShouldBeEqual() {
            QuantityMeasurementApp.Feet feet1 = new QuantityMeasurementApp.Feet(1.0);
            assertEquals(feet1, feet1);
        }
}
