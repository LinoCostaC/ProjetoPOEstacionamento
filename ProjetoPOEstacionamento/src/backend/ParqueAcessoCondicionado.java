
package backend;


public class ParqueAcessoCondicionado extends Parque {
    // variaveis de instacia
       private double preco;
       private final int lugaresMaximosCondicionado;
    
   

    public ParqueAcessoCondicionado(String nome, int numeroLugares, float preco) {
        super(nome, numeroLugares, preco);

        lugaresMaximosCondicionado = 50;
        
    }


    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

   
    public String getTipoParque() {
        return tipoParque;
    }
    
    public void setTipoParque(String tipoParque) {
        this.tipoParque = tipoParque;
}

}
            

