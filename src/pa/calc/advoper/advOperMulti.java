package pa.calc.advoper;

import pa.calc.advoper.advItfOper.advaItfOper;

public class advOperMulti implements advaItfOper {
	
	public double oper(double op1, double op2, double op3) {
		return op3*((op2+op1)*(op3-op1));
		
	}

}
