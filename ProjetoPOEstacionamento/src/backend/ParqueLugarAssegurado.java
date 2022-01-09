package backend;

public class ParqueLugarAssegurado extends Parque {

  
    private final int lugaresMaximosAssegurado;

    public ParqueLugarAssegurado(String nome, int numeroLugares, double preco) {
        super(nome, numeroLugares, preco);
        lugaresMaximosAssegurado = 25;
        preco = 100;
    }

   

}
