package trigonometric;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import static org.junit.jupiter.api.Assertions.*;

public class TanFunctionTest {

    private static final double DELTA = 0.05;
    private static final double ACCURACY = 0.001;

    private TanFunction tanFunction;

    @ParameterizedTest
    @CsvFileSource(resources = "/trigonometric/tan_test.csv")
    public void tableValuesStubsTest(double expected, double num, double den) {
        tanFunction = new TanFunction(ACCURACY, TrigonometricMockFactory.getSinMock(), TrigonometricMockFactory.getCosMock());
        double actual = tanFunction.calculate(num * Math.PI / den);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void nanStubsTest() {
        tanFunction = new TanFunction(ACCURACY, TrigonometricMockFactory.getSinMock(), TrigonometricMockFactory.getCosMock());
        double expected = Double.POSITIVE_INFINITY;
        double actual = tanFunction.calculate(Double.NaN);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void positiveInfinityStubsTest() {
        tanFunction = new TanFunction(ACCURACY, TrigonometricMockFactory.getSinMock(), TrigonometricMockFactory.getCosMock());
        double expected = Double.POSITIVE_INFINITY;
        double actual = tanFunction.calculate(Double.POSITIVE_INFINITY);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void negativeInfinityStubsTest() {
        tanFunction = new TanFunction(ACCURACY, TrigonometricMockFactory.getSinMock(), TrigonometricMockFactory.getCosMock());
        double expected = Double.POSITIVE_INFINITY;
        double actual = tanFunction.calculate(Double.NEGATIVE_INFINITY);
        assertEquals(expected, actual, DELTA);
    }

}
