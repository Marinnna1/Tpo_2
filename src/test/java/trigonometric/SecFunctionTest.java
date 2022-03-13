package trigonometric;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SecFunctionTest {

    private static final double DELTA = 0.05;
    private static final double ACCURACY = 0.001;

    private SecFunction secFunction;

    @ParameterizedTest
    @CsvFileSource(resources = "/trigonometric/sec_test.csv")
    public void tableValuesStubsTest(double expected, double num, double den) {
        secFunction = new SecFunction(ACCURACY, TrigonometricMockFactory.getCosMock());
        double actual = secFunction.calculate(num * Math.PI / den);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void nanStubsTest() {
        secFunction = new SecFunction(ACCURACY, TrigonometricMockFactory.getCosMock());
        double expected = Double.POSITIVE_INFINITY;
        double actual = secFunction.calculate(Double.NaN);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void positiveInfinityStubsTest() {
        secFunction = new SecFunction(ACCURACY, TrigonometricMockFactory.getCosMock());
        double expected = Double.POSITIVE_INFINITY;
        double actual = secFunction.calculate(Double.POSITIVE_INFINITY);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void negativeInfinityStubsTest() {
        secFunction = new SecFunction(ACCURACY, TrigonometricMockFactory.getCosMock());
        double expected = Double.POSITIVE_INFINITY;
        double actual = secFunction.calculate(Double.NEGATIVE_INFINITY);
        assertEquals(expected, actual, DELTA);
    }
}
