
package backend;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author LC
 */
public class ListaViatura implements Serializable {
    //Lista de Viaturas
    private ArrayList<Viatura> listaViatura;
    
    //Construtor

    /**
     *
     */
    public ListaViatura() {
        listaViatura = new ArrayList<Viatura>();
    }

    /**
     *
     * @param listaSeguranca
     */
    public ListaViatura(ArrayList<Seguranca> listaSeguranca) {
        this.listaViatura = listaViatura;
    }

   //Getters e Setters

    /**
     *
     * @return
     */
    public ArrayList<Viatura> getListaViatura() {
        return listaViatura;
    }

    /**
     *
     * @param listaViatura
     */
    public void setListaViatura(ArrayList<Viatura> listaViatura) {
        this.listaViatura = listaViatura;
    }

    //Total de todas as viaturas

    /**
     *
     * @return
     */
    public int getTotalViatura() {
        return listaViatura.size();
    }
    
    /**
     *
     * @param index
     * @return
     */
    public Viatura get(int index) {
        return listaViatura.get(index);
    }

    //Adicionar viatura à lista

    /**
     *
     * @param viatura
     */
    public void adicionarViatura(Viatura viatura) {
        listaViatura.add(viatura);
    }
    
 
    //Remover viatura da lista

    /**
     *
     * @param viatura
     */
    public void removerViatura(Viatura viatura) {
        listaViatura.remove(viatura);
    }
    
    //Obter uma viatura a partir da sua matrícula

    /**
     *
     * @param matricula
     * @return
     */
    public Viatura getViatura(String matricula) {
        for (Viatura v : listaViatura) {
            if (v != null && v.getMatricula().equals(matricula)) {
                return v;
            }
        }
        return null;
    }
    
    //Obter percentagem de viaturas por combustível

    /**
     *
     * @param combustivel
     * @return
     */
    public double getPercentagemCombustível(String combustivel){
        double count = 0.0;
        for (Viatura v : listaViatura){
            if (v.getCombustivel().equals(combustivel)){
                count++;  
            }      
        }
        double percentagem = count/getTotalViatura() * 100;
        return percentagem; 
        
    }  
}

