
package backend;

import java.io.Serializable;
import java.util.ArrayList;

//Lista de Utentes
public class ListaUtentes implements Serializable {
    private ArrayList<Utente> listaUtente;
    
    //Construtor
    public ListaUtentes() {
        listaUtente = new ArrayList<Utente>();
    }

    public ArrayList<Utente> getListaUtente() {
        return listaUtente;
    }

    public void setListaUtente(ArrayList<Utente> listaUtente) {
        this.listaUtente = listaUtente;
    }
    
    
    //Obter todos os utentes
    public int getTotalUtente() {
        return listaUtente.size();
    }
    
    public Utente get(int index) {
        return listaUtente.get(index);
    }

    //Adicionar um utente à lista
    public void adicionarUtente(Utente utente) {
        listaUtente.add(utente);
    }

    //Remover um utente da lista
    public void removerUtente(Utente utente) {
        listaUtente.remove(utente);
    }
    
    //Obter um utente através do seu username
    public Utente getUtente(String username) {
        for (Utente u : listaUtente) {
            if (u != null && u.getUsernameUtente().equals(username)) {
                return u;
            }
        }
        return null;
    }

    
    
}

