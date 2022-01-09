package backend;
import java.io.Serializable;

public class ParqueLugarAssegurado extends Parque implements Serializable  {

  
    private final int lugaresMaximosAssegurado;

    public ParqueLugarAssegurado(String nome, int numeroLugares, double preco) {
        super(nome, numeroLugares, preco);
        lugaresMaximosAssegurado = 25;
        preco = 100;
    }

   

}
