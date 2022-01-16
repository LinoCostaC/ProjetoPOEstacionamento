
package backend;

import java.io.Serializable;

/**
 *
 * @author LC
 */
public class Utente extends Utilizador implements Serializable {
    //Variáveis
    private String contactoTelefonico;
    private Viatura viaturaUtente;
    private PedidoAcesso pedidoAcesso;
    
   
    //Construtor

    /**
     *
     * @param username
     * @param password
     * @param nome
     * @param telefone
     */
    public Utente(String username, String password, String nome, String telefone) {
        super(username, password, nome);
        contactoTelefonico = telefone;
        viaturaUtente= null;
        pedidoAcesso= null;
    }
    
     //Getters e Setters

    /**
     *
     * @return
     */
    
    public String getUsernameUtente(){
        return username;
    }
    
    /**
     *
     * @param username
     */
    public void setUsernameUtente(String username){
        this.username = username;
    }
    
    /**
     *
     * @return
     */
    public String getPasswordUtente(){
        return password;
    }
    
    /**
     *
     * @param password
     */
    public void setPasswordUtente(String password){
        this.password = password;
    }
    
    /**
     *
     * @return
     */
    public String getNomeUtente(){
        return nome;
    }
    
    /**
     *
     * @param nome
     */
    public void setNomeUtente(String nome){
        this.nome = nome;
    }
    
    /**
     *
     * @return
     */
    public String getContactoTelefonico() {
        return contactoTelefonico;
    }

    /**
     *
     * @param contactoTelefonico
     */
    public void setContactoTelefonico(String contactoTelefonico) {    
        this.contactoTelefonico = contactoTelefonico;
    }

    /**
     *
     * @return
     */
    public Viatura getViaturaUtente() {
        return viaturaUtente;
    }

    /**
     *
     * @param viaturaUtente
     */
    public void setViaturaUtente(Viatura viaturaUtente) {
        this.viaturaUtente = viaturaUtente;
    }

    /**
     *
     * @return
     */
    public PedidoAcesso getPedidoAcesso() {
        return pedidoAcesso;
    }

    /**
     *
     * @param pedidoAcesso
     */
    public void setPedidoAcesso(PedidoAcesso pedidoAcesso) {
        this.pedidoAcesso = pedidoAcesso;
    }

    
    
    //Método ToString
    @Override
    public String toString() {
        return super.toString() + "Contacto Telefónico=" + contactoTelefonico + ", Viatura do Utente=" + viaturaUtente + ", Pedido de Acesso=" + pedidoAcesso + '}';
    }

    
}
