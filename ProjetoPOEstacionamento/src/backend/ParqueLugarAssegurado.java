package backend;
import java.io.Serializable;

/**
 *
 * @author LC
 */
public class ParqueLugarAssegurado extends Parque implements Serializable  {

  
    private final int lugaresMaximosAssegurado;

    /**
     *
     * @param nome
     * @param numeroLugares
     * @param preco
     */
    public ParqueLugarAssegurado(String nome, int numeroLugares, double preco) {
        super(nome, numeroLugares, preco);
        lugaresMaximosAssegurado = 25;
        preco = 100;
    }

   

}
