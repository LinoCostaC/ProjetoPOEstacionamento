
package backend;
import java.io.Serializable;

/**
 *
 * @author LC
 */
public class Utilizador implements Serializable {

    /**
     *
     */
    protected  String username; 

    /**
     *
     */
    protected  String password; 

    /**
     *
     */
    protected  String nome; 
    
    /**
     *
     * @param username
     * @param password
     * @param nome
     */
    public Utilizador (String username, String password, String nome) {
    this.username = username; 
    this.password = password;
    this.nome = nome;       
}  

    /**
     *
     * @param Username
     */
    public void setUsername(String Username){
        this.username= Username;
    }
    
    /**
     *
     * @return
     */
    public String getUsername(){
        return username;
    }
    
    /**
     *
     * @param Password
     */
    public void setPassword(String Password){
        this.password= Password;  
    }
    
    /**
     *
     * @return
     */
    public String getPassword(){
        return password;
    }
       
    /**
     *
     * @param nome
     */
    public void setnome (String nome) {
    this.nome = nome;
}   

    /**
     *
     * @return
     */
    public String getnome () {
    return nome;
}   
    
    
    @Override
    public String toString () {
        return "Username: " + username + "\n Password: " + password + "\n Nome: " + nome;
    }
    
    
}
