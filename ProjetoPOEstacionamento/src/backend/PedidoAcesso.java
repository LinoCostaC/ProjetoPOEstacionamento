
package backend;


public class PedidoAcesso {
    //variaveis de instancia
    
    private String estadoPedido;
    private Parque pedidoParque;
    private Utente pedidoUtente;
    
//construtores
    
    public PedidoAcesso() {
    }

    public PedidoAcesso(String estado) {
        this.estadoPedido = estado;
    }

    public String getEstado() {
        return estadoPedido;
    }

    public void setEstado(String estado) {
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
    
    //Método ToString
    @Override
    public String toString() {
        return super.toString() + " Estado=" + estadoPedido + ", Pedido de Parque=" + pedidoParque + ", Pedido do Utente=" + pedidoUtente + '}';
    }
}
