package logariphmic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class LnFunctionTest {
   private static final double DELTA = 0.05;
    private static final double ACCURACY = 0.001;

    private LnFunction lnFunction;


    @ParameterizedTest
    @CsvFileSource(resources = "/logariphmic/ln_test.csv")
    @DisplayName("Test data from table")
    public void tableValuesTest(double expected, double num, double den) {
        lnFunction = new LnFunction(ACCURACY);
        double actual = lnFunction.calculate(num * Math.PI / den);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    @DisplayName("Test nan")
    public void nanStubsTest() {
        lnFunction = new LnFunction(ACCURACY);
        double expected = Double.NaN;
        double actual = lnFunction.calculate(Double.NaN);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    @DisplayName("Test positive infinity")
    public void positiveInfinityStubsTest() {
        lnFunction = new LnFunction(ACCURACY);
        double expected = Double.POSITIVE_INFINITY;
        double actual = lnFunction.calculate(Double.POSITIVE_INFINITY);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    @DisplayName("Test negative infinity")
    public void negativeInfinityStubsTest() {
        lnFunction = new LnFunction(ACCURACY);
        double expected = Double.NaN;
        double actual = lnFunction.calculate(Double.NEGATIVE_INFINITY);
        assertEquals(expected, actual, DELTA);
    }
}
