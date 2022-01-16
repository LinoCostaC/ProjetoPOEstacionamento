
package backend;

import java.io.Serializable;
import java.util.ArrayList;

//Lista de Parques
public class ListaParque implements Serializable {
    private ArrayList<Parque> listaParque;
    
    //Construtor
    public ListaParque() {
        listaParque = new ArrayList<Parque>();
    }

    public ArrayList<Parque> getListaParque() {
        return listaParque;
    }

    public void setListaparque(ArrayList<Parque> listaParque) {
        this.listaParque = listaParque;
    }
    
    //Obter todos os parques
    public int getTotalParques() {
        return listaParque.size();
    }
    
    public Parque get(int index) {
        return listaParque.get(index);
    }

    //Adicionar um parque à lista
    public void adicionarParque(Parque parque) {
        listaParque.add(parque);
    }

    //Remover um parque da lista
    public void removerParque(Parque parque) {
        listaParque.remove(parque);
    }
    public int size() {
        return listaParque.size();
}
    
   
}
