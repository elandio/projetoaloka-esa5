import static org.junit.Assert.*;

import java.awt.List;
import java.util.ArrayList;

import org.junit.Test;


public class CadastraProfessorTest {

	@Test
	public void test() {
		Professor p = new Professor("professor", "user123", null, null, null, null, null);	
		ArrayList<Professor> professores = new ArrayList<Professor>();
		assertTrue(professores.size()==0);
		professores.add(p);
		assertTrue(p.getUsername()=="professor");
		assertTrue(professores.size()==1);
	}

}
