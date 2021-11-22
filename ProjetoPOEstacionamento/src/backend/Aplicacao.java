
package backend;

import java.io.Serializable;
import java.util.ArrayList;


public class Aplicacao implements Serializable {
    private Utilizador utilizadorLigado;
    private ListaParque listaParque;
    private ListaSeguranca listaSeguranca;
    private ListaUtente listaUtente;
    private ListaUtilizador listaUtilizador;
    private ListaViatura listaViatura;
   
    
    public Aplicacao () {
        listaParque = new ListaParque();
        listaSeguranca = new ListaSeguranca();
        listaUtente = new ListaUtente();
        listaUtilizador = new ListaUtilizador();
        listaViatura = new ListaViatura();
        
    }
    
    
    public Utilizador getUtilizadorLigado(){
        return utilizadorLigado;
    }

    public ListaParque getListaParque() {
        return listaParque;
    }
    
    public ArrayList<Parque> getTotalParque() {
        return listaParque.getListaParque();
    }

    public ListaSeguranca getListaSeguranca() {
        return listaSeguranca;
    }

    public ListaUtente getListaUtente() {
        return listaUtente;
    }

    public ListaUtilizador getListaUtilizador() {
        return listaUtilizador;
    }
    
    public ListaViatura getListaViatura() {
        return listaViatura;
    }
    
    //Autenticar utilizador 
    public boolean autenticarUser(String username, String password) throws ListaUtilizador.UtilizadorDuplicadoException {
        if (listaUtilizador.existeUser(username)) {
            Utilizador u = listaUtilizador.getUser(username);
            if (u.getPassword().equals(password)) {
                utilizadorLigado = u;
                return true;
            }
        }
        return false;
    }
    
    
}
