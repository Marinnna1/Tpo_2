package trigonometric;

import function.Function;

public class CscFunction extends Function {

    private SinFunction sinFunction;

    public CscFunction(double accuracy, SinFunction sinFunction) {
        super(accuracy);
        this.sinFunction = sinFunction;
    }

    public double calculate(double x) {
        if (Math.abs(x + Math.PI) < getAccuracy()) return Double.POSITIVE_INFINITY;

        double csc =  1 / sinFunction.calculate(x);
        return Double.isFinite(csc) ? csc : Double.POSITIVE_INFINITY;

    }
}
