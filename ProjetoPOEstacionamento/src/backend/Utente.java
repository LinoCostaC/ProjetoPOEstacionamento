
package backend;

import java.io.Serializable;


public class Utente extends Utilizador implements Serializable {
    private int contactoTelefonico;
    private Viatura viaturaUtente;
    private PedidoAcesso pedidoAcesso;
    
    
    
    
    
    
    public Utente(String username, String password, String nome, int telefone) {
        super(username, password, nome);
        contactoTelefonico = telefone;
        
    }
    
}
