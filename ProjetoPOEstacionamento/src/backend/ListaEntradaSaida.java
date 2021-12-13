

package backend;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;


public class ListaEntradaSaida implements Serializable  {
    //Lista de Entradas e Saidas
    private ArrayList<EntradaSaida> listaEntradaSaida;
    
    //Construtor
    public ListaEntradaSaida() {
        listaEntradaSaida = new ArrayList<EntradaSaida>();
    }

    public ArrayList<EntradaSaida> getListaEntradaSaida() {
        return listaEntradaSaida;
    }

    public void setListaEntradaSaida(ArrayList<EntradaSaida> listaEntradaSaida) {
        this.listaEntradaSaida = listaEntradaSaida;
    }
    
    
    //Obter todos as entradas e saidas
    public int getTotalEntradaSaida() {
        return listaEntradaSaida.size();
    }
    
    public EntradaSaida get(int index) {
        return listaEntradaSaida.get(index);
    }

    //Regista entrada de viatura e adiciona à lista de EntradasSaidas
    public void adicionarEntradaSaida(Viatura viatura, Parque parque){
        EntradaSaida entradasaida = new EntradaSaida(LocalDateTime.now(), null, viatura, parque);
        listaEntradaSaida.add(entradasaida);
    }

    //Remover uma entrada e saida da lista
    public void removerEntradaSaida(EntradaSaida entradasaida) {
        listaEntradaSaida.remove(entradasaida);
    }
    
    //Registar a saída de uma viatura
    public void registarSaida(Viatura viatura){
        for (EntradaSaida es: listaEntradaSaida){
            if (es.getDataHoraSaida()== null && es.getViatura().equals(viatura)){
                es.setDataHoraSaida(LocalDateTime.now());
                break;
            }
        }
           
}
    
    /*Obter as viaturas que se encontram nas instalações
      A data de saída tem de ser nula (Viatura está no parque)
      A data de entrada não nula (Viatura entrou no parque)
      A data de saída não nula (Viatura saiu do parque)
      */
      
    //Obter lista de viaturas que estão dentro das instalações
      public ArrayList<Viatura> viaturaInstalações(EntradaSaida dataHoraSaida){
          ArrayList<Viatura> listaViatura = new ArrayList<Viatura>();
          for (EntradaSaida es : listaEntradaSaida){
              if (es.getDataHoraSaida() == null){
                listaViatura.add(es.getViatura());
              }
              
          }
                return listaViatura;
      
    
}
}
      
      
      


