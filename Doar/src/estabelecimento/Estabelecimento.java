/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estabelecimento;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Danylo
 */

@Entity
public class Estabelecimento {
    
    @Id
    @GeneratedValue
    private int idEstabelecimento;
    
    @Column(length = 20, nullable = false)
    private String nomeEstabelecimento;
    
    @Column(length = 20, nullable = false)
    private String ruaEstabelecimento;
    
    @Column(length = 20, nullable = false)     
    private String numeroEstabelecimento;
    
    @Column(length = 20, nullable = false)
    private String bairroEstabelecimento;
    
    @Column(length = 20, nullable = false)
    private String cidadeEstabelecimento;

    /**
     * @return the idEstabelecimento
     */
    public int getIdEstabelecimento() {
        return idEstabelecimento;
    }

    /**
     * @param idEstabelecimento the idEstabelecimento to set
     */
    public void setIdEstabelecimento(int idEstabelecimento) {
        this.idEstabelecimento = idEstabelecimento;
    }

    /**
     * @return the nomeEstabelecimento
     */
    public String getNomeEstabelecimento() {
        return nomeEstabelecimento;
    }

    /**
     * @param nomeEstabelecimento the nomeEstabelecimento to set
     */
    public void setNomeEstabelecimento(String nomeEstabelecimento) {
        this.nomeEstabelecimento = nomeEstabelecimento;
    }

    /**
     * @return the ruaEstabelecimento
     */
    public String getRuaEstabelecimento() {
        return ruaEstabelecimento;
    }

    /**
     * @param ruaEstabelecimento the ruaEstabelecimento to set
     */
    public void setRuaEstabelecimento(String ruaEstabelecimento) {
        this.ruaEstabelecimento = ruaEstabelecimento;
    }

    /**
     * @return the numeroEstabelecimento
     */
    public String getNumeroEstabelecimento() {
        return numeroEstabelecimento;
    }

    /**
     * @param numeroEstabelecimento the numeroEstabelecimento to set
     */
    public void setNumeroEstabelecimento(String numeroEstabelecimento) {
        this.numeroEstabelecimento = numeroEstabelecimento;
    }

    /**
     * @return the bairroEstabelecimento
     */
    public String getBairroEstabelecimento() {
        return bairroEstabelecimento;
    }

    /**
     * @param bairroEstabelecimento the bairroEstabelecimento to set
     */
    public void setBairroEstabelecimento(String bairroEstabelecimento) {
        this.bairroEstabelecimento = bairroEstabelecimento;
    }

    /**
     * @return the cidadeEstabelecimento
     */
    public String getCidadeEstabelecimento() {
        return cidadeEstabelecimento;
    }

    /**
     * @param cidadeEstabelecimento the cidadeEstabelecimento to set
     */
    public void setCidadeEstabelecimento(String cidadeEstabelecimento) {
        this.cidadeEstabelecimento = cidadeEstabelecimento;
    }
}
