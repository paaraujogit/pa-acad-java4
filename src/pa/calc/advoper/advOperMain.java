package pa.calc.advoper;


public class advOperMain {

	public static void main(String[] args) {
		
		advOperDiv advOperDiv = new advOperDiv();
        double resDiv = advOperDiv.oper(1, 2, 3);
        System.out.println(resDiv);
        
        advOperMulti advOperMulti = new advOperMulti();
        double resMulti = advOperMulti.oper(1, 2, 3);
        System.out.println(resMulti);
	}

}
