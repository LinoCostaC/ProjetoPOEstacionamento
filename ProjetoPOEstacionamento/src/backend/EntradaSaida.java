
package backend;

import java.time.LocalDateTime;



public class EntradaSaida {
    // variaveis de instacia
    private LocalDateTime dataHoraEntrada;
    private LocalDateTime dataHoraSaida;
    private Viatura viatura;
    private Parque parque;


    public EntradaSaida() {
    
    }

    public EntradaSaida(LocalDateTime dataHoraEntrada) {
        this.dataHoraEntrada = dataHoraEntrada;
        this.dataHoraSaida = null;
    }

    public LocalDateTime getDataHoraEntrada() {
        return dataHoraEntrada;
    }

    public void setDataHoraEntrada(LocalDateTime dataHoraEntrada) {
        this.dataHoraEntrada = dataHoraEntrada;
    }

    public LocalDateTime getDataHoraSaida() {
        return dataHoraSaida;
    }

    public void setDataHoraSaida(LocalDateTime dataHoraSaida) {
        this.dataHoraSaida = dataHoraSaida;
    }

}   