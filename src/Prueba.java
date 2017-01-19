import junit.framework.TestCase;


public class Prueba extends TestCase {
	
	public void prueba(){
		
		Radio x = new Radio();
		float resultado = x.Seleccionar(1);
		assertEquals(88.2,resultado);
		
		
	}
	

}
