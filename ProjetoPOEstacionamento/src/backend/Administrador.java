
package backend;

import java.io.Serializable;

/**
 *
 * @author LC
 */
public class Administrador extends Utilizador implements Serializable {
  
    /**
     *
     * @param username
     * @param password
     * @param nome
     */
    public Administrador(String username, String password, String nome) {
        super(username, password, nome);
    }
   
}