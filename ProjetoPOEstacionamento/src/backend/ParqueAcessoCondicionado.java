
package backend;


public class ParqueAcessoCondicionado extends Parque {
    // variaveis de instacia
       private float preco;
       private final int lugaresMaximosCondicionado;
    

    public ParqueAcessoCondicionado(String nome, int numeroLugares, float preco) {
        super(nome, numeroLugares, preco);

        lugaresMaximosCondicionado = 50;
        
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

   
    
            
    
}
            

