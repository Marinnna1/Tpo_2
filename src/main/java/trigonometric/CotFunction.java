package trigonometric;

import function.Function;

public class CotFunction extends Function {

    private TanFunction tanFunction;

    public CotFunction(double accuracy, TanFunction tanFunction) {
        super(accuracy);
        this.tanFunction = tanFunction;
    }

    public double calculate(double x) {
        double cot = 1 / tanFunction.calculate(x);
        return Double.isFinite(cot) ? cot : Double.POSITIVE_INFINITY;
    }
}
