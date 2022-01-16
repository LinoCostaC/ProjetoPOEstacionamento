
package backend;

import java.io.Serializable;

/**
 *
 * @author LC
 */
public class Seguranca extends Utilizador implements Serializable {
    private ListaViatura listaViatura;
    
    /**
     *
     * @param username
     * @param password
     * @param nome
     */
    public Seguranca(String username, String password, String nome) {
        super(username, password, nome);
    }

    /**
     *
     * @return
     */
    public String getUsernameSeguranca() {
        return username;
    }

    /**
     *
     * @return
     */
    public String getPasswordSeguranca() {
        return password;
    }
    
    /**
     *
     * @return
     */
    public String getNomeSeguranca() {
        return nome;
    }

    /**
     *
     * @param username
     */
    public void setUsernameSeguranca(String username) {
        this.username = username;
    }
    
    /**
     *
     * @param password
     */
    public void setPasswordSeguranca(String password) {
        this.password = password;
    }

    /**
     *
     * @param nome
     */
    public void setNomeSeguranca(String nome) {
        this.nome = nome;
    }

    /**
     *
     * @param parque
     * @param matricula
     * @return
     */
    public boolean acessoParque (Parque parque, String matricula){
       Viatura viatura = null ;
       PedidoAcesso pedidoAcesso;
       for(Viatura v : listaViatura.getListaViatura()){
           if(v.getMatricula().equalsIgnoreCase(matricula)){
               viatura = v;
           }else{
               System.out.println("A matricula não pertence a nenhum carro");
           }
       }return false;
    }
    
    @Override
    public String toString() {
        return super.toString();
    }
    
}
