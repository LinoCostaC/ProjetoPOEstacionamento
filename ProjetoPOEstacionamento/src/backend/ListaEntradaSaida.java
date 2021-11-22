

package backend;

import java.io.Serializable;
import java.util.ArrayList;


public class ListaEntradaSaida implements Serializable  {
    //Lista de Entradas e Saidas
    private ArrayList<EntradaSaida> listaEntradaSaida;
    
    //Construtor
    public ListaEntradaSaida() {
        listaEntradaSaida = new ArrayList<EntradaSaida>();
    }

    public ArrayList<EntradaSaida> getListaEntradaSaida() {
        return listaEntradaSaida;
    }

    public void setListaEntradaSaida(ArrayList<EntradaSaida> listaEntradaSaida) {
        this.listaEntradaSaida = listaEntradaSaida;
    }
    
    
    //Obter todos as entradas e saidas
    public int getTotalEntradaSaida() {
        return listaEntradaSaida.size();
    }
    
    public EntradaSaida get(int index) {
        return listaEntradaSaida.get(index);
    }

    //Adicionar uma entrada e saida à lista
    public void adicionarEntradaSaida(EntradaSaida entradasaida) {
        listaEntradaSaida.add(entradasaida);
    }

    //Remover uma entrda e saida da lista
    public void removerEntradaSaida(EntradaSaida entradasaida) {
        listaEntradaSaida.remove(entradasaida);
    }
    
}

