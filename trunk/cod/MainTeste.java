import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;


public class MainTeste {
	public static void main(String[] args) {
	
		Fachada f = new Fachada();
		int opcao = 5;
		
		while(opcao != 0){
		
			opcao = Integer.parseInt(JOptionPane.showInputDialog(
				"\n1 Para Cadastrar Professor"+
				"\n2 Para Cadastrar Secretario"+
				"\n0 Para Sair do Sistema"));
		
			if(opcao == 1){
				
			int cont=1;
			Professor p = new Professor();
			p.setNome(JOptionPane.showInputDialog("Nome"));
			p.setPassword(JOptionPane.showInputDialog("Password"));
			p.setUsername(JOptionPane.showInputDialog("Username"));
			p.setMatricula(JOptionPane.showInputDialog("Matricula"));
			p.setEmail(JOptionPane.showInputDialog("E-mail"));
			p.setTipo(JOptionPane.showInputDialog("Escolha o tipo como:" +
					"admin/manager/ou usuario basico"));
			List<Disciplina> preferidas = new ArrayList<Disciplina>();
			while(cont<=3){
			Disciplina d = new Disciplina();
			d.setNome(JOptionPane.showInputDialog(cont+"° Disciplina preferida"));
			preferidas.add(d);
			cont++;
			}
			p.setPreferidas(preferidas);
			f.addProfessor(p);
			System.out.println("Professor Cadastrado com sucesso!!!");
			f.ArquivoProf();
			
			}else
			
			if(opcao == 2){
			
			Secretario s = new Secretario();
			s.setNome(JOptionPane.showInputDialog("Nome"));
			s.setPassword(JOptionPane.showInputDialog("Password"));
			s.setUsername(JOptionPane.showInputDialog("Username"));
			s.setMatricula(JOptionPane.showInputDialog("matricula"));
			s.setEmail(JOptionPane.showInputDialog("email"));
			s.setTipo(JOptionPane.showInputDialog("Escolha o tipo como:" +
					"admin/manager/ou usuario basico"));
			s.setTelefone(JOptionPane.showInputDialog("Telefone"));
			f.addSecretario(s);
			System.out.println("Secretario Cadastrado com sucesso!!!");
			f.ArquivoSecr();
			
			}
		}
		
		System.out.println(f.CarregarSecr());
		System.out.println("----------------------------------------------------");
		System.out.println(f.CarregarProf());
		System.out.println("----------------------------------------------------");
		//System.out.println(f.size());
		
	}

}
