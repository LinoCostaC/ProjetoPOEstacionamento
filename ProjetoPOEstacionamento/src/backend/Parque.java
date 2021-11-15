
package backend;

public class Parque {
    
// variaveis de instacia
    
    private String nome;
    private int numeroLugares;
    private String tipoParque;
    
//construtores
    
    public Parque() {
    }

    public Parque(String nome, int numeroLugares, String tipoParque) {
        this.nome = nome;
        this.numeroLugares = numeroLugares;
        this.tipoParque = tipoParque;
    }
    
//get e set de nome
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

//get e set numeroLugares
    
    public int getNumeroLugares() {
        return numeroLugares;
    }

    public void setNumeroLugares(int numeroLugares) {
        this.numeroLugares = numeroLugares;
    }

//get e set tipoParque
    
    public String getTipoParque() {
        return tipoParque;
    }

    public void setTipoParque(String tipoParque) {
        this.tipoParque = tipoParque;
    }
    
}
