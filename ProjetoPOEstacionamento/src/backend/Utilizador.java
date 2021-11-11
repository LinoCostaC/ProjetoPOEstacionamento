
package backend;
import java.io.Serializable;

public class Utilizador implements Serializable {
    protected  String username; 
    protected  String password; 
    protected  String nome; 
    

    public Utilizador (String username, String password, String nome) {
    this.username = username; 
    this.password = password;
    this.nome = nome;       
}  
    public void setUsername(String Username){
        this.username= Username;
    }
    
    public String getUsername(){
        return username;
    }
    
    public void setPassword(String Password){
        this.password= Password;  
    }
    
    public String getPassword(){
        return password;
    }
       
    public void setnome (String nome) {
    this.nome = nome;
}   
    public String getnome () {
    return nome;
}   
    
    
    @Override
    public String toString () {
        return "Username: " + username + "\n Password: " + password + "\n Nome: " + nome;
    }
    
    
}
