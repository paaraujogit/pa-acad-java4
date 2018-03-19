package pa.calc;

public class Calculadora {

	public static void main(String[] args) {
		// OperEx Example - Paulo A.
		OperEx opex=new OperEx();
		double resEx = opex.oper(1, 2);
		System.out.println(resEx);


		// - Oper01 - Ricardo
		Oper01 ope01=new Oper01();
		double res01= ope01.oper(1,2);
        System.out.println(res01);

		// ToDo - All Students Must Implement one Operation
		// - Oper0X - Name
	//	Oper0X ope0X=new Oper0X();
	//	double res0X = ope0X.oper(X, Y);
	//	System.out.println(res0X);

	}

}
