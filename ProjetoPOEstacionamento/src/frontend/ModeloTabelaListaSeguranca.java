
package frontend;
import backend.Seguranca;
import backend.ListaUtilizador;
import javax.swing.table.AbstractTableModel;


public class ModeloTabelaListaSeguranca extends AbstractTableModel {
    private ModeloTabelaListaSeguranca modeloTabela;
    private ListaUtilizador listaSeguranca;
    private static String[] colunasTabela = new String[]{
        "Username", "Pasword", "Nome"
    };

    public ModeloTabelaListaSeguranca(ListaUtilizador seguranca) {
        this.listaSeguranca = seguranca;
    }

    public void atualizar() {
        modeloTabela.fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return listaSeguranca.size();
    }

    @Override
    public int getColumnCount() {
        return colunasTabela.length;
    }
    
    @Override
    public String getColumnName(int column) {
        return colunasTabela[column];
    }
/*
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        

        switch (columnIndex) {
            case 0:
                return listaSeguranca.listaSegurancas().;

            case 1:
                return seguranca.getPasswordSeguranca();
                
            case 2:
                return seguranca.getNomeSeguranca();
                
        }
        return null;
    }
    */

}
//ahdlkashjdljasjd