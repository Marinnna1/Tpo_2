package trigonometric;

import org.mockito.Mockito;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TrigonometricMockFactory {

    public static SinFunction getSinMock() {
        SinFunction sinFunction = mock(SinFunction.class);

        when(sinFunction.calculate(Mockito.eq(1 * Math.PI / 6))).thenReturn(0.49999999999999994);
        when(sinFunction.calculate(Mockito.eq(1 * Math.PI / 4))).thenReturn(0.7071067811865475);
        when(sinFunction.calculate(Mockito.eq(1 * Math.PI / 3))).thenReturn(0.8660254037844386);
        when(sinFunction.calculate(Mockito.eq(2 * Math.PI / 3))).thenReturn(0.8660254037844387);
        when(sinFunction.calculate(Mockito.eq(3 * Math.PI / 4))).thenReturn(0.7071067811865476);
        when(sinFunction.calculate(Mockito.eq(5 * Math.PI / 6))).thenReturn(0.49999999999999994);
        when(sinFunction.calculate(Mockito.eq(1 * Math.PI / 2))).thenReturn(1.0);
        when(sinFunction.calculate(Mockito.eq(-1 * Math.PI / 2))).thenReturn(-1.0);
        when(sinFunction.calculate(Mockito.eq(-1 * Math.PI / 4))).thenReturn(-0.7071067811865475);
        when(sinFunction.calculate(Mockito.eq(-3 * Math.PI / 4))).thenReturn(-0.7071067811865476);


        when(sinFunction.calculate(Double.POSITIVE_INFINITY)).thenReturn(Double.NaN);
        when(sinFunction.calculate(Double.NEGATIVE_INFINITY)).thenReturn(Double.NaN);
        when(sinFunction.calculate(Double.NaN)).thenReturn(Double.NaN);

        return sinFunction;
    }


    public static CosFunction getCosMock() {
        CosFunction cosFunction = mock(CosFunction.class);

        when(cosFunction.calculate(Mockito.eq(1 * Math.PI / 6))).thenReturn(0.8660254037844387);
        when(cosFunction.calculate(Mockito.eq(1 * Math.PI / 4))).thenReturn(0.7071067811865476);
        when(cosFunction.calculate(Mockito.eq(1 * Math.PI / 3))).thenReturn(0.5000000000000001);
        when(cosFunction.calculate(Mockito.eq(2 * Math.PI / 3))).thenReturn(-0.4999999999999998);
        when(cosFunction.calculate(Mockito.eq(3 * Math.PI / 4))).thenReturn(-0.7071067811865475);
        when(cosFunction.calculate(Mockito.eq(5 * Math.PI / 6))).thenReturn(-0.8660254037844387);
        when(cosFunction.calculate(Mockito.eq(1 * Math.PI / 2))).thenReturn(0.0);
        when(cosFunction.calculate(Mockito.eq(-1 * Math.PI / 2))).thenReturn(0.0);
        when(cosFunction.calculate(Mockito.eq(-1 * Math.PI / 4))).thenReturn(0.7071067811865476);
        when(cosFunction.calculate(Mockito.eq(-3 * Math.PI / 4))).thenReturn(-0.7071067811865475);

        when(cosFunction.calculate(Double.POSITIVE_INFINITY)).thenReturn(Double.NaN);
        when(cosFunction.calculate(Double.NEGATIVE_INFINITY)).thenReturn(Double.NaN);
        when(cosFunction.calculate(Double.NaN)).thenReturn(Double.NaN);

        return cosFunction;
    }


    public static TanFunction getTanMock() {
        TanFunction tanFunction = mock(TanFunction.class);

        when(tanFunction.calculate(Mockito.eq(Math.PI / 2))).thenReturn(Double.POSITIVE_INFINITY);
        when(tanFunction.calculate(Mockito.eq(- Math.PI / 2))).thenReturn(Double.POSITIVE_INFINITY);

        when(tanFunction.calculate(Mockito.eq(1 * Math.PI / 6))).thenReturn(0.5773502691896257);
        when(tanFunction.calculate(Mockito.eq(1 * Math.PI / 4))).thenReturn(0.9999999999999999);
        when(tanFunction.calculate(Mockito.eq(1 * Math.PI / 3))).thenReturn(1.7320508075688767);
        when(tanFunction.calculate(Mockito.eq(2 * Math.PI / 3))).thenReturn(-1.7320508075688783);
        when(tanFunction.calculate(Mockito.eq(3 * Math.PI / 4))).thenReturn(-1.0000000000000002);
        when(tanFunction.calculate(Mockito.eq(5 * Math.PI / 6))).thenReturn(-0.5773502691896257);

        when(tanFunction.calculate(Mockito.eq(-1 * Math.PI / 4))).thenReturn(-0.9999999999999999);
        when(tanFunction.calculate(Mockito.eq(-3 * Math.PI / 4))).thenReturn(1.0000000000000002);


        when(tanFunction.calculate(Double.POSITIVE_INFINITY)).thenReturn(Double.NaN);
        when(tanFunction.calculate(Double.NEGATIVE_INFINITY)).thenReturn(Double.NaN);
        when(tanFunction.calculate(Double.NaN)).thenReturn(Double.NaN);

        return tanFunction;
    }


    public static CotFunction getCotMock() {
        CotFunction cotFunction = mock(CotFunction.class);

        when(cotFunction.calculate(Mockito.eq(Math.PI / 2))).thenReturn(0.0);
        when(cotFunction.calculate(Mockito.eq(- Math.PI / 2))).thenReturn(0.0);

        when(cotFunction.calculate(Mockito.eq(1 * Math.PI / 6))).thenReturn(1.7320508075688774);
        when(cotFunction.calculate(Mockito.eq(1 * Math.PI / 4))).thenReturn(0.9999999999999999);
        when(cotFunction.calculate(Mockito.eq(1 * Math.PI / 3))).thenReturn(0.577350269189626);
        when(cotFunction.calculate(Mockito.eq(2 * Math.PI / 3))).thenReturn(-0.5773502691896254);
        when(cotFunction.calculate(Mockito.eq(3 * Math.PI / 4))).thenReturn(-1.0000000000000002);
        when(cotFunction.calculate(Mockito.eq(5 * Math.PI / 6))).thenReturn(-1.7320508075688774);

        when(cotFunction.calculate(Mockito.eq(-1 * Math.PI / 4))).thenReturn(-0.9999999999999999);
        when(cotFunction.calculate(Mockito.eq(-3 * Math.PI / 4))).thenReturn(1.0000000000000002);

        when(cotFunction.calculate(Double.POSITIVE_INFINITY)).thenReturn(Double.NaN);
        when(cotFunction.calculate(Double.NEGATIVE_INFINITY)).thenReturn(Double.NaN);
        when(cotFunction.calculate(Double.NaN)).thenReturn(Double.NaN);


        return cotFunction;
    }


    public static SecFunction getSecMock() {
        SecFunction secFunction = mock(SecFunction.class);

        when(secFunction.calculate(Mockito.eq(Math.PI / 2))).thenReturn(Double.POSITIVE_INFINITY);
        when(secFunction.calculate(Mockito.eq(- Math.PI / 2))).thenReturn(Double.POSITIVE_INFINITY);

        when(secFunction.calculate(Mockito.eq(1 * Math.PI / 6))).thenReturn(1.1547005383792515);
        when(secFunction.calculate(Mockito.eq(1 * Math.PI / 4))).thenReturn(1.4142129391509055);
        when(secFunction.calculate(Mockito.eq(1 * Math.PI / 3))).thenReturn(2.000000286241157);
        when(secFunction.calculate(Mockito.eq(2 * Math.PI / 3))).thenReturn(-1.9999837416585333);
        when(secFunction.calculate(Mockito.eq(3 * Math.PI / 4))).thenReturn(-1.414214136339998);
        when(secFunction.calculate(Mockito.eq(5 * Math.PI / 6))).thenReturn(-1.1547016063190183);

        when(secFunction.calculate(Mockito.eq(-1 * Math.PI / 4))).thenReturn(1.414213562373095);
        when(secFunction.calculate(Mockito.eq(-3 * Math.PI / 4))).thenReturn(-1.4142135623730951);

        when(secFunction.calculate(Double.POSITIVE_INFINITY)).thenReturn(Double.NaN);
        when(secFunction.calculate(Double.NEGATIVE_INFINITY)).thenReturn(Double.NaN);
        when(secFunction.calculate(Double.NaN)).thenReturn(Double.NaN);

        return secFunction;
    }


    public static CscFunction getCscMock() {
        CscFunction cscFunction = mock(CscFunction.class);

        when(cscFunction.calculate(Mockito.eq(Math.PI / 2))).thenReturn(1.0);
        when(cscFunction.calculate(Mockito.eq(- Math.PI / 2))).thenReturn(-1.0);

        when(cscFunction.calculate(Mockito.eq(1 * Math.PI / 6))).thenReturn(2.0000000000000004);
        when(cscFunction.calculate(Mockito.eq(1 * Math.PI / 4))).thenReturn(1.4142135623730951);
        when(cscFunction.calculate(Mockito.eq(1 * Math.PI / 3))).thenReturn(1.1547005383792517);
        when(cscFunction.calculate(Mockito.eq(2 * Math.PI / 3))).thenReturn(1.1547005383792515);
        when(cscFunction.calculate(Mockito.eq(3 * Math.PI / 4))).thenReturn(1.414213562373095);
        when(cscFunction.calculate(Mockito.eq(5 * Math.PI / 6))).thenReturn(2.0000000000000004);

        when(cscFunction.calculate(Mockito.eq(-1 * Math.PI / 4))).thenReturn(-1.4142135623730951);
        when(cscFunction.calculate(Mockito.eq(-3 * Math.PI / 4))).thenReturn(-1.414213562373095);

        when(cscFunction.calculate(Double.POSITIVE_INFINITY)).thenReturn(Double.NaN);
        when(cscFunction.calculate(Double.NEGATIVE_INFINITY)).thenReturn(Double.NaN);
        when(cscFunction.calculate(Double.NaN)).thenReturn(Double.NaN);

        return cscFunction;
    }


}
