package backend;
import java.io.Serializable;

/**
 *
 * @author LC
 */
public class ParqueAcessoCondicionado extends Parque implements Serializable {

    // variaveis de instacia
    private double preco;
    private final int lugaresMaximosCondicionado;

    /**
     *
     * @param nome
     * @param numeroLugares
     * @param preco
     */
    public ParqueAcessoCondicionado(String nome, int numeroLugares, double preco) {
        super(nome, numeroLugares, preco);
        lugaresMaximosCondicionado = 50;
        preco = 50;

    }

}
