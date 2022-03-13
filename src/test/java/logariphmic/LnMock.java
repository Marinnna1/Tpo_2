package logariphmic;

import function.Function;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class LnMock {


    public static LnFunction getLnMock() {
        LnFunction lnFunction = mock(LnFunction.class);

        when(lnFunction.calculate(Mockito.eq(1 * Math.PI / 6))).thenReturn(-0.64645);
        when(lnFunction.calculate(Mockito.eq(1 * Math.PI / 4))).thenReturn(-0.24145347290444164);
        when(lnFunction.calculate(Mockito.eq(1 * Math.PI / 3))).thenReturn(0.046117597181290375);
        when(lnFunction.calculate(Mockito.eq(2 * Math.PI / 3))).thenReturn(0.73973);
        when(lnFunction.calculate(Mockito.eq(3 * Math.PI / 4))).thenReturn(0.85725);
        when(lnFunction.calculate(Mockito.eq(5 * Math.PI / 6))).thenReturn(0.96183);
        when(lnFunction.calculate(Mockito.eq(1 * Math.PI / 2))).thenReturn(0.45182);

        when(lnFunction.calculate(Mockito.eq(-1 * Math.PI / 2))).thenReturn(Double.NaN);

        when(lnFunction.calculate(Mockito.eq(10.0))).thenReturn(2.3025850929940);

        when(lnFunction.calculate(Mockito.eq(-1 * Math.PI / 4))).thenReturn(Double.NaN);
        when(lnFunction.calculate(Mockito.eq(-3 * Math.PI / 4))).thenReturn(Double.NaN);

        when(lnFunction.calculate(Double.POSITIVE_INFINITY)).thenReturn(Double.POSITIVE_INFINITY);
        when(lnFunction.calculate(Double.NEGATIVE_INFINITY)).thenReturn(Double.NaN);
        when(lnFunction.calculate(Double.NaN)).thenReturn(Double.NaN);

        return lnFunction;
    }


    public static LogTenFunction getLogTenMock() {
        LogTenFunction logTenFunction = mock(LogTenFunction.class);

        when(logTenFunction.calculate(Mockito.eq(1 * Math.PI / 6))).thenReturn(-0.28075);
        when(logTenFunction.calculate(Mockito.eq(1 * Math.PI / 4))).thenReturn(-0.10486);
        when(logTenFunction.calculate(Mockito.eq(1 * Math.PI / 3))).thenReturn(0.020028617974471367);
        when(logTenFunction.calculate(Mockito.eq(2 * Math.PI / 3))).thenReturn(0.32126);
        when(logTenFunction.calculate(Mockito.eq(3 * Math.PI / 4))).thenReturn(0.3723);
        when(logTenFunction.calculate(Mockito.eq(5 * Math.PI / 6))).thenReturn(0.41772);

        when(logTenFunction.calculate(Mockito.eq(1 * Math.PI / 2))).thenReturn(0.19622);

        when(logTenFunction.calculate(Mockito.eq(-1 * Math.PI / 4))).thenReturn(Double.NaN);
        when(logTenFunction.calculate(Mockito.eq(-3 * Math.PI / 4))).thenReturn(Double.NaN);
        when(logTenFunction.calculate(Mockito.eq(-1 * Math.PI / 2))).thenReturn(Double.NaN);
        when(logTenFunction.calculate(Mockito.eq(-Math.PI ))).thenReturn(Double.NaN);

        when(logTenFunction.calculate(Double.POSITIVE_INFINITY)).thenReturn(Double.POSITIVE_INFINITY);
        when(logTenFunction.calculate(Double.NEGATIVE_INFINITY)).thenReturn(Double.NaN);
        when(logTenFunction.calculate(Double.NaN)).thenReturn(Double.NaN);


        return logTenFunction;
    }



}
