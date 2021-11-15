
package backend;

import java.io.Serializable;
import java.util.ArrayList;


public class ListaViaturas implements Serializable {
    //Lista de Viaturas
    private ArrayList<Viatura> listaViatura;
    
    //Construtor
    public ListaViaturas() {
        listaViatura = new ArrayList<Viatura>();
    }

    public ListaViaturas(ArrayList<Seguranca> listaSeguranca) {
        this.listaViatura = listaViatura;
    }

   //Getters e Setters
    public ArrayList<Viatura> getListaViatura() {
        return listaViatura;
    }

    public void setListaViatura(ArrayList<Viatura> listaViatura) {
        this.listaViatura = listaViatura;
    }
    
    
    //Total de todas as viaturas
    public int getTotalViatura() {
        return listaViatura.size();
    }
    
    public Viatura get(int index) {
        return listaViatura.get(index);
    }

    //Adicionar viatura à lista
    public void adicionarViatura(Viatura viatura) {
        listaViatura.add(viatura);
    }

    //Remover viatura da lista
    public void removerViatura(Viatura viatura) {
        listaViatura.remove(viatura);
    }
    
    //Obter uma viatura a partir da sua matrícula
    public Viatura getViatura(String matricula) {
        for (Viatura v : listaViatura) {
            if (v != null && v.getMatricula().equals(matricula)) {
                return v;
            }
        }
        return null;
    }
}

