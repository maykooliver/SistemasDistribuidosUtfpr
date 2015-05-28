package aluguelveiculosutf.interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Lucas
 */
public interface InterfaceServ extends Remote{
    
    /**
     * Devolver Veículo.
     * Realiza a solicitação para a devolução de um veículo.
     * @param nomeCli
     * @param ref
     * @throws java.rmi.RemoteException
     */
    public boolean devolverVeiculo(String nomeCli, InterfaceCli ref) throws RemoteException;

    /**
     * Alugar Veículo.
     * @param locRetirada
     * @param locDevolucao
     * @param dataIni
     * @param dataTerm
     * @param condutor
     * @param idade
     * @param numeroParcelas
     * @param ref
     * @return 
     */
    public boolean alugarVeic(String locRetirada, String locDevolucao, String dataIni, String dataTerm, String condutor, int idade, String numeroParcelas, InterfaceCli ref) throws RemoteException;

    /**
     * Registrar Interesse de Veículo.
     * @param modeloVeic
     * @param valor
     * @param ref
     * @return 
     */
    public boolean regInteresseVeic(String modeloVeic, float valor, InterfaceCli ref) throws RemoteException;

    /**
     * Solicitar Formulário de Locação.
     * @param modeloVeic
     * @param ref
     * @return 
     */
    public boolean solicitacaoFormLocacao(String modeloVeic, InterfaceCli ref) throws RemoteException;

    /**
     * Novo Cliente Conectado.
     * Informa que um novo cliente se conectou ao servidor.
     * @param nomeCli 
     */
    public void novoClienteConectado(String nomeCli) throws RemoteException;
    
}
