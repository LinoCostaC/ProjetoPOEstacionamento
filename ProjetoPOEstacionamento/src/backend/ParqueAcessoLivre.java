package backend;
import java.io.Serializable;

public class ParqueAcessoLivre extends Parque implements Serializable {

    
    private final int lugaresMaximosLivre;

    public ParqueAcessoLivre(String nome, int numeroLugares, double preco) {
        super(nome, numeroLugares,preco);
        lugaresMaximosLivre = 100;
        preco = 22.5;

    }

    
            
}
