package backend;

import java.io.Serializable;
import java.util.ArrayList;

public class Aplicacao implements Serializable {

    private Utilizador utilizadorLigado;
    private ListaParque listaParque;
    private ListaUtilizador listaUtilizador;
    private ListaViatura listaViatura;
    private ListaEntradaSaida listaEntradaSaida;
    private ListaPedidoAcesso listaPedidoAcesso;

    public Aplicacao() {
        listaParque = new ListaParque();
        listaUtilizador = new ListaUtilizador();
        listaViatura = new ListaViatura();
        listaEntradaSaida= new ListaEntradaSaida();
        listaPedidoAcesso= new ListaPedidoAcesso();
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

    public ListaEntradaSaida getListaEntradaSaida() {
        return listaEntradaSaida;
    }

    public void setListaEntradaSaida(ListaEntradaSaida listaEntradaSaida) {
        this.listaEntradaSaida = listaEntradaSaida;
    }

    public ListaPedidoAcesso getListaPedidoAcesso() {
        return listaPedidoAcesso;
    }

    public void setListaPedidoAcesso(ListaPedidoAcesso listaPedidoAcesso) {
        this.listaPedidoAcesso = listaPedidoAcesso;
    }

    //Autenticar utilizador 
    public boolean autenticarUser(String username, String password) {
        if(listaUtilizador.existe(username)){
            Utilizador u = listaUtilizador.getUtilizador(username);
            if(u.getPassword().equals(password)){
                utilizadorLigado = u;

                return true;
            }
        }
        return false;
    }
    public void inicializarSistema() {
        listaUtilizador.adicionar(new Administrador("admin", "admin", "Alex"));
        listaUtilizador.adicionar(new Seguranca("seguranca","seguranca", "Bruno"));
        listaUtilizador.adicionar(new Utente ("utente","utente","Goncalo","969697763"));
 
    }

    //terminar 
    public void terminar() {

        System.exit(0);
    }
}
