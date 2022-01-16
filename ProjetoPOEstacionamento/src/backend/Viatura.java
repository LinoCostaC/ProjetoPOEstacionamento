
package backend;

import java.util.Objects;
import java.io.Serializable;

/**
 *
 * @author LC
 */
public class Viatura implements Serializable {
    
//variaveis de instancia
    private String matricula;
    private String marca;
    private String modelo;
    private String combustivel;
    
//construtores

    /**
     *
     */
    public Viatura() {
    
    }

    /**
     *
     * @param matricula
     * @param marca
     * @param modelo
     * @param combustivel
     */
    public Viatura(String matricula, String marca, String modelo, String combustivel) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.combustivel = combustivel;
    }
    
//getters e setters

    /**
     *
     * @return
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     *
     * @param matricula
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    /**
     *
     * @return
     */
    public String getMarca() {
        return marca;
    }

    /**
     *
     * @param marca
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }
   
    /**
     *
     * @return
     */
    public String getModelo() {
        return modelo;
    }

    /**
     *
     * @param modelo
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    /**
     *
     * @return
     */
    public String getCombustivel() {
        return combustivel;
    }

    /**
     *
     * @param combustivel
     */
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
