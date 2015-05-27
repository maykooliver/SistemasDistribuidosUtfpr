/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aluguelveiculosutf.interfaces;

import aluguelveiculosutf.impl.CliImpl;
import java.rmi.RemoteException;

/**
 *
 * @author Lucas
 */
public interface InterfaceServ {
    
    /**
     * Criar Conta.
     * Cria a conta para um novo cliente.
     * @param nome Nome do cliente.
     * @param senha Senha do cliente.
     * @param ref Referencia do cliente.
     * @return True se a contar for criada com sucesso.
     * @throws RemoteException 
     */
    public boolean criarConta(String nome, String senha, String numConta, String numAgencia, int banco, boolean poupanca, InterfaceCli ref) throws RemoteException;
    
    /**
     * Validar usuário.
     * Realiza a validação de um usuário no momento de devolução do carro.
     * @param numConta Numero da conta do cliente.
     * @param senhaCli Senha do cliente.
     * @param ref Referencia do cliente.
     * @return True se os dados estiverem corretos.
     * @throws java.rmi.RemoteException
     */
    public boolean validarUsuario(String numConta, String senhaCli, InterfaceCli ref) throws RemoteException;
    
    /**
     * Devolver Veículo.
     * Realiza a solicitação para a devolução de um veículo.
     * @param nomeCli
     * @param senhaCli
     * @param ref
     * @throws java.rmi.RemoteException
     */
    public void devolverVeiculo(String nomeCli, String senhaCli, InterfaceCli ref) throws RemoteException;

    /**
     * Alugar Veículo.
     * @param locRetirada
     * @param locDevolucao
     * @param dataIni
     * @param dataTerm
     * @param condutor
     * @param idade
     * @param numeroParcelas
     * @param aThis
     * @return 
     */
    public boolean alugarVeic(String locRetirada, String locDevolucao, String dataIni, String dataTerm, String condutor, int idade, String numeroParcelas, CliImpl aThis);

    /**
     * Registrar Interesse de Veículo.
     * @param modeloVeic
     * @param valor
     * @param aThis
     * @return 
     */
    public boolean regInteresseVeic(String modeloVeic, float valor, CliImpl aThis);

    /**
     * Solicitar Formulário de Locação.
     * @param modeloVeic
     * @param aThis
     * @return 
     */
    public boolean solicitacaoFormLocacao(String modeloVeic, CliImpl aThis);
    
}
