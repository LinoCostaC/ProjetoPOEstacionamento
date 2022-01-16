package backend;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author LC
 */
public class ListaEntradaSaida implements Serializable  {
    //Lista de Entradas e Saidas
    private ArrayList<EntradaSaida> listaEntradaSaida;
    
    //Construtor

    /**
     *
     */
    public ListaEntradaSaida() {
        listaEntradaSaida = new ArrayList<EntradaSaida>();
    }

    /**
     *
     * @return
     */
    public ArrayList<EntradaSaida> getListaEntradaSaida() {
        return listaEntradaSaida;
    }
    
    /**
     *
     * @param listaEntradaSaida
     */
    public void setListaEntradaSaida(ArrayList<EntradaSaida> listaEntradaSaida) {
        this.listaEntradaSaida = listaEntradaSaida;
    }
    
    //Obter todos as entradas e saidas

    /**
     *
     * @return
     */
    public int getTotalEntradaSaida() {
        return listaEntradaSaida.size();
    }
    
    /**
     *
     * @param index
     * @return
     */
    public EntradaSaida get(int index) {
        return listaEntradaSaida.get(index);
    }

    //Regista entrada de viatura e adiciona à lista de EntradasSaidas

    /**
     *
     * @param viatura
     * @param parque
     */
    public void adicionarEntradaSaida(Viatura viatura, Parque parque){
        EntradaSaida entradasaida = new EntradaSaida(LocalDateTime.now(), null, viatura, parque);
        listaEntradaSaida.add(entradasaida);
    }

    //Remover uma entrada e saida da lista

    /**
     *
     * @param entradasaida
     */
    public void removerEntradaSaida(EntradaSaida entradasaida) {
        listaEntradaSaida.remove(entradasaida);
    }
    
    //Registar a saída de uma viatura

    /**
     *
     * @param viatura
     */
    public void registarSaida(Viatura viatura){
        for (EntradaSaida es: listaEntradaSaida){
            if (es.getDataHoraSaida()== null && es.getViatura().equals(viatura)){
                es.setDataHoraSaida(LocalDateTime.now());
                break;
            }
        }         
}
  
    //Obter lista de viaturas que estão dentro das instalações

    /**
     *
     * @param dataHoraSaida
     * @return
     */
      public ArrayList<Viatura> viaturaInstalações(EntradaSaida dataHoraSaida){
          ArrayList<Viatura> listaViatura = new ArrayList<Viatura>();
          for (EntradaSaida es : listaEntradaSaida){
              if (es.getDataHoraSaida() == null){
                listaViatura.add(es.getViatura());
              }
              
          }
                return listaViatura;
 
}
      
      // Verificar a disponibilidade de lugares no parque

    /**
     *
     * @param parque
     * @return
     */
      public boolean verificarDisponibilidade(Parque parque) {
        double somaTotal = 0;
        for (EntradaSaida controlo : listaEntradaSaida) {
            if (controlo.getDataHoraEntrada()!= null && controlo.getDataHoraSaida() == null) {
                somaTotal += 1;
            }
        }
        if ((parque.getNumeroLugares()- somaTotal) == 0) {
            return false;
        } else {
            return true;

        }
}
}
      
      
      


