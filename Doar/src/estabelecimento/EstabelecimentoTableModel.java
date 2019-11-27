package estabelecimento;

import estabelecimento.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import estabelecimento.Estabelecimento;

public class EstabelecimentoTableModel extends AbstractTableModel {

    private List<Estabelecimento> estabelecimentos = new ArrayList<>();
    private String[] colunas = {"Código", "Nome", "Rua", "Bairro", "Cidade"};

    public EstabelecimentoTableModel(List<Estabelecimento> estabelecimentos) {
        this.estabelecimentos = estabelecimentos;
    }

    @Override
    public int getRowCount() {
        return estabelecimentos.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Estabelecimento estabelecimento = estabelecimentos.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return estabelecimento.getIdEstabelecimento();
            case 1:
                return estabelecimento.getNomeEstabelecimento();
            case 2:
                return estabelecimento.getRuaEstabelecimento();
            case 3:
                return estabelecimento.getBairroEstabelecimento();
            case 4:
                return estabelecimento.getCidadeEstabelecimento();
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
