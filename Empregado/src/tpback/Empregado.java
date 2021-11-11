
package tpback;


public class Empregado {
    private int codigo;
    private String nome;
    private int diasTrabalhoEfetivo;
    private int salarioDia;
    
    
    
    public Empregado(){
        
    }
    
    public Empregado(int codigo, String nome, int diasTrabalhoEfetivo, int salarioDia){
        codigo = codigo;
        nome = nome;
        diasTrabalhoEfetivo = diasTrabalhoEfetivo;
        salarioDia = salarioDia;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDiasTrabalhoEfetivo() {
        return diasTrabalhoEfetivo;
    }

    public void setDiasTrabalhoEfetivo(int diasTrabalhoEfetivo) {
        this.diasTrabalhoEfetivo = diasTrabalhoEfetivo;
    }
    
    //public double calcularTotalSalarios{
    
    
    public double calcularSalarioBruto(double salarioDia){
            }
}

