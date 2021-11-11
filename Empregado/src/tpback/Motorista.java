
package tpback;


public class Motorista extends Empregado{
    private int numKmMes;
    
    public Motorista(int codigo, String nome, int diasTrabalhoEfetivo, int numKmMes, int salarioDia){
        super(codigo, nome, diasTrabalhoEfetivo, salarioDia);
        numKmMes = numKmMes;
    }

    public int getNumKmMes() {
        return numKmMes;
    }

    public void setNumKmMes(int numKmMes) {
        this.numKmMes = numKmMes;
    }
    
    
}   
