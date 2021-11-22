
package backend;


public class ParqueAcessoLivre extends Parque {
    private float preco;
    private String tipoParque;
    
     public ParqueAcessoLivre(String nome, int numeroLugares, String tipoParque, float preco) {
        super(nome, numeroLugares);
        this.tipoParque = tipoParque;
        this.preco = preco;
        
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getTipoParque() {
        return tipoParque;
    }

    public void setTipoParque(String tipoParque) {
        this.tipoParque = tipoParque;
    }
     
    
}
