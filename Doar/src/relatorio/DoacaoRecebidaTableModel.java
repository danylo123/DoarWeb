package relatorio;

import doacao.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class DoacaoRecebidaTableModel extends AbstractTableModel {

    private List<Doacao> doacaos = new ArrayList<>();
    private String[] colunas = {"Código", "Nome", "Data Recebimento", "Local de recebimento"};

    public DoacaoRecebidaTableModel(List<Doacao> doacaos) {
        this.doacaos = doacaos;
    }

    @Override
    public int getRowCount() {
        return doacaos.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Doacao doacao = doacaos.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return doacao.getIdDoacao();
            case 1:
                return doacao.getNomeDoacao();
            case 2:
                return doacao.getDataEntrada();
            case 3:
                return doacao.getUsuario().getEstabelecimento().getNomeEstabelecimento();

        }
        return null;
    }

    public String getColumnName(int index) {
        switch (index) {
            case 0:
                return colunas[0];
            case 1:
                return colunas[1];
            case 2:
                return colunas[2];
            case 3:
                return colunas[3];

        }
        return null;
    }

}
