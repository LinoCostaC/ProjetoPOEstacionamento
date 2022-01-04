
package frontend;
import backend.Administrador;
import backend.Aplicacao;
import backend.Utilizador;
import BaseDeDados.Serializacao;

public class Piloto {

    public static void main(String[] args) {
        Aplicacao aplicacao; // (So esta como null para dar agora)
        String ficheiroDados = String.format("%s\\utilizadores.data", System.getProperty("user.dir"));
        System.out.println(String.format("Ficheiro de dados: %s.", ficheiroDados));
        Serializacao database = new Serializacao(ficheiroDados);

        //Se o ficheiro de base de dados nao existir
        if (! database.getFicheiro().exists()) {
            //Cria uma instancia do sistema
            aplicacao = new Aplicacao();
            aplicacao.inicializarSistema();
          
        }else{
           aplicacao = database.carregar(); 
            System.out.println("Print qualquer");
        }

        
        Login login = new Login(aplicacao, database);
        login.setVisible(true);
    }

}