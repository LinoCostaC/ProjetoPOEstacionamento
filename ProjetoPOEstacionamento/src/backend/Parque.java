
package backend;
import java.io.Serializable;

/**
 *
 * @author LC
 */
public class Parque implements Serializable {
    
// variaveis de instacia
    
    private String nomeParque;
    private int numeroLugares;
    private double preco; 

//construtores    

    /**
     *
     */
    public Parque() {
    }

    /**
     *
     * @param nome
     * @param numeroLugares
     * @param preco
     */
    public Parque(String nome, int numeroLugares, double preco) {
        this.nomeParque = nome;
        this.numeroLugares = numeroLugares;
        this.preco = preco;        
    }

//getters e setters

    /**
     *
     * @return
     */
    public String getNomeParque() {
        return nomeParque;
    }

    /**
     *
     * @param nome
     */
    public void setNomeParque(String nome) {
        this.nomeParque = nome;
    }

    /**
     *
     * @return
     */
    public int getNumeroLugares() {
        return numeroLugares;
    }

    /**
     *
     * @param numeroLugares
     */
    public void setNumeroLugares(int numeroLugares) {
        this.numeroLugares = numeroLugares;
    }
    
    /**
     *
     * @return
     */
    public double getPreco() {
        return preco;
    }

    /**
     *
     * @param preco
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    
    //Método ToString
    @Override
    public String toString() {
        return super.toString() + "Nome Parque=" + nomeParque + ", Numero de lugares=" + numeroLugares + ", Preco=" + '}';
    }
}
