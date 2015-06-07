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
    boolean locacaoFinalizada;
    String modeloVeiculoLocado;
    String localRetirada;
    String localDevolucao;
    String dataInicio;
    String horaInicio;
    String dataFim;
    String horaFim;
    String nomeCondutor;
    int idadeCondutor;
    String parcelaPagamentoCartao;
    boolean receberNotificacao;

    private InterfaceCli refCli;

    public Locador(String modeloVeiculoLocado, String localRetirada, String localDevolucao, String dataInicio, String horaInicio, String dataFim, String horaFim, String nomeCondutor, int idadeCondutor, String parcelaPagamentoCartao, InterfaceCli refCli) {
        this.locacaoFinalizada = false;
        this.modeloVeiculoLocado = modeloVeiculoLocado;
        this.localRetirada = localRetirada;
        this.localDevolucao = localDevolucao;
        this.dataInicio = dataInicio;
        this.horaInicio = horaInicio;
        this.dataFim = dataFim;
        this.horaFim = horaFim;
        this.nomeCondutor = nomeCondutor;
        this.idadeCondutor = idadeCondutor;
        this.parcelaPagamentoCartao = parcelaPagamentoCartao;
        this.refCli = refCli;
    }
    
    

    public Locador() {
        
    }
    
    public String getModeloVeiculoLocado() {
        return modeloVeiculoLocado;
    }

    public void setModeloVeiculoLocado(String modeloVeiculoLocado) {
        this.modeloVeiculoLocado = modeloVeiculoLocado;
    }

    @Override
    public String toString() {
        return "Locador{" + "modeloVeiculoLocado=" + modeloVeiculoLocado + ", localRetirada=" + localRetirada + ", localDevolucao=" + localDevolucao + ", dataInicio=" + dataInicio + ", horaInicio=" + horaInicio + ", dataFim=" + dataFim + ", horaFim=" + horaFim + ", nomeCondutor=" + nomeCondutor + ", idadeCondutor=" + idadeCondutor + ", parcelaPagamentoCartao=" + parcelaPagamentoCartao + ", receberNotificacao=" + receberNotificacao + '}';
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

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
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

    public String getParcelaPagamentoCartao() {
        return parcelaPagamentoCartao;
    }

    public void setParcelaPagamentoCartao(String parcelaPagamentoCartao) {
        this.parcelaPagamentoCartao = parcelaPagamentoCartao;
    }

    public boolean getReceberNotificacao() {
        return receberNotificacao;
    }

    public void setReceberNotificacao(boolean receberNotificacao) {
        this.receberNotificacao = receberNotificacao;
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
    
    public void setLocacaoFinalizada(boolean locacaoFinalizada) {
        this.locacaoFinalizada = locacaoFinalizada;
    }

    public boolean isLocacaoFinalizada() {
        return locacaoFinalizada;
    }

    public boolean isReceberNotificacao() {
        return receberNotificacao;
    }
    
}
