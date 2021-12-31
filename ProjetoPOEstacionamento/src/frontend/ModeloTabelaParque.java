
package frontend;


import backend.ListaParque;
import backend.Parque;
import javax.swing.table.AbstractTableModel;


public class ModeloTabelaParque extends AbstractTableModel {
    
    private ModeloTabelaParque modeloTabela;
    private ListaParque parque;
    private static String[] colunasTabela = new String[]{
        "Nome Parque", "Numero Lugares", "Preco"
    };

    public ModeloTabelaParque(ListaParque parque) {
        this.parque = parque;
    }

    public void atualizar() {
        //Informa o modelo que foram efetuadas alteracoes, o modelo informa a tabela e os dados são redesenhados
        modeloTabela.fireTableDataChanged();
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
    

}