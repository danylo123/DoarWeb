/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuario;

import estabelecimento.Estabelecimento;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

/**
 *
 * @author Danylo
 */
@Entity
public class Usuario {

    @Id
    @GeneratedValue
    private int idUsuario;

    @Column(length = 50, nullable = false)
    private String nomeUsuario;

    @Column(length = 11, nullable = false)
    private String cpfUsuario;

    @Column(length = 50, nullable = false)
    private String emailUsuario;

    @Column(length = 20, nullable = false)
    private String senhaUsuario;

    @Transient
    private static Usuario usuario;

    @OneToOne
    private Estabelecimento estabelecimento;

    public static Usuario getInstance() {
        if (usuario == null) {
            usuario = new Usuario();
        }

        return usuario;
    }

    public static void setUsuario(Usuario usuario) {
        Usuario.usuario = usuario;
    }

    /**
     * @return the idUsuario
     */
    public int getIdUsuario() {
        return idUsuario;
    }

    /**
     * @param idUsuario the idUsuario to set
     */
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    /**
     * @return the nomeUsuario
     */
    public String getNomeUsuario() {
        return nomeUsuario;
    }

    /**
     * @param nomeUsuario the nomeUsuario to set
     */
    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    /**
     * @return the cpfUsuario
     */
    public String getCpfUsuario() {
        return cpfUsuario;
    }

    /**
     * @param cpfUsuario the cpfUsuario to set
     */
    public void setCpfUsuario(String cpfUsuario) {
        this.cpfUsuario = cpfUsuario;
    }

    /**
     * @return the emailUsuario
     */
    public String getEmailUsuario() {
        return emailUsuario;
    }

    /**
     * @param emailUsuario the emailUsuario to set
     */
    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    /**
     * @return the senhaUsuario
     */
    public String getSenhaUsuario() {
        return senhaUsuario;
    }

    /**
     * @param senhaUsuario the senhaUsuario to set
     */
    public void setSenhaUsuario(String senhaUsuario) {
        this.senhaUsuario = senhaUsuario;
    }

    /**
     * @return the estabelecimento
     */
    public Estabelecimento getEstabelecimento() {
        return estabelecimento;
    }

    /**
     * @param estabelecimento the estabelecimento to set
     */
    public void setEstabelecimento(Estabelecimento estabelecimento) {
        this.estabelecimento = estabelecimento;
    }

}
