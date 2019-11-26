/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estabelecimento;

import estabelecimento.*;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import util.HibernateUtil;

/**
 *
 * @author Danylo
 */
public class EstabelecimentoDAO {

    private Session sessao;
    private Transaction transacao;

    public void salvar(Estabelecimento estabelecimento) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction(); //Preparar a sessão para inserir no banco
        if (estabelecimento.getIdEstabelecimento() == 0) {
            sessao.save(estabelecimento); //Salvar no banco
            JOptionPane.showMessageDialog(null, "Estabelecimento cadastrado com sucesso!");
        } else {
            //editar(estabelecimento);
            //JOptionPane.showMessageDialog(null, "Estabelecimento editado com sucesso!");
        }
        transacao.commit(); //Executar a ação no banco
        sessao.close(); //Fechar a conexão com o banco
    }

    public Estabelecimento pesquisar(int idEstabelecimento) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction(); //Preparar a sessão para inserir no banco
        Estabelecimento estabelecimento = (Estabelecimento) sessao.createCriteria(Estabelecimento.class).add(Restrictions.eq("idEstabelecimento", idEstabelecimento)).uniqueResult();
        sessao.close();
        return estabelecimento;
    }

    public List<Estabelecimento> listarEstabelecimentos() {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction(); //Preparar a sessão para inserir no banco
        List<Estabelecimento> estabelecimentos = sessao.createCriteria(Estabelecimento.class).list();
        sessao.close();
        return estabelecimentos;
    }

}
