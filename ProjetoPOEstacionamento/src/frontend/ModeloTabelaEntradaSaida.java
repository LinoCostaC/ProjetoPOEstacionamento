
package frontend;


import backend.ListaEntradaSaida;
import backend.EntradaSaida;
import javax.swing.table.AbstractTableModel;


public class ModeloTabelaEntradaSaida extends AbstractTableModel {
    private ListaEntradaSaida entradaSaida;
    private static String[] colunasTabela = new String[]{
        "Data Entrada", "Data Saída", "Viatura", "Parque"
    };

    public ModeloTabelaEntradaSaida(ListaEntradaSaida entradaSaida) {
        this.entradaSaida = entradaSaida;
    }

    public void atualizar() {
        //Informa o modelo que foram efetuadas alteracoes, o modelo informa a tabela e os dados são redesenhados
        this.fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return entradaSaida.getTotalEntradaSaida();
    }

    @Override
    public int getColumnCount() {
        return colunasTabela.length;
    }
    
    @Override
    public String getColumnName(int column) {
        return colunasTabela[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        EntradaSaida es = entradaSaida.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return es.getDataHoraEntrada();

            case 1:
                return es.getDataHoraSaida();
                
            case 2:
                return es.getViatura();
            
            case 3:
                return es.getParque();
               
        }
        return null;
    }
    
     

}
