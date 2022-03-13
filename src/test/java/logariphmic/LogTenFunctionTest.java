package logariphmic;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import static org.junit.jupiter.api.Assertions.*;

public class LogTenFunctionTest {

    private static final double DELTA = 0.05;
    private static final double ACCURACY = 0.001;

    private LogTenFunction logTenFunction;

    @ParameterizedTest
    @CsvFileSource(resources = "/logariphmic/log10_test.csv")
    public void tableValuesStubsTest(double expected, double num, double den) {
        logTenFunction = new LogTenFunction(ACCURACY, LnMock.getLnMock());
        double actual = logTenFunction.calculate(num * Math.PI / den);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void nanStubsTest() {
        logTenFunction = new LogTenFunction(ACCURACY, LnMock.getLnMock());
        double expected = Double.NaN;
        double actual = logTenFunction.calculate(Double.NaN);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void positiveInfinityStubsTest() {
        logTenFunction = new LogTenFunction(ACCURACY, LnMock.getLnMock());
        double expected = Double.POSITIVE_INFINITY;
        double actual = logTenFunction.calculate(Double.POSITIVE_INFINITY);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void negativeInfinityStubsTest() {
        logTenFunction = new LogTenFunction(ACCURACY, LnMock.getLnMock());
        double expected = Double.NaN;
        double actual = logTenFunction.calculate(Double.NEGATIVE_INFINITY);
        assertEquals(expected, actual, DELTA);
    }

}
