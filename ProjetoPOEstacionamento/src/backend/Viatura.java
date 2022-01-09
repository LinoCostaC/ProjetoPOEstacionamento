
package backend;

import java.util.Objects;
import java.io.Serializable;

public class Viatura implements Serializable {
    
//variaveis de instancia
    
    private String matricula;
    private String marca;
    private String modelo;
    private String combustivel;
    
//construtores
    
    public Viatura() {
    }

    public Viatura(String matricula, String marca, String modelo, String combustivel) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.combustivel = combustivel;
    }
    
//get e set de matricula
    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
//get e set de marca
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
//get e set de modelo
    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
        
//get e set de combustivel
    
    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }
    
    //Método ToString
    @Override
    public String toString() {
        return super.toString() + "Matricula=" + matricula + ", Marca=" + marca + ", Modelo=" + modelo + ", Combustivel=" + combustivel + '}';
    }
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Viatura other = (Viatura) obj;
        if (!Objects.equals(this.matricula, other.matricula)) {
            return false;
        }
        return true;
    }
}
