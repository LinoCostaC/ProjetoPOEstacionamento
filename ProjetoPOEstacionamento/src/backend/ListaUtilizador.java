
package backend;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

public class ListaUtilizador implements Serializable {

    private HashMap<String, Utilizador> listaUtilizador;//username, Utilizador

    public ListaUtilizador() {
        listaUtilizador = new HashMap<>();
    }

    public void adicionar(Utilizador utilizador) {
        if (!listaUtilizador.containsKey​(utilizador.getUsername())) {
            listaUtilizador.put(utilizador.getUsername(), utilizador);
        } else {
            System.err.println("Esse username já está a ser utilizado!");
        }
    }

    public void remover(Utilizador utilizador) {
        if (listaUtilizador.containsKey​(utilizador.getUsername())) {
            listaUtilizador.remove(utilizador.getUsername());
        } else {
            System.err.println("Esse username não existe");
        }
    }

    public boolean existe(String username) {
        return listaUtilizador.containsKey(username);
    }

    public Utilizador getUtilizador(String username) {
        return listaUtilizador.get(username);
    }
    
     public Utente getUtente(String username) {
        return (Utente) listaUtilizador.get(username);
    }
    
     public Seguranca getSeguranca(String username) {
        return (Seguranca) listaUtilizador.get(username);
    }
         
    public ArrayList<Utilizador> todos() {
        return new ArrayList<>(listaUtilizador.values());
    }

    public int size() {
        return listaUtilizador.size();
    }
   
    
    }


