package backend;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author LC
 */
public class ListaPedidoAcesso implements Serializable {

    private ArrayList<PedidoAcesso> listaAcesso;

    //Construtor

    /**
     *
     */
    public ListaPedidoAcesso() {
        listaAcesso = new ArrayList<PedidoAcesso>();
    }

    /**
     *
     * @return
     */
    public ArrayList<PedidoAcesso> getListaPedidoAcesso() {
        return listaAcesso;
    }

    /**
     *
     * @param listaAcesso
     */
    public void setListaAcesso(ArrayList<PedidoAcesso> listaAcesso) {
        this.listaAcesso = listaAcesso;
    }

    //Obter todos os pedidos de acesso

    /**
     *
     * @return
     */
    public int getTotalAcesso() {
        return listaAcesso.size();
    }

    /**
     *
     * @param index
     * @return
     */
    public PedidoAcesso get(int index) {
        return listaAcesso.get(index);
    }

    //Adicionar um pedido de acesso à lista

    /**
     *
     * @param acesso
     */
    public void adicionarPedidoAcesso(PedidoAcesso acesso) {
        listaAcesso.add(acesso);
    }
 

    //Remover um pedido de acesso da lista

    /**
     *
     * @param acesso
     */
    public void removerPedidoAcesso(PedidoAcesso acesso) {
        listaAcesso.remove(acesso);
    }

    /**
     *
     * @param utente
     * @return
     */
    public boolean existe(Utente utente) {
        return listaAcesso.contains(utente);
    }
    
   // Calcular Total Angariado

    /**
     *
     * @return
     */
    public double calcularTotalAngariado() {
        double somaTotal = 0;
        for (PedidoAcesso pedido : listaAcesso) {
            somaTotal += pedido.valorPagar(pedido);
        }
        return somaTotal;

    }
    // calcular Total Angariado Parque Livre

    /**
     *
     * @return
     */
    public double calcularValorParqueLivre() {
        double somaTotal = 0;
        for (PedidoAcesso pedido : listaAcesso) {
            if (pedido.getPedidoParque() instanceof ParqueAcessoLivre) {
                somaTotal += pedido.valorPagar(pedido);
            }
        }
        return somaTotal;
    }
    // calcular Total Angariado Parque Lugar Assegurado

    /**
     *
     * @return
     */
    public double calcularValorLugarAssegurado() {
        double somaTotal = 0;
        for (PedidoAcesso pedido : listaAcesso) {
            if (pedido.getPedidoParque() instanceof ParqueLugarAssegurado) {
                somaTotal += pedido.valorPagar(pedido);
            }
        }
        return somaTotal;
    }
    // calcular Total Angariado Parque Condicionado

    /**
     *
     * @return
     */
    public double calcularValorParqueCondicionado() {
        double somaTotal = 0;
        for (PedidoAcesso pedido : listaAcesso) {
            if (pedido.getPedidoParque() instanceof ParqueAcessoCondicionado) {
                somaTotal += pedido.valorPagar(pedido);
            }
        }
        return somaTotal;
    }

    
}


