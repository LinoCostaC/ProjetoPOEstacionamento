
package backend;

public class Parque {
    
// variaveis de instacia
    
    private String nomeParque;
    private int numeroLugares;
    private String tipoParque;
    
//construtores
    
    public Parque() {
    }

    public Parque(String nome, int numeroLugares) {
        this.nomeParque = nome;
        this.numeroLugares = numeroLugares;
        
    }
    
//get e set de nome
    
    public String getNomeParque() {
        return nomeParque;
    }

    public void setNomeParque(String nome) {
        this.nomeParque = nome;
    }

//get e set numeroLugares
    
    public int getNumeroLugares() {
        return numeroLugares;
    }

    public void setNumeroLugares(int numeroLugares) {
        this.numeroLugares = numeroLugares;
    }
    
    

    
    //Método ToString
    @Override
    public String toString() {
        return super.toString() + "Nome Parque=" + nomeParque + ", Numero de lugares=" + numeroLugares + ", Tipo de Parque=" + tipoParque + '}';
    }
}
