
package backend;

import java.io.Serializable;


public class Seguranca extends Utilizador implements Serializable {
    
    

    public Seguranca(String username, String password, String nome) {
        super(username, password, nome);
    }

    public String getUsernameSeguranca() {
        return username;
    }

    public String getPasswordSeguranca() {
        return password;
    }
    
    public String getNomeSeguranca() {
        return nome;
    }

    public void setUsernameSeguranca(String username) {
        this.username = username;
    }
    
    public void setPasswordSeguranca(String password) {
        this.password = password;
    }

    public void setNomeSeguranca(String nome) {
        this.nome = nome;
    }
    
    @Override
    public String toString() {
        return super.toString();
    }
    
}
