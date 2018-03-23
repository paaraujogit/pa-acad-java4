package pa.calc.advoper;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class advOperMainTest {

	@Test
	public void advOperMain() {
		
		advOperDiv advOperDiv = new advOperDiv();
       
		double resDiv = advOperDiv.oper(60, 120, 2);
		
		assertEquals (15, resDiv);
		
		
		advOperMulti advOperMulti = new advOperMulti();
		
		double resMulti = advOperMulti.oper(1, 2, 3);
		
		assertEquals (18, resMulti); 
		
	}

	
	
	
}
