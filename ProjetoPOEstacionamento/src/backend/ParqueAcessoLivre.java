package backend;

public class ParqueAcessoLivre extends Parque {

    
    private final int lugaresMaximosLivre;

    public ParqueAcessoLivre(String nome, int numeroLugares, float preco) {
        super(nome, numeroLugares, preco);
        lugaresMaximosLivre = 100;

    }

    
            
}
