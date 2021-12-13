
package backend;

public class testeMain {
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
        
        
        
        System.out.println(listaViatura.getListaViatura());
        
      
        System.out.println(listaViatura.getPercentagemCombustível("Gasolina"));
       
    }
}
