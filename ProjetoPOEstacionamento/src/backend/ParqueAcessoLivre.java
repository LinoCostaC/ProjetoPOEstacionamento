package backend;

public class ParqueAcessoLivre extends Parque {

    
    private final int lugaresMaximosLivre;

    public ParqueAcessoLivre(String nome, int numeroLugares, double preco) {
        super(nome, numeroLugares,preco);
        lugaresMaximosLivre = 100;
        preco = 22.5;

    }

    
            
}
