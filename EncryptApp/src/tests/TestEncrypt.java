package tests;
import org.junit.Assert;
import org.junit.Test;
import main.Encrypt;


public class TestEncrypt {
/*
	@Test
	public void testEncriptar(){
		
		Encrypt cry = new Encrypt(3);
		
		String encriptado = cry.encode("WIKIPEDIA");
		Assert.assertEquals("ZLNLSHGLD", encriptado);
		
		String[] original = cry.decode("ZLNLSHGLD");
		Assert.assertEquals("WIKIPEDIA", original[0]);

	}
	
	@Test
	public void testEncryptSinPatron(){
		
		Encrypt cry2 = new Encrypt();
		String[] posiblesSoluciones = cry2.decode("ZLNLSHGLD");
		
		for(int i=0;i<posiblesSoluciones.length;i++){
			System.out.println(posiblesSoluciones[i]);
		}
		
	}
*/
	
	@Test
	public void testEncriptarConEspacios(){
		
		Encrypt cry = new Encrypt(6);
		
		String encriptado = cry.encode("HOLA MUNDO CRUEL");
		Assert.assertEquals("NURG SATJU IXAKR", encriptado);
		
		
		Encrypt cry2 = new Encrypt();
		
		String[] posiblesSoluciones = cry2.decode("NURG SATJU IXAKR");
		
		for(int i=0;i<posiblesSoluciones.length;i++){
			System.out.println(posiblesSoluciones[i]);
		}
		
	}
	
}
