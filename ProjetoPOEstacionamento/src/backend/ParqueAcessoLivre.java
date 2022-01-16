package backend;
import java.io.Serializable;

/**
 *
 * @author LC
 */
public class ParqueAcessoLivre extends Parque implements Serializable {

    
    private final int lugaresMaximosLivre;

    /**
     *
     * @param nome
     * @param numeroLugares
     * @param preco
     */
    public ParqueAcessoLivre(String nome, int numeroLugares, double preco) {
        super(nome, numeroLugares,preco);
        lugaresMaximosLivre = 100;
        preco = 22.5;

    }

    
            
}
