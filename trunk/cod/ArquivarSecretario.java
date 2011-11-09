import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;


public class ArquivarSecretario {
	
	ObjectOutputStream out;
	ObjectInputStream in;
	private final String FILENAME = "Secretarios.bin";
	
	File file;
	
	public ArquivarSecretario(){
		
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
	
	public void salvar(List<Secretario> Secretarios){
		try{
			if(file.exists()){
				out = new ObjectOutputStream(new FileOutputStream(file));
				out.writeObject(Secretarios);
				out.close();
			} else {
				
			}
		} catch (IOException e){
			e.printStackTrace();
		}
	}
	
	public List<Secretario> recuperar(){
		List<Secretario> listaux = new ArrayList<Secretario>();
		
		try{
			if(file.exists()){
				in = new ObjectInputStream(new FileInputStream(file));
				listaux = (List<Secretario>)in.readObject();
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
