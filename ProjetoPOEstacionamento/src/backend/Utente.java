
package backend;

import java.io.Serializable;


public class Utente extends Utilizador implements Serializable {
    //Variáveis
    private int contactoTelefonico;
    private Viatura viaturaUtente;
    private PedidoAcesso pedidoAcesso;
    
   
    //Construtor
    public Utente(String username, String password, String nome, int telefone) {
        super(username, password, nome);
        contactoTelefonico = telefone;
        
    }
    
    //Getters e Setters
    public String getUsernameUtente() {
        return username;
    }
    
    public String getPasswordUtente() {
        return password;
    }
    
    public String getNomeUtente() {
        return nome;
    }
    
    public int getContactoTelefonicoUtente() {
        return contactoTelefonico;
    }

    public void setUsernameUtente(String username) {
        this.username = username;
    } 
    
    public void setPasswordUtente(String password) {
        this.password = password;
    }
    
    public void setNomeUtente(String nome) {
        this.nome = nome;
    }
    
    public void setContactoTelefonicoUtente(int contactoTelefonico) {
        this.contactoTelefonico = contactoTelefonico;
    }

    
    //Método ToString
    @Override
    public String toString() {
        return super.toString() + ", Contacto Telefónico=" + contactoTelefonico +'}';
    }

    
}
