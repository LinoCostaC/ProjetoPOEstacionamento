
package backend;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author LC
 */
public class testeMain {

    /**
     *
     * @param args
     */
    public static void main(String [] args){
        Viatura v= new Viatura();
        v.setCombustivel("Gasolina");
        Viatura v1= new Viatura();
        v1.setCombustivel("Gasolina");
        Viatura v2= new Viatura();
        v2.setCombustivel("Gasoleo");
        
        ListaViatura listaViatura = new ListaViatura(); 
        listaViatura.adicionarViatura(v);
        listaViatura.adicionarViatura(v1);
        listaViatura.adicionarViatura(v2);
        
        Parque p = new Parque();
        Parque p1 = new Parque();
        Parque p2 = new Parque();

        ListaEntradaSaida listaEntradaSaida = new ListaEntradaSaida();
        listaEntradaSaida.adicionarEntradaSaida(v1, p1);
        
        EntradaSaida es = new EntradaSaida();
        es.setDataHoraEntrada(LocalDateTime.now());
        System.out.println(es.getDataHoraEntrada());
        
        p.setNumeroLugares(3);
        System.out.println(p.getNumeroLugares());
        System.out.println(p.getNumeroLugares()-1);
        
        
        System.out.println(listaViatura.getListaViatura());
        
      
        System.out.println(listaViatura.getPercentagemCombustível("Gasolina"));
       
    }
}
