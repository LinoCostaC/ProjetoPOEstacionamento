package backend;

public class ParqueAcessoCondicionado extends Parque {

    // variaveis de instacia
    private double preco;
    private final int lugaresMaximosCondicionado;

    public ParqueAcessoCondicionado(String nome, int numeroLugares, double preco) {
        super(nome, numeroLugares, preco);
        lugaresMaximosCondicionado = 50;
        preco = 50;

    }

}
