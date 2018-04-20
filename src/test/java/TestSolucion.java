import org.junit.Test;
import org.apache.log4j.Logger;
import static org.junit.Assert.*;


public class TestSolucion {

    private final static Logger LOG = Logger.getLogger(TestSolucion.class);
		
	private Solucion s = new Solucion();
		
	@Test
	public void problema() {
		String val="";
		boolean bool=true;
		LOG.info("Ejecutando prueba");
		val="abab";
		assertTrue("Prueba para "+val+": ", prueba(val, bool));
		assertTrue(gus(val));
		val="aba";
		assertTrue("Prueba para "+val+": ", prueba(val, !bool));
		assertTrue(gus(val));
		val="AAACAAA";
		assertTrue("Prueba para "+val+": ", prueba(val, !bool));
		assertTrue(gus(val));
		val="AguA";
		assertTrue("Prueba para "+val+": ", prueba(val, !bool));
		assertTrue(gus(val));
		
		
	}
	
	private boolean prueba(String cadena, boolean bool) {
		boolean res=s.problema(cadena);
		return res==bool;
	}
	
	public boolean gus(String str) {
		String s= str + str;
		return s.substring(1,s.length()-1).contains(str);
	}
}
