package trigonometric;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CotFunctionTest {
    private static final double DELTA = 0.05;
    private static final double ACCURACY = 0.001;

    private CotFunction cotFunction;

    @ParameterizedTest
    @CsvFileSource(resources = "/trigonometric/cot_test.csv")
    public void tableValuesStubsTest(double expected, double num, double den) {
        cotFunction = new CotFunction(ACCURACY, TrigonometricMockFactory.getTanMock());
        double actual = cotFunction.calculate(num * Math.PI / den);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void nanStubsTest() {
        cotFunction = new CotFunction(ACCURACY, TrigonometricMockFactory.getTanMock());
        double expected = Double.POSITIVE_INFINITY;
        double actual = cotFunction.calculate(Double.NaN);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void positiveInfinityStubsTest() {
        cotFunction = new CotFunction(ACCURACY, TrigonometricMockFactory.getTanMock());
        double expected = Double.POSITIVE_INFINITY;
        double actual = cotFunction.calculate(Double.POSITIVE_INFINITY);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void negativeInfinityStubsTest() {
        cotFunction = new CotFunction(ACCURACY, TrigonometricMockFactory.getTanMock());
        double expected = Double.POSITIVE_INFINITY;
        double actual = cotFunction.calculate(Double.NEGATIVE_INFINITY);
        assertEquals(expected, actual, DELTA);
    }
}
