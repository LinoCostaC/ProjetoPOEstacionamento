
package backend;

import java.sql.Time;
import java.util.Date;


public class EntradaSaida {
    // variaveis de instacia
    private Date dataEntrada;
    private Date dataSaida;
    private Time horaEntrada;
    private Time horaSaida;

    public EntradaSaida() {
    }

    public EntradaSaida(Date dataEntrada, Date dataSaida, Time horaEntrada, Time horaSaida) {
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.horaEntrada = horaEntrada;
        this.horaSaida = horaSaida;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public Date getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }

    public Time getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(Time horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public Time getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(Time horaSaida) {
        this.horaSaida = horaSaida;
    }

    @Override
    public String toString() {
        return "EntradaSaida{" + "dataEntrada=" + dataEntrada + ", dataSaida=" + dataSaida + ", horaEntrada=" + horaEntrada + ", horaSaida=" + horaSaida + '}';
    }
    
    
}
