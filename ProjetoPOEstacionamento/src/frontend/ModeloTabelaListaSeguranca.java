
package frontend;
import backend.Aplicacao;
import backend.Seguranca;
import backend.ListaUtilizador;
import backend.Utilizador;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class ModeloTabelaListaSeguranca extends AbstractTableModel {
    private ModeloTabelaListaSeguranca modeloTabela;
    private ArrayList<Utilizador> listaSeguranca;
    private Aplicacao aplicacao;
    private static String[] colunasTabela = new String[]{
        "Username", "Pasword", "Nome"
    };

    public ModeloTabelaListaSeguranca(ArrayList<Utilizador> seguranca) {
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

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        

        switch (columnIndex) {
            case 0:
                return listaSeguranca.get(rowIndex).getUsername();

            case 1:
                return listaSeguranca.get(rowIndex).getPassword();
                
            case 2:
                return listaSeguranca.get(rowIndex).getnome();
                
        }
        return null;
    }
    

}
//ahdlkashjdljasjd