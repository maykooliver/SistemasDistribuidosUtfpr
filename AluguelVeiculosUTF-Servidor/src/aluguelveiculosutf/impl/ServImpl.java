package aluguelveiculosutf.impl;

import aluguelveiculosutf.interfaces.InterfaceCli;
import aluguelveiculosutf.interfaces.InterfaceServ;
import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import javarmi.conta_bancaria.contas.MapContas;

/**
 *
 * @author Lucas
 */
public class ServImpl extends UnicastRemoteObject implements InterfaceServ{
    
    public static MapContas contas;
    
    /**
     * Implementação do servidor.
     * Construtor.
     * @throws RemoteException
     * @throws AlreadyBoundException 
     */
    public ServImpl() throws RemoteException, AlreadyBoundException
    {
        try{
            //Cria o registro para receber as referencias, para a porta 1099, local
            Registry referenciaServicoNome = LocateRegistry.createRegistry(1099);

            //A classe é associada a um nome para ser acessado externamente
            //(Registra uma referencia de objeto remoto)
            referenciaServicoNome.rebind("AluguelVeiculos", this);

            //Inicia o mapa hash de contas
            contas = new MapContas();

            System.out.println("Sistema de aluguel de veículos iniciados...\n");
        }catch(RemoteException e){
            System.out.println(e.getMessage());
            System.exit(0);
        }
        
    }

    @Override
    public boolean criarConta(String nome, String senha, String numConta, String numAgencia, int banco, boolean poupanca, InterfaceCli ref) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean validarUsuario(String numConta, String senhaCli, InterfaceCli ref) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void devolverVeiculo(String nomeCli, String senhaCli, InterfaceCli ref) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean alugarVeic(String locRetirada, String locDevolucao, String dataIni, String dataTerm, String condutor, int idade, String numeroParcelas, InterfaceCli ref) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean regInteresseVeic(String modeloVeic, float valor, InterfaceCli ref) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean solicitacaoFormLocacao(String modeloVeic, InterfaceCli ref) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
