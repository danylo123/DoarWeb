package usuario;

import usuario.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import usuario.Usuario;

public class UsuarioTableModel extends AbstractTableModel {

    private List<Usuario> usuarios = new ArrayList<>();
    private String[] colunas = {"Código", "Nome", "CPF", "E-mail", "Estabelecimento"};

    public UsuarioTableModel(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    @Override
    public int getRowCount() {
        return usuarios.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Usuario usuario = usuarios.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return usuario.getIdUsuario();
            case 1:
                return usuario.getNomeUsuario();
            case 2:
                return usuario.getCpfUsuario();
            case 3:
                return usuario.getEmailUsuario();
            case 4:
                return usuario.getEstabelecimento().getNomeEstabelecimento();
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
            case 4:
                return colunas[4];
        }
        return null;
    }

}
