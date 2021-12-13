package backend;

public class ParqueAcessoLivre extends Parque {

    private float preco;
    private final int lugaresMaximosLivre;

    public ParqueAcessoLivre(String nome, int numeroLugares, float preco) {
        super(nome, numeroLugares);
        this.preco = preco;
        lugaresMaximosLivre = 100;

    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
            
}
