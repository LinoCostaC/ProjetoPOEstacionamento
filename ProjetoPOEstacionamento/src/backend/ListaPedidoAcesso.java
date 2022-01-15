package backend;

import java.io.Serializable;
import java.util.ArrayList;

public class ListaPedidoAcesso implements Serializable {

    private ArrayList<PedidoAcesso> listaAcesso;

    //Construtor
    public ListaPedidoAcesso() {
        listaAcesso = new ArrayList<PedidoAcesso>();
    }

    public ArrayList<PedidoAcesso> getListaPedidoAcesso() {
        return listaAcesso;
    }

    public void setListaAcesso(ArrayList<PedidoAcesso> listaAcesso) {
        this.listaAcesso = listaAcesso;
    }

    //Obter todos os pedidos de acesso
    public int getTotalAcesso() {
        return listaAcesso.size();
    }

    public PedidoAcesso get(int index) {
        return listaAcesso.get(index);
    }

    //Adicionar um pedido de acesso à lista
    public void adicionarPedidoAcesso(PedidoAcesso acesso) {
        listaAcesso.add(acesso);
    }

    //Remover um pedido de acesso da lista
    public void removerPedidoAcesso(PedidoAcesso acesso) {
        listaAcesso.remove(acesso);
    }
     public boolean existe(Utente utente) {
        return listaAcesso.contains(utente);
    }
    
   // Calcular Total Angariado
    public double calcularTotalAngariado() {
        double somaTotal = 0;
        for (PedidoAcesso pedido : listaAcesso) {
            somaTotal += pedido.valorPagar(pedido);
        }
        return somaTotal;

    }
    // calcular Total Angariado Parque Livre
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


