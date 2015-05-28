/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aluguelveiculosutf.impl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import aluguelveiculosutf.interfaces.InterfaceCli;

/**
 *
 * @author lucasmelocvl
 */
public class ContaImpl extends UnicastRemoteObject{

    private String nomeCli;
    private String senhaCli;
    private String numConta;
    private String numAgencia;
    private boolean isPoupanca;
    private int banco;
    private boolean interesseCarro;
    private int numCarroInter;
    private boolean carroAlugado;
    private int numCarroAlug;
    private InterfaceCli refCli;        //Referência do cliente.
    private boolean bloqueado;          //Flag de bloqueio.
    
    public ContaImpl() throws RemoteException{

    }

    /**
     * Conta Impl.
     * Construtor, cria nova conta do cliente ao ser instaciada.
     * Instancia os dados da nova conta do cliente e insere na hashMap 
     * de contas, a nova conta.
     * @param nome Nome do cliente.
     * @param senha Senha do cliente.
     * @param NConta
     * @param NAgencia
     * @param NBanco
     * @param poupanca true se for poupança.
     * @param receberNotificacao true se o cliente quiser receber notificações.
     * @param ref Interface do cliente.
     * @return True se a conta for criada com sucesso.
     * @throws RemoteException 
     */
    public boolean criarConta(String nome, String senha, String NConta, String NAgencia, int NBanco, boolean poupanca, 
            boolean receberNotificacao, InterfaceCli ref) throws RemoteException
    {
        this.setNomeCli(nome);             
        this.setSenhaCli(senha);         
        boolean contaNaoExiste = this.verifUsuario(NConta);
        if(!contaNaoExiste){        //Verifica se a conta informada já existe
            return false;
        }
        setNumConta(NConta);     
        setIsPoupanca(poupanca);
        setNumAgencia(NAgencia);
        setBanco(NBanco);
        setInteresseCarro(receberNotificacao);
        setRefCli(ref);
        setNumCarroAlug(0);
        setNumCarroInter(0);
        setCarroAlugado(false);
        setInteresseCarro(false);
        
        ServImpl.contas.inserirConta(getNumConta(), this);
        
        System.out.println("Novo cliente cadastrado: " + getNomeCli());
        return true;
    }
    
    /**
     * Verificar usuário.
     * Verifica se já existe um usuário com o mesmo nome.
     * @param nomeUser Conta informado. 
     * Se já existir, retorna falso.
     * @return True se a conta for verificada com sucesso e não existir.
     */
    public boolean verifUsuario(String nomeUser)
    {
        String nome = nomeUser;
        boolean userExiste;
        userExiste = ServImpl.contas.contaExiste(nome);
        if(userExiste)
            return false;
        return true;
    }

    /**
     * @return the nomeCli
     */
    public String getNomeCli() {
        return nomeCli;
    }

    /**
     * @param nomeCli the nomeCli to set
     */
    public void setNomeCli(String nomeCli) {
        this.nomeCli = nomeCli;
    }

    /**
     * @return the senhaCli
     */
    public String getSenhaCli() {
        return senhaCli;
    }

    /**
     * @param senhaCli the senhaCli to set
     */
    public void setSenhaCli(String senhaCli) {
        this.senhaCli = senhaCli;
    }

    /**
     * @return the numConta
     */
    public String getNumConta() {
        return numConta;
    }

    /**
     * @param numConta the numConta to set
     */
    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    /**
     * @return the numAgencia
     */
    public String getNumAgencia() {
        return numAgencia;
    }

    /**
     * @param numAgencia the numAgencia to set
     */
    public void setNumAgencia(String numAgencia) {
        this.numAgencia = numAgencia;
    }

    /**
     * @return the isPoupanca
     */
    public boolean isIsPoupanca() {
        return isPoupanca;
    }

    /**
     * @param isPoupanca the isPoupanca to set
     */
    public void setIsPoupanca(boolean isPoupanca) {
        this.isPoupanca = isPoupanca;
    }

    /**
     * @return the banco
     */
    public int getBanco() {
        return banco;
    }

    /**
     * @param banco the banco to set
     */
    public void setBanco(int banco) {
        this.banco = banco;
    }

    /**
     * @return the interesseCarro
     */
    public boolean isInteresseCarro() {
        return interesseCarro;
    }

    /**
     * @param interesseCarro the interesseCarro to set
     */
    public void setInteresseCarro(boolean interesseCarro) {
        this.interesseCarro = interesseCarro;
    }

    /**
     * @return the numCarroInter
     */
    public int getNumCarroInter() {
        return numCarroInter;
    }

    /**
     * @param numCarroInter the numCarroInter to set
     */
    public void setNumCarroInter(int numCarroInter) {
        this.numCarroInter = numCarroInter;
    }

    /**
     * @return the carroAlugado
     */
    public boolean isCarroAlugado() {
        return carroAlugado;
    }

    /**
     * @param carroAlugado the carroAlugado to set
     */
    public void setCarroAlugado(boolean carroAlugado) {
        this.carroAlugado = carroAlugado;
    }

    /**
     * @return the numCarroAlug
     */
    public int getNumCarroAlug() {
        return numCarroAlug;
    }

    /**
     * @param numCarroAlug the numCarroAlug to set
     */
    public void setNumCarroAlug(int numCarroAlug) {
        this.numCarroAlug = numCarroAlug;
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

    /**
     * @return the bloqueado
     */
    public boolean isBloqueado() {
        return bloqueado;
    }

    /**
     * @param bloqueado the bloqueado to set
     */
    public void setBloqueado(boolean bloqueado) {
        this.bloqueado = bloqueado;
    }
    
}
