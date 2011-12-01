import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;


public class MainTeste {
	public static void main(String[] args) {
	
		Crud crud = new Crud();
		Fachada f = new Fachada();
		int opcao = 10;
		int opc = 10;
		
		while(opc != 0){
			
			opc = Integer.parseInt(JOptionPane.showInputDialog(
				"\n1 Para Cadastrar"+
				"\n2 Para Remover"+
				"\n3 Para Pesquisar"+
				"\n0 Para Sair do Sistema"));
			
			if(opc == 1){
		
						
				opcao = Integer.parseInt(JOptionPane.showInputDialog(
				"\n1 Para Cadastrar Professor"+
				"\n2 Para Cadastrar Secretario"+
				"\n3 Para Cadastrar Curso"+
				"\n4 Para Cadastrar Disciplina"+
				"\n5 Para Cadastrar Departamento"+
				"\n6 Para Cadastrar Projeto"+
				"\n0 Voltar"));
			
		
					if(opcao == 1){
				
						int cont=1;
						Professor p = new Professor();
						Projeto proj = new Projeto();
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
						f.addProfessor(p);
						p.setPreferidas(preferidas);
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
			
						}else
							
							if(opcao == 3){
				
								Curso c = new Curso();
								Departamento d = new Departamento();
								c.setNome(JOptionPane.showInputDialog("Nome do curso"));
									String dpto = JOptionPane.showInputDialog("Departamento que o curso pertence");
									boolean pesquisa = f.testDepartamento(dpto);
								if (pesquisa){
								d.setNome(dpto);
								c.setDepartamento(d);
								f.addCurso(c);
								f.ArquivoCurso();
								System.out.println("Curso cadastrado com sucesso");
								}else
								
								System.out.println("Este Departamento não esta cadastrado!!!");
							}else
					
				
								if(opcao == 4){
									
									String curso = "";
									Disciplina dis = new Disciplina();
									Curso c = new Curso();
									dis.setNome(JOptionPane.showInputDialog("Nome da Disciplina"));
									 curso = JOptionPane.showInputDialog("Curso da Disciplina");
									 boolean pesquisa = f.testCurso(curso);
									if (pesquisa == true){
										c.setNome(curso);
										dis.setCurso(c);
										f.addDisciplina(dis);
										f.ArquivoDiscipl();
										System.out.println("Disciplina cadastrada com sucesso");
									}else
										
										System.out.println("Este curso não está cadastrado!!!");
			
								}else
									
									if(opcao == 5){
										
										Departamento dpto = new Departamento();
										dpto.setNome(JOptionPane.showInputDialog("Nome do Departamento"));
										f.addDepartamento(dpto);
										f.ArquivoDepto();
										System.out.println("Departamento cadastrado com sucesso!!!");
									}else
									
									if(opcao == 6){
									
										Projeto proj = new Projeto();
										proj.setId(Integer.parseInt(JOptionPane.showInputDialog("Id do Projeto:")));
										proj.setNome(JOptionPane.showInputDialog("Nome do Projeto:"));
										String professor = JOptionPane.showInputDialog("Professor:");
										if(f.pesquisarProfessor(professor).equals(professor)){
										proj.setProfessor(professor);
										System.out.println("Projeto cadastrado com sucesso");
										}
										System.out.println("Este professor não esta cadastrado!!!");
									}
			
			}
				if(opc == 2){
					
								
						opcao = Integer.parseInt(JOptionPane.showInputDialog(
						"\n1 Para Remover Professor"+
						"\n2 Para Remover Secretario"+
						"\n3 Para Remover Curso"+
						"\n4 Para Remover Disciplina"+
						"\n5 Para Remover Departamento"+
						"\n6 Para Remover Projeto"+
						"\n0 Voltar"));
					
				
							if(opcao == 1){
								
								String remove = JOptionPane.showInputDialog("Digite o nome do Professor que deseja remover");
								f.removerProfessor(remove);
							}
							
							if(opcao == 2){
								
								String remove = JOptionPane.showInputDialog("Digite o nome do Secretario que deseja remover");
								f.removerSecretario(remove);
							}
							
							if(opcao == 3){
								
								String remove = JOptionPane.showInputDialog("Digite o nome do Curso que deseja remover");
								f.removerCurso(remove);
							}
							
							if(opcao == 4){
								
								String remove = JOptionPane.showInputDialog("Digite o nome do Disciplina que deseja remover");
								f.removerDepartamento(remove);
							}
							
							if(opcao == 5){
								
								String remove = JOptionPane.showInputDialog("Digite o nome do Departamento que deseja remover");
								f.removerDepartamento(remove);
							}
							
							if(opcao == 6){
								
								String remove = JOptionPane.showInputDialog("Digite o nome do Projeto que deseja remover");
								//f.removerProjeto(remove);
							}
							
					}
			
					
					if(opc == 3){
						
										
							opcao = Integer.parseInt(JOptionPane.showInputDialog(
							"\n1 Para Pesquisar Professor"+
							"\n2 Para Pesquisar Secretario"+
							"\n3 Para Pesquisar Curso"+
							"\n4 Para Pesquisar Disciplina"+
							"\n5 Para Pesquisar Departamento"+
							"\n6 Para Pesquisar Projeto"+
							"\n0 Voltar"));
						
					
								if(opcao == 1){
									
									String nome = JOptionPane.showInputDialog("Digite o nome do Professor que deseja Pesquisar");
									System.out.println(f.pesquisarProfessor(nome));
								}
								
								if(opcao == 2){
									
									String nome = JOptionPane.showInputDialog("Digite o nome do Secretario que deseja Pesquisar");
									f.pesquisarSecretario(nome);
								}
								
								if(opcao == 3){
									
									String nome = JOptionPane.showInputDialog("Digite o nome do Curso que deseja Pesquisar");
									f.pesquisarCurso(nome);
								}
								
								if(opcao == 4){
									
									String nome = JOptionPane.showInputDialog("Digite o nome da Disciplina que deseja Pesquisar");
									f.pesquisarDisciplina(nome);
								}
								
								if(opcao == 5){
									
									String nome = JOptionPane.showInputDialog("Digite o nome do Departamento que deseja Pesquisar");
									f.pesquisarDepartamento(nome);
								}
								
								if(opcao == 6){
									
									String nome = JOptionPane.showInputDialog("Digite o nome do Projeto que deseja Pesquisar");
									//f.pesquisarProjeto(nome);
								}
						}
					}
		
		System.out.println("----------------------------------------------------");
		System.out.println(f.CarregarProf());
		System.out.println("----------------------------------------------------");
		System.out.println(f.CarregarSecr());
		System.out.println("----------------------------------------------------");
		//System.out.println(f.CarregarCurso());
		System.out.println("----------------------------------------------------");
		//System.out.println(f.CarregarDiscipl());
		System.out.println("----------------------------------------------------");
		//System.out.println(f.CarregarDepto());
		System.out.println("----------------------------------------------------");
		//System.out.println(f.sizeProfessor());
		System.out.println(f.sizeDepartamento());
		System.out.println(f.sizeCurso());
		System.out.println(f.sizeDisciplinas());
	}

}
