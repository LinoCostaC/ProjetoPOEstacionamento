
package backend;

import java.io.Serializable;


public class Aplicacao implements Serializable {
    private Utilizador userligado;
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
    
    
    
}
