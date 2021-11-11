

package tpback;


public class ListaEmpregados {
    private Empregado[] listaEmpregado;
    private int numEmpregados;
    private int total;


public ListaEmpregados(int numMaxEmpregado){
    listaEmpregado = new Empregado[numMaxEmpregado];
}

// Adiciona um empreagado no fim da fila
public void adicionar(Empregado empregado){
    //for (int i=0; i < listaEmpregado.length; i++){
    listaEmpregado[numEmpregados] = empregado;
    numEmpregados ++;
    }

public double calcularTotalSalarios(){
    for (int i=0; i<numEmpregados; i++){
        Empregado e = listaEmpregado[i];
        total += e.calcularSalarioBruto();
    }
    
}

public int calcularKmPercorridos(){
    int total = 0;
    Empregado e = listaEmpregado[i];
    if (e instanceof Motorista){
        total += ((Motorista)e).getNumKmMes();
    }
    return total;
}

public int calcularTotalGestores(){
    int total = 0;
    
    for (int i=0; i<numEmpregados; i++){
        Empregado e = listaEmpregado[i];
        if (e instanceof Gestor){
            
        }
    }
    return total;
}

public int calcularTotalEmpregadosTipo(String tipo){
    int total = 0;
    for (int i=0; i<numEmpregados; i++){
        Empregado e = listaEmpregado[i];
        if (e.getClass().getSimpleName().equals(tipo)){
            total++;
        }
    }
    return total;
}

public Empregado procurarEmpregado(String codigo){
    
}



}
    



