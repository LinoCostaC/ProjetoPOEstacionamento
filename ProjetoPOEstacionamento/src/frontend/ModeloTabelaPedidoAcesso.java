package frontend;

import backend.ListaPedidoAcesso;
import backend.PedidoAcesso;
import javax.swing.table.AbstractTableModel;


public class ModeloTabelaPedidoAcesso extends AbstractTableModel {
    private ListaPedidoAcesso pedidoAcesso;
    private static String[] colunasTabela = new String[]{
        "Estado", "Parque", "Utente"
    };

    public ModeloTabelaPedidoAcesso(ListaPedidoAcesso pedido) {
        this.pedidoAcesso = pedido;
    }

    public void atualizar() {
        //Informa o modelo que foram efetuadas alteracoes, o modelo informa a tabela e os dados são redesenhados
        this.fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return pedidoAcesso.getTotalAcesso();
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
        PedidoAcesso pa = pedidoAcesso.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return pa.getEstado();
            case 1:
                return pa.getPedidoParque();           
            case 2:
                return pa.getPedidoUtente();       
        }
        return null;
    }
    

}
