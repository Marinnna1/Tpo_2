package trigonometric;

import function.Function;

public class CosFunction extends Function {

    private SinFunction sinFunction;

    public CosFunction(double accuracy, SinFunction sinFunction) {
        super(accuracy);
        this.sinFunction = sinFunction;
    }

    public double calculate(double x) {
        int period = (int) (x / (Math.PI * 2));
        x -= period * Math.PI *2;

        int sign;
        if(x > Math.PI / 2 && x < 3 * Math.PI / 2) {
            sign = -1;
        }
        else if(x < -Math.PI / 2 && x > -3 * Math.PI / 2) {
            sign = -1;
        }
        else {
            sign = 1;
        }

        return sign * Math.sqrt(1 - Math.pow(sinFunction.calculate(x), 2));
    }


    public static void main(String[] args) {
        System.out.println(new CosFunction(0.0001, new SinFunction(0.0001)).calculate(Math.PI/6));
    }
}
