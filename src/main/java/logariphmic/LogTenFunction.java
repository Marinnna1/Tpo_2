package logariphmic;

import function.Function;

import java.text.DecimalFormat;

public class LogTenFunction extends Function {

    private LnFunction lnFunction;


    public LogTenFunction(double accuracy, LnFunction lnFunction) {
        super(accuracy);
        this.lnFunction = lnFunction;
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

        DecimalFormat df = new DecimalFormat("#.#####");
        return Double.parseDouble(df.format(lnFunction.calculate(x) / lnFunction.calculate(10)).replace(",", "."));
    }

}
