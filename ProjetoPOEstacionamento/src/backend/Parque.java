
package backend;
import java.io.Serializable;

public class Parque implements Serializable {
    
// variaveis de instacia
    
    private String nomeParque;
    private int numeroLugares;
    private double preco; 

//construtores    
    public Parque() {
    }

    public Parque(String nome, int numeroLugares, double preco) {
        this.nomeParque = nome;
        this.numeroLugares = numeroLugares;
        this.preco = preco;        
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
    
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    
    //Método ToString
    @Override
    public String toString() {
        return super.toString() + "Nome Parque=" + nomeParque + ", Numero de lugares=" + numeroLugares + ", Preco=" + '}';
    }
}
