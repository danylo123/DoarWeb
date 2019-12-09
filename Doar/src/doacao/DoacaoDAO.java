/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doacao;

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
public class DoacaoDAO {

    private Session sessao;
    private Transaction transacao;

    public void salvar(Doacao doacao) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction(); //Preparar a sessão para inserir no banco
        sessao.save(doacao); //Salvar no banco
        JOptionPane.showMessageDialog(null, "Doação cadastrada com sucesso!");
        transacao.commit(); //Executar a ação no banco
        sessao.close(); //Fechar a conexão com o banco
    }

    public void excluir(Doacao doacao) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction(); //Preparar a sessão para inserir no banco
        sessao.delete(doacao); //Exclui do banco
        transacao.commit(); //Executar a ação no banco
        sessao.close(); //Fechar a conexão com o banco
    }

    public void editar(Doacao doacao) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction(); //Preparar a sessão para inserir no banco
        sessao.update(doacao); //Atualiza do banco
        transacao.commit(); //Executar a ação no banco
        sessao.close(); //Fechar a conexão com o banco
    }

    public Doacao pesquisar(int idDoacao) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction(); //Preparar a sessão para inserir no banco
        Doacao doacao = (Doacao) sessao.createCriteria(Doacao.class).add(Restrictions.eq("idDoacao", idDoacao)).uniqueResult();
        sessao.close();
        return doacao;
    }

    public List<Doacao> pesquisarRelatorio(String statusDoacao) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction(); //Preparar a sessão para inserir no banco
        List<Doacao> doacao = sessao.createCriteria(Doacao.class).add(Restrictions.eq("statusDoacao", statusDoacao)).list();
        sessao.close();
        return doacao;
    }

    public List<Doacao> listarDoacaos() {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction(); //Preparar a sessão para inserir no banco
        List<Doacao> doacao = sessao.createCriteria(Doacao.class).list();
        sessao.close();
        return doacao;
    }

    public List<Doacao> pesquisarLista(String campo, String valor) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction(); //Preparar a sessão para inserir no banco
        List<Doacao> doacao = sessao.createCriteria(Doacao.class).add(Restrictions.ilike(campo, "%" + valor + "%")).list();
        sessao.close();
        return doacao;
    }
}
