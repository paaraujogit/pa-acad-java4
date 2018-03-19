package pa.calc.advoper;

import pa.calc.advoper.advItfOper.advaItfOper;

public class advOperDiv implements advaItfOper {
	
	public double oper(double op1, double op2, double op3) {
		return op1/(op2/(op1/op3));
		
	}

}
