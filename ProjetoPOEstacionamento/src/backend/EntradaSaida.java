
package backend;
import java.io.Serializable;

import java.time.LocalDateTime;

/**
 *
 * @author LC
 */
public class EntradaSaida implements Serializable {
    // variaveis de instancia
    private LocalDateTime dataHoraEntrada;
    private LocalDateTime dataHoraSaida;
    private Viatura viatura;
    private Parque parque;

    /**
     *
     */
    public EntradaSaida() {
    
    }

    /**
     *
     * @param dataHoraEntrada
     * @param dataHoraSaida
     * @param v
     * @param p
     */
    public EntradaSaida(LocalDateTime dataHoraEntrada, LocalDateTime dataHoraSaida, Viatura v, Parque p) {
        this.dataHoraEntrada = dataHoraEntrada;
        this.dataHoraSaida = null;
        this.viatura = v;
        this.parque = p;
    }

    /**
     *
     * @return
     */
    public LocalDateTime getDataHoraEntrada() {
        return dataHoraEntrada;
    }

    /**
     *
     * @param dataHoraEntrada
     */
    public void setDataHoraEntrada(LocalDateTime dataHoraEntrada) {
        this.dataHoraEntrada = dataHoraEntrada;
    }

    /**
     *
     * @return
     */
    public LocalDateTime getDataHoraSaida() {
        return dataHoraSaida;
    }

    /**
     *
     * @param dataHoraSaida
     */
    public void setDataHoraSaida(LocalDateTime dataHoraSaida) {
        this.dataHoraSaida = dataHoraSaida;
    }

    /**
     *
     * @return
     */
    public Viatura getViatura() {
        return viatura;
    }

    /**
     *
     * @param viatura
     */
    public void setViatura(Viatura viatura) {
        this.viatura = viatura;
    }

    /**
     *
     * @return
     */
    public Parque getParque() {
        return parque;
    }

    /**
     *
     * @param parque
     */
    public void setParque(Parque parque) {
        this.parque = parque;
    }

}   