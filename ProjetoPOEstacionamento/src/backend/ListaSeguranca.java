
package backend;

import java.io.Serializable;
import java.util.ArrayList;

//Lista de Segurancas
public class ListaSeguranca implements Serializable {
    private ArrayList<Seguranca> listaSeguranca;
    
    //Construtor
    public ListaSeguranca() {
        listaSeguranca = new ArrayList<Seguranca>();
    }

    public ListaSeguranca(ArrayList<Seguranca> listaSeguranca) {
        this.listaSeguranca = listaSeguranca;
    }

   //Getters e Setters
    public ArrayList<Seguranca> getListaSeguranca() {
        return listaSeguranca;
    }

    public void setListaSeguranca(ArrayList<Seguranca> listaSeguranca) {
        this.listaSeguranca = listaSeguranca;
    }
    
    
    //Total de todos os seguranças
    public int getTotalSeguranca() {
        return listaSeguranca.size();
    }
    
    public Seguranca get(int index) {
        return listaSeguranca.get(index);
    }

    //Adicionar segurança à lista
    public void adicionarSeguranca(Seguranca seguranca) {
        listaSeguranca.add(seguranca);
    }

    //Remover segurança da lista
    public void removerSeguranca(Seguranca seguranca) {
        listaSeguranca.remove(seguranca);
    }
    
    //Obter um seguranca a partir do seu Username
    public Seguranca getSeguranca(String username) {
        for (Seguranca s : listaSeguranca) {
            if (s != null && s.getUsernameSeguranca().equals(username)) {
                return s;
            }
        }
        return null;
    }
}

