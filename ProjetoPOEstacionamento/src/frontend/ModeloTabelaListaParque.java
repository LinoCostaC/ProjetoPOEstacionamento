
package frontend;


import backend.ListaParque;
import backend.Parque;
import javax.swing.table.AbstractTableModel;


public class ModeloTabelaListaParque extends AbstractTableModel {
    private ListaParque parque;
    private static String[] colunasTabela = new String[]{
        "Nome", "Numero de Lugares", "Preço"
    };

    public ModeloTabelaListaParque(ListaParque parque) {
        this.parque = parque;
    }

    public void atualizar() {
        this.fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return parque.getTotalParques();
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
        Parque p = parque.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return p.getNomeParque();

            case 1:
                return p.getNumeroLugares();
                
            case 2:
                return p.getPreco();
                
        }
        return null;
    }
    
     

}