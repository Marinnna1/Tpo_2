package trigonometric;

import function.Function;

public class TanFunction extends Function {

    private SinFunction sinFunction;
    private CosFunction cosFunction;

    public TanFunction(double accuracy, SinFunction sinFunction, CosFunction cosFunction) {
        super(accuracy);
        this.sinFunction = sinFunction;
        this.cosFunction = cosFunction;


    }

    public double calculate(double x) {

        double tan = sinFunction.calculate(x) / cosFunction.calculate(x);
        return Double.isFinite(tan) ? tan : Double.POSITIVE_INFINITY;
    }


    public static void main(String[] args) {
        System.out.println(new TanFunction(0.0001, new SinFunction(0.0001),
                new CosFunction(0.0001, new SinFunction(0.0001))).calculate(Math.PI));
    }
}
