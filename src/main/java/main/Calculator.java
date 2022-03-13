package main;

import function.Function;
import logariphmic.LnFunction;
import logariphmic.LogTenFunction;
import trigonometric.*;

public class Calculator extends Function {

    private final CosFunction cosFunction;
    private final CotFunction cotFunction;
    private final CscFunction cscFunction;
    private final SecFunction secFunction;
    private final TanFunction tanFunction;
    private final LnFunction lnFunction;
    private final LogTenFunction logTenFunction;

    public Calculator(double accuracy, CosFunction cosFunction, CotFunction cotFunction, CscFunction cscFunction, SecFunction secFunction, TanFunction tanFunction, LnFunction lnFunction, LogTenFunction logTenFunction) {
        super(accuracy);
        this.cosFunction = cosFunction;
        this.cotFunction = cotFunction;
        this.cscFunction = cscFunction;
        this.secFunction = secFunction;
        this.tanFunction = tanFunction;
        this.lnFunction = lnFunction;
        this.logTenFunction = logTenFunction;
    }

    public double calculate(double x) {
        if(x <= 0) {
            return Math.pow(((cscFunction.calculate(x) + cosFunction.calculate(x)) - tanFunction.calculate(x)) *
                    (cotFunction.calculate(x) + cosFunction.calculate(x) / cscFunction.calculate(x)), 3) /
                    Math.pow(cosFunction.calculate(x), 2) + (tanFunction.calculate(x) + secFunction.calculate(x));
        } else {
            return Math.pow(Math.pow(Math.pow(lnFunction.calculate(x), 3) / logTenFunction.calculate(x) / logTenFunction.calculate(x) + logTenFunction.calculate(x), 3), 3);
        }
    }



}
