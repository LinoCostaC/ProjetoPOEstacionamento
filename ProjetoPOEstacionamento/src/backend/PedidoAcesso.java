package backend;
import java.io.Serializable;

/**
 *
 * @author LC
 */
public class PedidoAcesso extends Parque implements Serializable {
    //variaveis de instancia
    
    private Estado estadoPedido;
    private Parque pedidoParque;
    private Utente pedidoUtente;
    
//construtores

    /**
     *
     * @param pedidoParque
     * @param pedidoUtente
     */
    
    public PedidoAcesso(Parque pedidoParque, Utente pedidoUtente) {
        this.pedidoUtente = pedidoUtente;
        this.pedidoParque = pedidoParque;
        estadoPedido = Estado.PENDENTE;  
    }

    /**
     *
     * @return
     */
    public Estado getEstado() {
        return estadoPedido;
    }

    /**
     *
     * @param estado
     */
    public void setEstado(Estado estado) {
        this.estadoPedido = estado;
    }

    /**
     *
     * @return
     */
    public Parque getPedidoParque() {
        return pedidoParque;
    }

    /**
     *
     * @param pedidoParque
     */
    public void setPedidoParque(Parque pedidoParque) {
        this.pedidoParque = pedidoParque;
    }

    /**
     *
     * @return
     */
    public Utente getPedidoUtente() {
        return pedidoUtente;
    }

    /**
     *
     * @param pedidoUtente
     */
    public void setPedidoUtente(Utente pedidoUtente) {
        this.pedidoUtente = pedidoUtente;
    }
    
    /**
     *
     * @param pedido
     * @return
     */
    public double valorPagar(PedidoAcesso pedido){
        if(!estadoPedido.equals(Estado.ATRIBUIDO)){
            return 0;
        } else {
            return pedidoParque.getPreco();
        }
    }
     
    
    
    
}
