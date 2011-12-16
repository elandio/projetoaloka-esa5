import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;


public class MainTeste {
	public static void main(String[] args) {
		
		String username = "";
		String password = "";
		
		Crud crud = new Crud();
		Fachada f = new Fachada();
		int opcao = 10;
		int opc = 10;
		
		username = JOptionPane.showInputDialog("Digite o Username:");
		if(f.ConfereUsername(username)){
			password = JOptionPane.showInputDialog("Digite o Password:");
			if(f.ConferePassword(password)){
		
		while(opc != 0){
			
			opc = Integer.parseInt(JOptionPane.showInputDialog(
				"\n1 Para Cadastrar"+
				"\n2 Para Remover"+
				"\n3 Para Pesquisar"+
				"\n4 Alocar professor na disciplina"+
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
						String nome = JOptionPane.showInputDialog("Nome");
						if(f.ComparaProf(nome)==false){
						p.setNome(nome);
						p.setMatricula(JOptionPane.showInputDialog("Matricula"));
						p.setEmail(JOptionPane.showInputDialog("E-mail"));
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
						}else
							System.out.println("Este professor ja está cadastrado");
			
					}else
			
						if(opcao == 2){
			
							Secretario s = new Secretario();
							s.setNome(JOptionPane.showInputDialog("Nome"));
							String usernome = JOptionPane.showInputDialog("Username");
							if(f.ComparaSecr(usernome)==false){
							s.setUsername(usernome);
							s.setPassword(JOptionPane.showInputDialog("Password"));
							s.setMatricula(JOptionPane.showInputDialog("matricula"));
							s.setEmail(JOptionPane.showInputDialog("email"));
							s.setTelefone(JOptionPane.showInputDialog("Telefone"));
							f.addSecretario(s);
							System.out.println("Secretario Cadastrado com sucesso!!!");
							}else
								System.out.println("Este Username já existe");
								
						}else
							
							if(opcao == 3){
				
								Curso c = new Curso();
								Departamento d = new Departamento();
								String nome = JOptionPane.showInputDialog("Nome do curso");
								c.setNome(nome);
									String dpto = JOptionPane.showInputDialog("Departamento que o curso pertence");
									boolean pesquisa = f.testDepartamento(dpto);
								if(f.ComparaCurso(nome,dpto)==false){
									if (pesquisa == true){
										d.setNome(dpto);
										c.setDepartamento(d);
										f.addCurso(c);
										System.out.println("Curso cadastrado com sucesso");
									}else
										System.out.println("Este Departamento não esta cadastrado!!!");
								}else
									System.out.println("Este curso já está cadastrado");
							
							}else
					
				
								if(opcao == 4){
									
									String curso = "";
									Disciplina dis = new Disciplina();
									Curso c = new Curso();
									String nome = JOptionPane.showInputDialog("Nome da Disciplina");
									dis.setNome(nome);
									 curso = JOptionPane.showInputDialog("Curso da Disciplina");
									 boolean pesquisa = f.testCurso(curso);
									 if(f.ComparaDisciplina(nome,curso)==false){
										 if (pesquisa == true){
											 c.setNome(curso);
											 dis.setCurso(c);
											 f.addDisciplina(dis);
										System.out.println("Disciplina cadastrada com sucesso");
										 }else
											 System.out.println("Este curso não está cadastrado!!!");
									 }else
										 System.out.println("Esta disciplina já está cadastrada");
										 
								}else
									
									if(opcao == 5){
										
										Departamento dpto = new Departamento();
										String nome = JOptionPane.showInputDialog("Nome do Departamento");
										if(f.ComparaDepto(nome)==false){
										dpto.setNome(nome);
										f.addDepartamento(dpto);
										System.out.println("Departamento cadastrado com sucesso!!!");
										}else
											System.out.println("Este departamento já está cadastrado");
											
									}else
									
									if(opcao == 6){
									
										Projeto proj = new Projeto();
										Professor p = new Professor();
										proj.setId(Integer.parseInt(JOptionPane.showInputDialog("Id do Projeto:\n"+"Obs:Tem que ser um numero!!!")));
										String nome = JOptionPane.showInputDialog("Nome do Projeto:");
										if(f.ComparaProj(nome)==false){
											proj.setNome(nome);
											String professor = JOptionPane.showInputDialog("Professor:");
											if(f.ConfereProfParaProj(professor, nome)){
												proj.setProfessor(professor);
												f.addProjeto(proj);
												//crud.ArquivoProf();
												System.out.println("Projeto cadastrado com sucesso");
											}else
											System.out.println("Este professor ainda não está cadastrado ou ja está em dois projetos!!!");
										}else
											System.out.println("Este projeto já está cadastrado");
										
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
								
								if(f.sizeProfessor()>0){
								String remove = JOptionPane.showInputDialog("Digite o nome do Professor que deseja remover");
								f.removerProfessor(remove);
								System.out.println("Professor removido com sucesso!!!");
								}else
									System.out.println("Não tem professor cadastrado!!!");
							}
							
							if(opcao == 2){
								
								String remove = JOptionPane.showInputDialog("Digite o nome do Secretario que deseja remover");
								f.removerSecretario(remove);
								System.out.println("Secretario removido com sucesso!!!");
							}
							
							if(opcao == 3){
								
								String remove = JOptionPane.showInputDialog("Digite o nome do Curso que deseja remover");
								f.removerCurso(remove);
								System.out.println("Curso removido com sucesso!!!");
							}
							
							if(opcao == 4){
								
								String remove = JOptionPane.showInputDialog("Digite o nome do Disciplina que deseja remover");
								f.removerDisciplina(remove);
								System.out.println("Disciplina removida com sucesso!!!");
							}
							
							if(opcao == 5){
								
								String remove = JOptionPane.showInputDialog("Digite o nome do Departamento que deseja remover");
								f.removerDepartamento(remove);
								System.out.println("Departamento removido com sucesso!!!");
							}
							
							if(opcao == 6){
								
								String remove = JOptionPane.showInputDialog("Digite o nome do Projeto que deseja remover");
								f.removerProj(remove);
								System.out.println("Projeto removido com sucesso!!!");
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
									System.out.println(f.pesquisarSecretario(nome));
								}
								
								if(opcao == 3){
									
									String nome = JOptionPane.showInputDialog("Digite o nome do Curso que deseja Pesquisar");
									System.out.println(f.pesquisarCurso(nome));
								}
								
								if(opcao == 4){
									
									String nome = JOptionPane.showInputDialog("Digite o nome da Disciplina que deseja Pesquisar");
									System.out.println(f.pesquisarDisciplina(nome));
								}
								
								if(opcao == 5){
									
									String nome = JOptionPane.showInputDialog("Digite o nome do Departamento que deseja Pesquisar");
									System.out.println(f.pesquisarDepartamento(nome));
								}
								
								if(opcao == 6){
									
									String nome = JOptionPane.showInputDialog("Digite o nome do Projeto que deseja Pesquisar");
									System.out.println(f.pesquisarProj(nome));
								}
						}
					
					if(opc == 4){
						
						List<Professor> professores = new ArrayList<Professor>();
						professores = crud.CarregarProf();
						
						for(int i = 0; i< professores.size();++i){
							System.out.println("Professor: "+professores.get(i).getNome()+"\n"
						+"Disciplinas preferidas: "+professores.get(i).getPreferidas()+"\n"
						+"Quant. diciplinas alocadas pra ele: "+professores.get(i).getQuantDisciplina()+"\n");
						}
						
						String professor = JOptionPane.showInputDialog("Coloque o nome do professor: ");
						String disciplina = JOptionPane.showInputDialog("Coloque o nome da disciplina de acordo com suas preferidas: ");
						if(f.ConfereDisciplina(disciplina)){
							if(f.ConfereProf(professor)){  		
								Turma t = new Turma();
								t.setProfessor(professor);
								t.setDisciplina(disciplina);
								f.addTurma(t);
								System.out.println("Turma cadastrada com sucesso");
							}else
							System.out.println("Este professor ja tem duas disciplinas");
						}else
							System.out.println("Esta disciplina já está alocada");
					}
					}
		
		System.out.println("----------------------------------------------------");
		System.out.println(crud.CarregarProf());
		System.out.println("----------------------------------------------------");
		System.out.println(crud.CarregarSecr());
		System.out.println("----------------------------------------------------");
		System.out.println(crud.CarregarCurso());
		System.out.println("----------------------------------------------------");
		System.out.println(crud.CarregarDiscipl());
		System.out.println("----------------------------------------------------");
		System.out.println(crud.CarregarDepto());
		System.out.println("----------------------------------------------------");
		System.out.println(crud.CarregarProj());
		System.out.println("----------------------------------------------------");
		System.out.println(crud.CarregarTurmas());
		System.out.println("----------------------------------------------------");
		
		System.out.println("Quant. de professores: "+f.sizeProfessor());
		System.out.println("Quant. de secretarios: "+f.sizeSecretario());
		System.out.println("Quant. de departamentos: "+f.sizeDepartamento());
		System.out.println("Quant. de cursos: "+f.sizeCurso());
		System.out.println("Quant. de disciplinas: "+f.sizeDisciplinas());
		System.out.println("Quant. de projetos: "+f.sizeProjeto());
		System.out.println("Quant. de turmas: "+f.sizeTurma());
		
			}else
				System.out.println("Password invalido!!!");
		}else
			System.out.println("Username invalido!!!");
		
	}
	
}
