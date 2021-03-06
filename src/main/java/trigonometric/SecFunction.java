package trigonometric;

import function.Function;

public class SecFunction extends Function {

    private CosFunction cosFunction;

    public SecFunction(double accuracy, CosFunction cosFunction) {
        super(accuracy);
        this.cosFunction = cosFunction;
    }

    public double calculate(double x) {
        if (Math.abs(x + Math.PI) < getAccuracy()) return Double.POSITIVE_INFINITY;

        double sec =  1 / cosFunction.calculate(x);
        return Double.isFinite(sec) ? sec : Double.POSITIVE_INFINITY;
    }


}
