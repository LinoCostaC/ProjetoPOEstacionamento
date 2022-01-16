
package backend;

import java.io.Serializable;
import java.util.ArrayList;

//Lista de Parques

/**
 *
 * @author LC
 */
public class ListaParque implements Serializable {
    private ArrayList<Parque> listaParque;
    
    //Construtor

    /**
     *
     */
    public ListaParque() {
        listaParque = new ArrayList<Parque>();
    }

    /**
     *
     * @return
     */
    public ArrayList<Parque> getListaParque() {
        return listaParque;
    }

    /**
     *
     * @param listaParque
     */
    public void setListaparque(ArrayList<Parque> listaParque) {
        this.listaParque = listaParque;
    }
    
    //Obter todos os parques

    /**
     *
     * @return
     */
    public int getTotalParques() {
        return listaParque.size();
    }
    
    /**
     *
     * @param index
     * @return
     */
    public Parque get(int index) {
        return listaParque.get(index);
    }

    //Adicionar um parque à lista

    /**
     *
     * @param parque
     */
    public void adicionarParque(Parque parque) {
        listaParque.add(parque);
    }

    //Remover um parque da lista

    /**
     *
     * @param parque
     */
    public void removerParque(Parque parque) {
        listaParque.remove(parque);
    }

    /**
     *
     * @return
     */
    public int size() {
        return listaParque.size();
}
    
   
}
