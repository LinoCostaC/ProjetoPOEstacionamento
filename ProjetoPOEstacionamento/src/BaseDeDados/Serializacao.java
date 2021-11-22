
package BaseDeDados;

import backend.Aplicacao;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class Serializacao implements Serializable {
    private final File ficheiro;
    
    
    public Serializacao(String ficheiro) {
        this.ficheiro = new File(ficheiro);
    }
    
    public File getFicheiro() {
        return ficheiro;
    } 
    
    //Ler Aplicacao de Ficheiro
    
    public Aplicacao carregar() {
        try (FileInputStream fileIn = new FileInputStream(ficheiro); 
        ObjectInputStream in = new ObjectInputStream(fileIn)) {
            Aplicacao aplicacao = (Aplicacao) in.readObject();
            return aplicacao;
        }catch(IOException | ClassNotFoundException exc) {
            throw new RuntimeException(String.format(
                  "Erro ao ler o ficheiro de dados: %s", 
                  exc.getLocalizedMessage()), exc);        
        }              
    }
    
    //Guardar Aplicacao de Ficheiro
    
    public void guardar(Aplicacao aplicacao) {
        try (FileOutputStream fileOut = new FileOutputStream(ficheiro); 
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            try {
                out.writeObject(aplicacao);
            } catch (IOException exc) {
                throw new RuntimeException(String.format(
                        "Ocorreu um erro ao guardar o ficheiro de dados: %s", 
                        exc.getLocalizedMessage()), exc);
            }
        } catch (IOException exc) {
             throw new RuntimeException(String.format(
                        "Ocorreu um erro ao guardar o ficheiro de dados: %s", 
                        exc.getLocalizedMessage()), exc);
        }
    }
}
