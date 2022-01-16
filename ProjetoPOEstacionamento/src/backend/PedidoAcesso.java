package backend;
import java.io.Serializable;


public class PedidoAcesso extends Parque implements Serializable {
    //variaveis de instancia
    
    private Estado estadoPedido;
    private Parque pedidoParque;
    private Utente pedidoUtente;
    
//construtores
    
    public PedidoAcesso(Parque pedidoParque, Utente pedidoUtente) {
        this.pedidoUtente = pedidoUtente;
        this.pedidoParque = pedidoParque;
        estadoPedido = Estado.PENDENTE;  
    }

    public Estado getEstado() {
        return estadoPedido;
    }

    public void setEstado(Estado estado) {
        this.estadoPedido = estado;
    }

    public Parque getPedidoParque() {
        return pedidoParque;
    }

    public void setPedidoParque(Parque pedidoParque) {
        this.pedidoParque = pedidoParque;
    }

    public Utente getPedidoUtente() {
        return pedidoUtente;
    }

    public void setPedidoUtente(Utente pedidoUtente) {
        this.pedidoUtente = pedidoUtente;
    }
    
     public double valorPagar(PedidoAcesso pedido){
        if(!estadoPedido.equals(Estado.ATRIBUIDO)){
            return 0;
        } else {
            return pedidoParque.getPreco();
        }
    }
     
    
    
    
}
