
package backend;

import java.io.Serializable;


public class Utente extends Utilizador implements Serializable {
    //Variáveis
    private String contactoTelefonico;
    private Viatura viaturaUtente;
    private PedidoAcesso pedidoAcesso;
    
   
    //Construtor
    public Utente(String username, String password, String nome, String telefone) {
        super(username, password, nome);
        contactoTelefonico = telefone;
        viaturaUtente= null;
        pedidoAcesso= null;
    }
    
     //Getters e Setters
    
    public String getUsernameUtente(){
        return username;
    }
    
    public void setUsernameUtente(String username){
        this.username = username;
    }
    
    public String getPasswordUtente(){
        return password;
    }
    
    public void setPasswordUtente(String password){
        this.password = password;
    }
    
    public String getNomeUtente(){
        return nome;
    }
    
    public void setNomeUtente(String nome){
        this.nome = nome;
    }
    
    public String getContactoTelefonico() {
        return contactoTelefonico;
    }

    public void setContactoTelefonico(String contactoTelefonico) {    
        this.contactoTelefonico = contactoTelefonico;
    }

    public Viatura getViaturaUtente() {
        return viaturaUtente;
    }

    public void setViaturaUtente(Viatura viaturaUtente) {
        this.viaturaUtente = viaturaUtente;
    }

    public PedidoAcesso getPedidoAcesso() {
        return pedidoAcesso;
    }

    public void setPedidoAcesso(PedidoAcesso pedidoAcesso) {
        this.pedidoAcesso = pedidoAcesso;
    }

    
    
    //Método ToString
    @Override
    public String toString() {
        return super.toString() + "Contacto Telefónico=" + contactoTelefonico + ", Viatura do Utente=" + viaturaUtente + ", Pedido de Acesso=" + pedidoAcesso + '}';
    }

    
}
