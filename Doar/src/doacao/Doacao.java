/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doacao;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import usuario.Usuario;

/**
 *
 * @author Danylo
 */
@Entity
public class Doacao {
    
    @Id
    @GeneratedValue
    private int idDoacao;
    
    @Column(length = 50, nullable = false)
    private String nomeDoacao;
    
    @Column(length = 100, nullable = false)
    private String descricaoProduto;
    
    @Column(length = 50, nullable = false)
    private String nomeDoador;
         
    @Column
    private Date dataEntrada;
    
    @Column
    private Date dataSaida;
    
    @Column(length = 1, nullable = false)
    private int statusDoacao;
    
    @OneToOne
    private Usuario usuario;

    /**
     * @return the idDoacao
     */
    public int getIdDoacao() {
        return idDoacao;
    }

    /**
     * @param idDoacao the idDoacao to set
     */
    public void setIdDoacao(int idDoacao) {
        this.idDoacao = idDoacao;
    }

    /**
     * @return the nomeDoacao
     */
    public String getNomeDoacao() {
        return nomeDoacao;
    }

    /**
     * @param nomeDoacao the nomeDoacao to set
     */
    public void setNomeDoacao(String nomeDoacao) {
        this.nomeDoacao = nomeDoacao;
    }

    /**
     * @return the descricaoProduto
     */
    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    /**
     * @param descricaoProduto the descricaoProduto to set
     */
    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    /**
     * @return the nomeDoador
     */
    public String getNomeDoador() {
        return nomeDoador;
    }

    /**
     * @param nomeDoador the nomeDoador to set
     */
    public void setNomeDoador(String nomeDoador) {
        this.nomeDoador = nomeDoador;
    }

    /**
     * @return the dataEntrada
     */
    public Date getDataEntrada() {
        return dataEntrada;
    }

    /**
     * @param dataEntrada the dataEntrada to set
     */
    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    /**
     * @return the dataSaida
     */
    public Date getDataSaida() {
        return dataSaida;
    }

    /**
     * @param dataSaida the dataSaida to set
     */
    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }

    /**
     * @return the statusDoacao
     */
    public int getStatusDoacao() {
        return statusDoacao;
    }

    /**
     * @param statusDoacao the statusDoacao to set
     */
    public void setStatusDoacao(int statusDoacao) {
        this.statusDoacao = statusDoacao;
    }

    /**
     * @return the usuario
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
        
}
