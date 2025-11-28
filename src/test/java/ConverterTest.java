import com.david.Converter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConverterTest {

    Converter converter = new Converter();

    @Test
    void testCelsiusToFahrenheit() {
        assertEquals(32.0, converter.celsiusToFahrenheit(0), 0.001);
        assertEquals(212.0, converter.celsiusToFahrenheit(100), 0.001);
    }

    @Test
    void testKilometersToMiles() {
        assertEquals(6.21371, converter.kilometersToMiles(10), 0.0001);
    }

    @Test
    void testKilogramsToPounds() {
        assertEquals(22.0462, converter.kilogramsToPounds(10), 0.0001);
    }
}
