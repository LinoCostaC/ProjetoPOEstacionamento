
package backend;

import java.io.Serializable;




public class Seguranca extends Utilizador implements Serializable {
    private ListaViatura listaViatura;
    
    

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
