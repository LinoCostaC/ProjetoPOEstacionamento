
package frontend;
import backend.Seguranca;
import backend.ListaUtilizador;
import javax.swing.table.AbstractTableModel;


public class ModeloTabelaListaSeguranca extends AbstractTableModel {
    private ModeloTabelaListaSeguranca modeloTabela;
    private ListaUtilizador seguranca;
    private static String[] colunasTabela = new String[]{
        "Username", "Pasword", "Nome"
    };

    public ModeloTabelaListaSeguranca(ListaUtilizador seguranca) {
        this.seguranca = seguranca;
    }

    public void atualizar() {
        modeloTabela.fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return seguranca.size();
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
        Seguranca s = seguranca.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return s.getUsernameSeguranca();

            case 1:
                return s.getPasswordSeguranca();
                
            case 2:
                return s.getNomeSeguranca();
                
        }
        return null;
    }
    

}
//ahdlkashjdljasjd