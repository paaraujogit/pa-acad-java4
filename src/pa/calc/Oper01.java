package pa.calc;

import static java.lang.Math.pow;

public class Oper01 implements ItfOper {

    @Override
    public double oper(
            double op1, double op2) {
        return op1+pow(op2,2);
    }

}