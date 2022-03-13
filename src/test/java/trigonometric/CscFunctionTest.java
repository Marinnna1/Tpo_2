package trigonometric;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import static org.junit.jupiter.api.Assertions.*;

public class CscFunctionTest {
    private static final double DELTA = 0.05;
    private static final double ACCURACY = 0.001;

    private CscFunction cscFunction;

    @ParameterizedTest
    @CsvFileSource(resources = "/trigonometric/csc_test.csv")
    public void tableValuesStubsTest(double expected, double num, double den) {
        cscFunction = new CscFunction(ACCURACY, TrigonometricMockFactory.getSinMock());
        double actual = cscFunction.calculate(num * Math.PI / den);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void nanStubsTest() {
        cscFunction = new CscFunction(ACCURACY, TrigonometricMockFactory.getSinMock());
        double expected = Double.POSITIVE_INFINITY;
        double actual = cscFunction.calculate(Double.NaN);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void positiveInfinityStubsTest() {
        cscFunction = new CscFunction(ACCURACY, TrigonometricMockFactory.getSinMock());
        double expected = Double.POSITIVE_INFINITY;
        double actual = cscFunction.calculate(Double.POSITIVE_INFINITY);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void negativeInfinityStubsTest() {
        cscFunction = new CscFunction(ACCURACY, TrigonometricMockFactory.getSinMock());
        double expected = Double.POSITIVE_INFINITY;
        double actual = cscFunction.calculate(Double.NEGATIVE_INFINITY);
        assertEquals(expected, actual, DELTA);
    }

}
