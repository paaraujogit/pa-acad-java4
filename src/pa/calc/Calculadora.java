package pa.calc;

public class Calculadora {

    public static void main(String[] args) {
        // OperEx Example - Paulo
        OperEx opex = new OperEx();
        double resEx = opex.oper(1, 2);
        System.out.println(resEx);

        // Oper01 - Ricardo
        Oper01 ope01 = new Oper01();
        double res01 = ope01.oper(1, 2);
        System.out.println(res01);

        // - Oper02 - Pedro
        Oper02 ope02 = new Oper02();
        double res02 = ope02.oper(1, 2);
        System.out.println(res02);

        // - Oper 03 - Lígia
        Oper03 ope03 = new Oper03();
        double res03 = ope03.oper(10, 5);
        System.out.println(res03);

        // ToDo - All Students Must Implement one Operation
        // - Oper0X - Name
        //	Oper0X ope0X=new Oper0X();
        //	double res0X = ope0X.oper(X, Y);
        //	System.out.println(res0X);
    }

}
