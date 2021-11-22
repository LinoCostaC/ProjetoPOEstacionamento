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

    public void setListaparque(ArrayList<Parque> listaParque) {
        this.listaAcesso = listaAcesso;
    }

    //Obter todos os parques
    public int getTotalAcesso() {
        return listaAcesso.size();
    }

    public PedidoAcesso get(int index) {
        return listaAcesso.get(index);
    }

    //Adicionar um parque à lista
    public void adicionarPedidoAcesso(PedidoAcesso acesso) {
        listaAcesso.add(acesso);
    }

    //Remover um parque da lista
    public void removerPedidoAcesso(PedidoAcesso acesso) {
        listaAcesso.remove(acesso);
    }

}


