package backend;

public class ParqueLugarAssegurado extends Parque {

    private float preco;

    public ParqueLugarAssegurado(String nome, int numeroLugares, float preco) {
        super(nome, numeroLugares);

        this.preco = preco;

    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

}
