package backend;

import java.io.Serializable;
import java.util.ArrayList;

public class Aplicacao implements Serializable {

    private Utilizador utilizadorLigado;
    private ListaParque listaParque;
    private ListaUtilizador listaUtilizador;
    private ListaViatura listaViatura;
    // lista de entradas e saidas 

    public Aplicacao() {
        listaParque = new ListaParque();
        listaUtilizador = new ListaUtilizador();
        listaViatura = new ListaViatura();

    }

    //Getters
    public Utilizador getUtilizadorLigado() {
        return utilizadorLigado;
    }

    public ListaParque getListaParque() {
        return listaParque;
    }

    public ArrayList<Parque> getTotalParque() {
        return listaParque.getListaParque();
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

    //terminar 
    public void terminar() {

        System.exit(0);

    }

}
