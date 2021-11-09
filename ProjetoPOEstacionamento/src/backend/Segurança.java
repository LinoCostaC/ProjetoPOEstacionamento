
package backend;

import java.io.Serializable;


public class Segurança extends Utilizador implements Serializable {
    private int codigoSeguranca;
    
    
    public static void main(String[] args) {
       
    }

    public Segurança(String username, String password, String nome) {
        super(username, password, nome);
    }
    
}
