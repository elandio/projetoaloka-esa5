import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;


public class ArquivarCurso {
	
	ObjectOutputStream out;
	ObjectInputStream in;
	private final String FILENAME = "Cursos.bin";
	
	File file;
	
	public ArquivarCurso(){
		
		file = new File(FILENAME);
		try {
			if(!file.exists()){
				out = new ObjectOutputStream(new FileOutputStream(file));
				//System.out.println("Arquivo criado com sucesso!");
				out.close();
			}
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public void salvar(List<Curso> Cursos){
		try{
			if(file.exists()){
				out = new ObjectOutputStream(new FileOutputStream(file));
				out.writeObject(Cursos);
				out.close();
			} else {
				
			}
		} catch (IOException e){
			e.printStackTrace();
		}
	}
	
	public List<Curso> recuperar(){
		List<Curso> listaux = new ArrayList<Curso>();
		
		try{
			if(file.exists()){
				in = new ObjectInputStream(new FileInputStream(file));
				listaux = (List <Curso>)in.readObject();
				in.close();
			} else {
				System.out.println("Problemas com o arquivo");
			}
		} catch (IOException e){
			e.printStackTrace();
		}catch (ClassNotFoundException ex){
			ex.printStackTrace();
		}
		
		return listaux;
	}

}
