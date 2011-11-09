import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;


public class ArquivarProf {
	
	ObjectOutputStream out;
	ObjectInputStream in;
	private final String FILENAME = "Professores.bin";
	
	File file;
	
	public ArquivarProf(){
		
		file = new File(FILENAME);
		try {
			if(!file.exists()){
				out = new ObjectOutputStream(new FileOutputStream(file));
				System.out.println("Arquivo criado com sucesso!");
				out.close();
			}
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public void salvar(List<Professor> Professores){
		try{
			if(file.exists()){
				out = new ObjectOutputStream(new FileOutputStream(file));
				out.writeObject(Professores);
				out.close();
			} else {
				
			}
		} catch (IOException e){
			e.printStackTrace();
		}
	}
	
	public List<Professor> recuperar(){
		List<Professor> listaux = new ArrayList<Professor>();
		
		try{
			if(file.exists()){
				in = new ObjectInputStream(new FileInputStream(file));
				listaux = (List<Professor>)in.readObject();
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
