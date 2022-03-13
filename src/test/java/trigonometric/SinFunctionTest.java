package trigonometric;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import static org.junit.jupiter.api.Assertions.*;

public class SinFunctionTest {


    private static final double DELTA = 0.05;
    private static final double ACCURACY = 0.0001;

    private SinFunction sinFunction;

    @ParameterizedTest
    @CsvFileSource(resources = "/trigonometric/sin_test.csv")
    public void tableValuesStubsTest(double expected, double num, double den) {
        sinFunction = new SinFunction(ACCURACY);
        double actual = sinFunction.calculate(num * Math.PI / den);
        assertEquals(expected, actual, DELTA);
    }


    @Test
    public void nanStubsTest() {
        sinFunction = new SinFunction(ACCURACY);
        double expected = Double.NaN;
        double actual = sinFunction.calculate(Double.NaN);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void positiveInfinityStubsTest() {
        sinFunction = new SinFunction(ACCURACY);
        double expected = Double.NaN;
        double actual = sinFunction.calculate(Double.POSITIVE_INFINITY);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void negativeInfinityStubsTest() {
        sinFunction = new SinFunction(ACCURACY);
        double expected = Double.NaN;
        double actual = sinFunction.calculate(Double.NEGATIVE_INFINITY);
        assertEquals(expected, actual, DELTA);
    }
}
