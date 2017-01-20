import junit.framework.TestCase;

public class IRadioTest extends TestCase {



	public void testGetFrecuencias() {
		Radio r = new Radio();
		boolean x = r.getFrecuencias();
		assertEquals(true, x);
	}

	public void testGetEstado() {
		Radio r = new Radio();
		boolean x = r.getEstado();
		assertEquals(true, x);
	}

	public void testGetEmisora() {
		Radio r = new Radio();
		float x = r.getEmisora();
		assertEquals(88.2f, x);
	}

}
