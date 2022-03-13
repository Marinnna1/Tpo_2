package trigonometric;

import function.Function;

public class SinFunction extends Function {

    private static final int MAX_ITERATIONS = 1000000;

    public SinFunction(double accuracy) {
        super(accuracy);
    }

    public double calculate(double x) {
        int period = (int) (x / (Math.PI * 2));
        x -= period * Math.PI *2;

        double result = 0;
        int sign = 1;
        int i = 0;
        double prev = 0;
        if(Double.isNaN(x)) {
            return Double.NaN;
        }
        while(getAccuracy() <= Math.abs((sign * Math.pow(x, 2 * i + 1))/ getFactorial(2 * i + 1) - prev) && i < MAX_ITERATIONS) {
            result += (sign * Math.pow(x, 2 * i + 1))/ getFactorial(2 * i + 1);
            prev = (sign * Math.pow(x, 2 * i + 1))/ getFactorial(2 * i + 1);
            sign=-sign;
            i++;
        }
        return result;
    }


    private static long getFactorial(int f) {
        long result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        return result;
    }


}
