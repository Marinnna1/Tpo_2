package main;

import logariphmic.LnFunction;
import logariphmic.LnMock;
import logariphmic.LogTenFunction;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import trigonometric.*;

import static org.junit.jupiter.api.Assertions.*;


public class CalculatorTest {

    private static final double DELTA = 0.05;
    private static final double ACCURACY = 0.001;
    static Calculator calculator;


    @AfterAll
    static void logInCSV() {
        CsvLogger csvLogger = new CsvLogger("output/function_results.csv");
        csvLogger.log(calculator);
   }

    @ParameterizedTest
    @CsvFileSource(resources = "/main/function_test.csv")
    public void stubsTest(double expected, double num, double den) {
        calculator = new Calculator(ACCURACY, TrigonometricMockFactory.getCosMock(), TrigonometricMockFactory.getCotMock(),
                TrigonometricMockFactory.getCscMock(), TrigonometricMockFactory.getSecMock(),
                TrigonometricMockFactory.getTanMock(), LnMock.getLnMock(), LnMock.getLogTenMock());
        double actual = calculator.calculate(num * Math.PI / den);

        assertEquals(expected, actual, DELTA);
    }


    @ParameterizedTest
    @CsvFileSource(resources = "/main/function_test.csv")
    public void lnStubTest(double expected, double num, double den) {
        SinFunction sinFunction = new SinFunction(ACCURACY);
        CosFunction cosFunction = new CosFunction(ACCURACY, sinFunction);
        TanFunction tanFunction = new TanFunction(ACCURACY, sinFunction, cosFunction);
        CotFunction cotFunction = new CotFunction(ACCURACY, tanFunction);
        CscFunction cscFunction = new CscFunction(ACCURACY, sinFunction);
        SecFunction secFunction = new SecFunction(ACCURACY, cosFunction);
        LnFunction lnFunction = LnMock.getLnMock();
        LogTenFunction logTenFunction = new LogTenFunction(ACCURACY, lnFunction);
        calculator = new Calculator(ACCURACY, cosFunction, cotFunction,
                cscFunction, secFunction, tanFunction, lnFunction, logTenFunction);
        double actual = calculator.calculate(num * Math.PI / den);

        assertEquals(expected, actual, DELTA);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/main/function_test.csv")
    public void logTenStubTest(double expected, double num, double den) {
        SinFunction sinFunction = new SinFunction(ACCURACY);
        CosFunction cosFunction = new CosFunction(ACCURACY, sinFunction);
        TanFunction tanFunction = new TanFunction(ACCURACY, sinFunction, cosFunction);
        CotFunction cotFunction = new CotFunction(ACCURACY, tanFunction);
        CscFunction cscFunction = new CscFunction(ACCURACY, sinFunction);
        SecFunction secFunction = new SecFunction(ACCURACY, cosFunction);
        LnFunction lnFunction = new LnFunction(ACCURACY);
        LogTenFunction logTenFunction = LnMock.getLogTenMock();
        calculator = new Calculator(ACCURACY, cosFunction, cotFunction,
                cscFunction, secFunction, tanFunction, lnFunction, logTenFunction);
        double actual = calculator.calculate(num * Math.PI / den);

        assertEquals(expected, actual, DELTA);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/main/function_test.csv")
    public void sinStubTest(double expected, double num, double den) {
        SinFunction sinFunction = TrigonometricMockFactory.getSinMock();
        CosFunction cosFunction = new CosFunction(ACCURACY, sinFunction);
        TanFunction tanFunction = new TanFunction(ACCURACY, sinFunction, cosFunction);
        CotFunction cotFunction = new CotFunction(ACCURACY, tanFunction);
        CscFunction cscFunction = new CscFunction(ACCURACY, sinFunction);
        SecFunction secFunction = new SecFunction(ACCURACY, cosFunction);
        LnFunction lnFunction = new LnFunction(ACCURACY);
        LogTenFunction logTenFunction = LnMock.getLogTenMock();
        calculator = new Calculator(ACCURACY, cosFunction, cotFunction,
                cscFunction, secFunction, tanFunction, lnFunction, logTenFunction);
        double actual = calculator.calculate(num * Math.PI / den);

        assertEquals(expected, actual, DELTA);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/main/function_test.csv")
    public void cosStubTest(double expected, double num, double den) {
        SinFunction sinFunction = new SinFunction(ACCURACY);
        CosFunction cosFunction = TrigonometricMockFactory.getCosMock();
        TanFunction tanFunction = new TanFunction(ACCURACY, sinFunction, cosFunction);
        CotFunction cotFunction = new CotFunction(ACCURACY, tanFunction);
        CscFunction cscFunction = new CscFunction(ACCURACY, sinFunction);
        SecFunction secFunction = new SecFunction(ACCURACY, cosFunction);
        LnFunction lnFunction = new LnFunction(ACCURACY);
        LogTenFunction logTenFunction = LnMock.getLogTenMock();
        calculator = new Calculator(ACCURACY, cosFunction, cotFunction,
                cscFunction, secFunction, tanFunction, lnFunction, logTenFunction);
        double actual = calculator.calculate(num * Math.PI / den);

        assertEquals(expected, actual, DELTA);
    }


    @ParameterizedTest
    @CsvFileSource(resources = "/main/function_test.csv")
    public void tanStubTest(double expected, double num, double den) {
        SinFunction sinFunction = new SinFunction(ACCURACY);
        CosFunction cosFunction = new CosFunction(ACCURACY, sinFunction);
        TanFunction tanFunction = TrigonometricMockFactory.getTanMock();
        CotFunction cotFunction = new CotFunction(ACCURACY, tanFunction);
        CscFunction cscFunction = new CscFunction(ACCURACY, sinFunction);
        SecFunction secFunction = new SecFunction(ACCURACY, cosFunction);
        LnFunction lnFunction = new LnFunction(ACCURACY);
        LogTenFunction logTenFunction = LnMock.getLogTenMock();
        calculator = new Calculator(ACCURACY, cosFunction, cotFunction,
                cscFunction, secFunction, tanFunction, lnFunction, logTenFunction);
        double actual = calculator.calculate(num * Math.PI / den);

        assertEquals(expected, actual, DELTA);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/main/function_test.csv")
    public void cotStubTest(double expected, double num, double den) {
        SinFunction sinFunction = new SinFunction(ACCURACY);
        CosFunction cosFunction = new CosFunction(ACCURACY, sinFunction);
        TanFunction tanFunction = new TanFunction(ACCURACY, sinFunction, cosFunction);
        CotFunction cotFunction = TrigonometricMockFactory.getCotMock();
        CscFunction cscFunction = new CscFunction(ACCURACY, sinFunction);
        SecFunction secFunction = new SecFunction(ACCURACY, cosFunction);
        LnFunction lnFunction = new LnFunction(ACCURACY);
        LogTenFunction logTenFunction = LnMock.getLogTenMock();
        calculator = new Calculator(ACCURACY, cosFunction, cotFunction,
                cscFunction, secFunction, tanFunction, lnFunction, logTenFunction);
        double actual = calculator.calculate(num * Math.PI / den);

        assertEquals(expected, actual, DELTA);
    }


    @ParameterizedTest
    @CsvFileSource(resources = "/main/function_test.csv")
    public void cscStubTest(double expected, double num, double den) {
        SinFunction sinFunction = new SinFunction(ACCURACY);
        CosFunction cosFunction = new CosFunction(ACCURACY, sinFunction);
        TanFunction tanFunction = new TanFunction(ACCURACY, sinFunction, cosFunction);
        CotFunction cotFunction = new CotFunction(ACCURACY, tanFunction);
        CscFunction cscFunction = TrigonometricMockFactory.getCscMock();
        SecFunction secFunction = new SecFunction(ACCURACY, cosFunction);
        LnFunction lnFunction = new LnFunction(ACCURACY);
        LogTenFunction logTenFunction = LnMock.getLogTenMock();
        calculator = new Calculator(ACCURACY, cosFunction, cotFunction,
                cscFunction, secFunction, tanFunction, lnFunction, logTenFunction);
        double actual = calculator.calculate(num * Math.PI / den);

        assertEquals(expected, actual, DELTA);
    }


    @ParameterizedTest
    @CsvFileSource(resources = "/main/function_test.csv")
    public void secStubTest(double expected, double num, double den) {
        SinFunction sinFunction = new SinFunction(ACCURACY);
        CosFunction cosFunction = new CosFunction(ACCURACY, sinFunction);
        TanFunction tanFunction = new TanFunction(ACCURACY, sinFunction, cosFunction);
        CotFunction cotFunction = new CotFunction(ACCURACY, tanFunction);
        CscFunction cscFunction = new CscFunction(ACCURACY, sinFunction);
        SecFunction secFunction = TrigonometricMockFactory.getSecMock();
        LnFunction lnFunction = new LnFunction(ACCURACY);
        LogTenFunction logTenFunction = LnMock.getLogTenMock();
        calculator = new Calculator(ACCURACY, cosFunction, cotFunction,
                cscFunction, secFunction, tanFunction, lnFunction, logTenFunction);
        double actual = calculator.calculate(num * Math.PI / den);

        assertEquals(expected, actual, DELTA);
    }
}
