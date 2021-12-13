package backend;

public class ParqueLugarAssegurado extends Parque {

    private float preco;
    private final int lugaresMaximosAssegurado;

    public ParqueLugarAssegurado(String nome, int numeroLugares, float preco) {
        super(nome, numeroLugares);
        this.preco = preco;
        lugaresMaximosAssegurado = 25;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

}
