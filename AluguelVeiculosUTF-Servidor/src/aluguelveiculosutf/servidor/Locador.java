/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aluguelveiculosutf.servidor;

import aluguelveiculosutf.interfaces.InterfaceCli;
import java.util.Date;

/**
 *
 * @author Lucas
 */
public class Locador {
    String localRetirada;
    String localDevolucao;
    Date dataInicio;
    String horaInicio;
    Date dataFim;
    String horaFim;
    String nomeCondutor;
    int idadeCondutor;
    int parcelaPagamentoCartao;
    boolean receberNotificacao;
    
    private InterfaceCli refCli;

    public Locador() {
    }

    public String getLocalRetirada() {
        return localRetirada;
    }

    public void setLocalRetirada(String localRetirada) {
        this.localRetirada = localRetirada;
    }

    public String getLocalDevolucao() {
        return localDevolucao;
    }

    public void setLocalDevolucao(String localDevolucao) {
        this.localDevolucao = localDevolucao;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public String getHoraFim() {
        return horaFim;
    }

    public void setHoraFim(String horaFim) {
        this.horaFim = horaFim;
    }

    public String getNomeCondutor() {
        return nomeCondutor;
    }

    public void setNomeCondutor(String nomeCondutor) {
        this.nomeCondutor = nomeCondutor;
    }

    public int getIdadeCondutor() {
        return idadeCondutor;
    }

    public void setIdadeCondutor(int idadeCondutor) {
        this.idadeCondutor = idadeCondutor;
    }

    public int getParcelaPagamentoCartao() {
        return parcelaPagamentoCartao;
    }

    public void setParcelaPagamentoCartao(int parcelaPagamentoCartao) {
        this.parcelaPagamentoCartao = parcelaPagamentoCartao;
    }

    public boolean getReceberNotificacao() {
        return receberNotificacao;
    }

    public void setReceberNotificacao(boolean receberNotificacao) {
        this.receberNotificacao = receberNotificacao;
    }

    @Override
    public String toString() {
        return "Cliente{" + "localRetirada=" + localRetirada + ", localDevolucao=" + localDevolucao + ", dataInicio=" + dataInicio + ", horaInicio=" + horaInicio + ", dataFim=" + dataFim + ", horaFim=" + horaFim + ", nomeCondutor=" + nomeCondutor + ", idadeCondutor=" + idadeCondutor + ", parcelaPagamentoCartao=" + parcelaPagamentoCartao + ", receberNotificacao=" + receberNotificacao + '}';
    }

    /**
     * @return the refCli
     */
    public InterfaceCli getRefCli() {
        return refCli;
    }

    /**
     * @param refCli the refCli to set
     */
    public void setRefCli(InterfaceCli refCli) {
        this.refCli = refCli;
    }
    
}
