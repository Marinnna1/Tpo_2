package logariphmic;

import function.Function;

import java.text.DecimalFormat;

public class LnFunction extends Function {

    private static final int MAX_ITERATIONS = 1000000;

    public LnFunction(double accuracy) {
        super(accuracy);
    }

    @Override
    public double calculate(double x) {
        if (Double.isNaN(x) || x < 0.0) {
            return Double.NaN;
        } else if (x == Double.POSITIVE_INFINITY) {
            return Double.POSITIVE_INFINITY;
        } else if (x == 0.0) {
            return Double.NEGATIVE_INFINITY;
        }

        double currentValue = 0;
        double previousValue;
        int iteration = 1;

        if (Math.abs(x - 1) <= 1) {
            do {
                previousValue = currentValue;
                currentValue += ((Math.pow(-1, iteration - 1) * Math.pow(x - 1, iteration)) / iteration);
                iteration++;
            } while (getAccuracy() <= Math.abs(currentValue - previousValue) && iteration < MAX_ITERATIONS);
        } else {
            do {
                previousValue = currentValue;
                currentValue += ((Math.pow(-1, iteration - 1) * Math.pow(x - 1, -iteration)) / iteration);
                iteration++;
            } while (getAccuracy() <= Math.abs(currentValue - previousValue) && iteration < MAX_ITERATIONS);

            currentValue += calculate(x - 1);
        }

        DecimalFormat df = new DecimalFormat("#.#####");

        return Double.parseDouble(df.format(currentValue).replace(",", "."));

    }

}
