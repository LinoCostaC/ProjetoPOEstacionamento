
package backend;


public class ParqueAcessoCondicionado extends Parque {
    // variaveis de instacia
       private float preco;
       private String tipoParque;
    
     public ParqueAcessoCondicionado(String nome, int numeroLugares, String tipoParque, float preco) {
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
            

