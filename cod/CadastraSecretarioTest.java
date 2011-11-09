import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


public class CadastraSecretarioTest {

	@Test
	public void test() {
		Secretario s = new Secretario("Login1", "senha123", null, null, null, null, null, null);
		ArrayList<Secretario> secretarios = new ArrayList<Secretario>();
		assertTrue(secretarios.size()==0);
		secretarios.add(s);
		assertTrue(s.getPassword()=="senha123");
		assertTrue(secretarios.size()==1);
		
	}

}
