
package backend;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author LC
 */
public class ListaUtilizador implements Serializable {

    private HashMap<String, Utilizador> listaUtilizador;//username, Utilizador

    /**
     *
     */
    public ListaUtilizador() {
        listaUtilizador = new HashMap<>();
    }

    /**
     *
     * @param utilizador
     */
    public void adicionar(Utilizador utilizador) {
        if (!listaUtilizador.containsKey​(utilizador.getUsername())) {
            listaUtilizador.put(utilizador.getUsername(), utilizador);
        } else {
            System.err.println("Esse username já está a ser utilizado!");
        }
    }

    /**
     *
     * @param utilizador
     */
    public void remover(Utilizador utilizador) {
        if (listaUtilizador.containsKey​(utilizador.getUsername())) {
            listaUtilizador.remove(utilizador.getUsername());
        } else {
            System.err.println("Esse username não existe");
        }
    }

    /**
     *
     * @param username
     * @return
     */
    public boolean existe(String username) {
        return listaUtilizador.containsKey(username);
    }

    /**
     *
     * @param username
     * @return
     */
    public Utilizador getUtilizador(String username) {
        return listaUtilizador.get(username);
    }
    
    /**
     *
     * @param username
     * @return
     */
    public Utente getUtente(String username) {
        return (Utente) listaUtilizador.get(username);
    }
    
    /**
     *
     * @param username
     * @return
     */
    public Seguranca getSeguranca(String username) {
        return (Seguranca) listaUtilizador.get(username);
    }
         
    /**
     *
     * @return
     */
    public ArrayList<Utilizador> todos() {
        return new ArrayList<>(listaUtilizador.values());
    }

    /**
     *
     * @return
     */
    public int size() {
        return listaUtilizador.size();
    }
     
    //Método para retornar lista de Seguranças

    /**
     *
     * @return
     */
    public ArrayList<Utilizador> listaSegurancas(){
        ArrayList<Utilizador> listaSeguranca = new ArrayList<Utilizador>();
        for (String i : listaUtilizador.keySet()){
            if(listaUtilizador.get(i) instanceof Seguranca){
                listaSeguranca.add(listaUtilizador.get(i));
            }
        }
        return listaSeguranca;
}
         
}    
    


