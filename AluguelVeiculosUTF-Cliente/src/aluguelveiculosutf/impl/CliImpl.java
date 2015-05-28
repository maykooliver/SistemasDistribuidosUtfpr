package aluguelveiculosutf.impl;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import aluguelveiculosutf.interfaces.InterfaceCli;
import aluguelveiculosutf.interfaces.InterfaceServ;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * Implementação do cliente.
 * Classe responsável por implementar a InterfaceCli.
 * @author lucasmelocvl
 */
public class CliImpl extends UnicastRemoteObject implements InterfaceCli
{
    public String nomeCli;
    public String senhaCli;
    public String numConta;
    public String numAgencia;
    public boolean isPoupanca;
    public int banco;
    public boolean interesseCarro;
    public int numCarroInter;
    public boolean carroAlugado;
    public int numCarroAlug;
    
    public InterfaceServ refServ;
    
    /**
     * Contrutor de CliImpl.
     * Inicia o serviço de nomes e encontra o servidor.
     * @throws RemoteException
     * @throws NotBoundException 
     */
    public CliImpl() throws RemoteException, NotBoundException{
        interesseCarro = false;
        numCarroInter = 0;
        carroAlugado = false;
        numCarroAlug = 0;
        Registry referenciaServicoNomes;
        referenciaServicoNomes = LocateRegistry.getRegistry(1099);
        try
        {
            System.out.println(referenciaServicoNomes.lookup("AluguelVeiculos"));
            refServ = (InterfaceServ) referenciaServicoNomes.lookup("AluguelVeiculos");
        }catch(RemoteException e){
            System.out.println(e.getMessage());
            String msg = "Servidor fora do ar!";
            JOptionPane.showMessageDialog(null, msg);
            System.exit(0);
        }
    }
    
    /**
     * Criar conta.
     * Cria uma nova conta para um cliente, enviando as informações
     * para o servidor.
     * Cliente - Servidor - Cliente.
     * @return boolean.
     * @throws java.rmi.RemoteException
     */
    public boolean criarConta() throws RemoteException
    {
       boolean ret = refServ.criarConta(nomeCli, senhaCli, numConta, numAgencia, banco, isPoupanca, this);
       return ret;
    }

    
    /**
     * Valida as informações de um usuário.
     * Cliente - Servidor - Cliente.
     * @return boolean.
     * @throws RemoteException 
     */
    public boolean validarUsuario() throws RemoteException{
        boolean ret = refServ.validarUsuario(nomeCli, senhaCli, this);
        return ret;
    }
    
    /**
     * Notificação de carro disponível.
     * Se o cliente estiver habilitado para receber notificações automáticas,
     * quando o carro de interesse estiver disponível, ele receberá uma notificação.
     * Servidor - Cliente.
     * @param msg Mensagem do servidor.
     * @throws java.rmi.RemoteException
     */
    public void notifCarroDisp(String msg) throws RemoteException
    {
        JOptionPane.showMessageDialog(null, msg);
    }
    

    /**
     * Conta inexistente.
     * Retorna uma mensagem informando que a conta não existe.
     * Servidor - Cliente.
     * @throws RemoteException 
     */
    public void contaInexistente() throws RemoteException
    {
        try{
            String msg = "Número da conta inexistente, tente novamente ou consulte o seu gerente.";
            JOptionPane.showMessageDialog(null, msg);
        }catch(UnsupportedOperationException e){
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }    
    }

    /**
     * Senha incorreta.
     * Retorna uma mensangem informando que a senha é incorreta.
     * Servidor - Cliente.
     * @throws RemoteException 
     */
    public void senhaIncorreta() throws RemoteException
    {
        try{
            String msg = "Senha incorreta, tente novamente.";
            JOptionPane.showMessageDialog(null, msg);
        }catch(UnsupportedOperationException e){
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }    
    }
    
    /**
     * Sucesso de Devolução de Veículo..
     * Retorna uma mensangem informando que a senha é incorreta.
     * Servidor - Cliente.
     * @throws RemoteException 
     */
    public void sucessoDevolucaoVeic() throws RemoteException
    {
        try{
            String msg = "Veículo devolvido com sucesso!";
            JOptionPane.showMessageDialog(null, msg);
        }catch(UnsupportedOperationException e){
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }    
    }
    
    /**
     * Devolver Veículo.
     * Realiza a solicitação para a devolução de um veículo.
     * Cliente - Servidor. 
     * @throws java.rmi.RemoteException 
     */
    public void devolverVeiculo() throws RemoteException{
        refServ.devolverVeiculo(nomeCli, senhaCli, this);
    }

    /**
     * Alugar Veículo.
     * Cliente - Servidor - Cliente.
     * @param locRetirada
     * @param locDevolucao
     * @param dataIni
     * @param dataTerm
     * @param condutor
     * @param idade
     * @param numeroParcelas
     * @return 
     */
    public boolean alugarVeic(String locRetirada, String locDevolucao, String dataIni, String dataTerm, String condutor, int idade, String numeroParcelas){
        boolean ret = false;
        try {
            ret = refServ.alugarVeic(locRetirada, locDevolucao, dataIni, dataTerm, condutor, idade, numeroParcelas, this);
        } catch (RemoteException ex) {
            Logger.getLogger(CliImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ret;
    }

    /**
     * Registrar Interesse de Veículo.
     * Cliente - Servidor - Cliente.
     * @param modeloVeic
     * @param valor
     * @return 
     */
    public boolean regInteresseVeic(String modeloVeic, float valor){
        boolean ret = false;
        try {
            ret = refServ.regInteresseVeic(modeloVeic, valor, this);
        } catch (RemoteException ex) {
            Logger.getLogger(CliImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ret;
    }

    /**
     * Solicitar Formulário de Locação.
     * Cliente - Servidor - Cliente.
     * @param modeloVeic
     * @return 
     */
    public boolean solicitacaoFormLocacao(String modeloVeic){
        boolean ret = false;
        try {
            ret = refServ.solicitacaoFormLocacao(modeloVeic, this);
        } catch (RemoteException ex) {
            Logger.getLogger(CliImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ret;
    }
    
}