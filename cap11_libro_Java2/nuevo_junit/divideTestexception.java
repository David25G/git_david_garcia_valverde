package nuevo_junit;



import static org.junit.Assert.*;

import org.junit.Test;

public class divideTestexception {

	@Test
	public void testDivide() {
		divide calcu = new divide(20, 10);
        int resultado = calcu.divide0();
        assertEquals(2, resultado);
	}
	
	@Test
	public void excepcion() {
	        // TODO Auto-generated method stub

	        try {
	            divide calcu = new divide(20, 0);
	            calcu.divide0();
	        } catch (ArithmeticException e) {
	            System.out.println("Salta Excepción");
	        }
	    }
		/*EL PROGRAMA VA A RECOGER LA EXCEPCIÓN CUANDO SE DIVIDA ENTRE 0*/
}