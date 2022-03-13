package trigonometric;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import static org.junit.jupiter.api.Assertions.*;

public class CosFunctionTest {
    private static final double DELTA = 0.05;
    private static final double ACCURACY = 0.001;

    private CosFunction cosFunction;

    @ParameterizedTest
    @CsvFileSource(resources = "/trigonometric/cos_test.csv")
    public void tableValuesStubsTest(double expected, double num, double den) {
        cosFunction = new CosFunction(ACCURACY, TrigonometricMockFactory.getSinMock());
        double actual = cosFunction.calculate(num * Math.PI / den);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void nanStubsTest() {
        cosFunction = new CosFunction(ACCURACY, TrigonometricMockFactory.getSinMock());
        double expected = Double.NaN;
        double actual = cosFunction.calculate(Double.NaN);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void positiveInfinityStubsTest() {
        cosFunction = new CosFunction(ACCURACY, TrigonometricMockFactory.getSinMock());
        double expected = Double.NaN;
        double actual = cosFunction.calculate(Double.POSITIVE_INFINITY);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void negativeInfinityStubsTest() {
        cosFunction = new CosFunction(ACCURACY, TrigonometricMockFactory.getSinMock());
        double expected = Double.NaN;
        double actual = cosFunction.calculate(Double.NEGATIVE_INFINITY);
        assertEquals(expected, actual, DELTA);
    }
}
