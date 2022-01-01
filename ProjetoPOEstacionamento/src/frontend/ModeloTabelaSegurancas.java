
package frontend;

import backend.ListaUtilizador;
import backend.Seguranca;
import javax.swing.table.AbstractTableModel;



    public class ModeloTabelaSegurancas extends AbstractTableModel {
    
    private ModeloTabelaSegurancas modeloTabela;
    private final ListaUtilizador seguranca;
    private static  String[] colunasTabela = new String[]{
        "Nome", "Email", "Password"
    };

    public ModeloTabelaSegurancas(ListaUtilizador seguranca) {
        this.seguranca = seguranca;
    }

    public void atualizar() {
        //Informa o modelo que foram efetuadas alteracoes, o modelo informa a tabela e os dados são redesenhados
        modeloTabela.fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return seguranca.hashCode();
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
                return s.getNomeSeguranca();

            case 1:
                return s.getPasswordSeguranca();
                
            case 2:
                return s.getUsernameSeguranca();
        }
        return null;
    }
    
}

