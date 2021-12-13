
package backend;


public class ParqueAcessoCondicionado extends Parque {
    // variaveis de instacia
       private float preco;
       private String tipoParque;
       private final int lugaresMaximosCondicionado;
    
     public ParqueAcessoCondicionado(String nome, int numeroLugares, String tipoParque, float preco) {
        super(nome, numeroLugares);
        this.tipoParque = tipoParque;
        this.preco = preco;
        lugaresMaximosCondicionado = 50;
        
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
            

