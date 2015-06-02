package aluguelveiculosutf.impl;

import aluguelveiculosutf.interfaces.InterfaceCli;
import aluguelveiculosutf.interfaces.InterfaceServ;
import aluguelveiculosutf.servidor.Interessado;
import aluguelveiculosutf.servidor.Locador;
import aluguelveiculosutf.servidor.ServicosServ;
import aluguelveiculosutf.servidor.Veiculo;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

/**
 *
 * @author Lucas
 */
public class ServImpl extends UnicastRemoteObject implements InterfaceServ{
    
    public static ArrayList<Locador> contas;
    public ArrayList<Locador> listaLocadores;
    public ArrayList<Interessado> listaInteressados;
    
    /**
     * Implementação do servidor.
     * Construtor.
     * @throws RemoteException
     * @throws AlreadyBoundException 
     */
    public ServImpl() throws RemoteException, AlreadyBoundException
    {
        listaLocadores = new ArrayList<>();
        listaInteressados = new ArrayList<>();
       try{
            //Cria o registro para receber as referencias, para a porta 1099, local
            Registry referenciaServicoNome = LocateRegistry.createRegistry(1099);

            //A classe é associada a um nome para ser acessado externamente
            //(Registra uma referencia de objeto remoto)
            referenciaServicoNome.rebind("Locacao de Veiculos", this);

            //Inicia o array de clientes.
            contas = new ArrayList<>();

            System.out.println("Serviços de locação de veículos iniciado..\n");
            
        }catch(RemoteException e){
            System.out.println(e.getMessage());
            System.exit(0);
        }        
    }

    @Override
    public boolean alugarVeic(String locRetirada, String locDevolucao, String dataIni, String dataTerm, String condutor, int idade, String numeroParcelas, InterfaceCli ref) throws RemoteException {
        //Bloquear veículo para locação (que ja deve estar bloqueado pela solicitaçãodo form) e popular os dados 
        // da classe Locador e adicioná=lo ao array.
        return true;
    }

    @Override
    public boolean regInteresseVeic(String modeloVeic, float valor, InterfaceCli ref) throws RemoteException {
        Interessado inter = new Interessado(modeloVeic, valor, ref);
        listaInteressados.add(inter);
        return true;
    }

    @Override
    public boolean solicitacaoFormLocacao(String modeloVeic, InterfaceCli ref) throws RemoteException {
        //Procurar aqui o veiculo no array e bloqueá-lo
        return true;
    }

    @Override
    public boolean devolverVeiculo(String nomeCli, InterfaceCli ref) throws RemoteException {
        //desbloquear veículo para outras locações
        return true;
    }

    @Override
    public void novoClienteConectado(String nomeCli) throws RemoteException{
        System.out.println("Novo cliente conectado: " + nomeCli);
    }

    @Override
    public ArrayList<Veiculo> consultarVeiculos() throws RemoteException {
        System.out.println("Yes");
        ArrayList<Veiculo> listaVeiculos;
        listaVeiculos = ServicosServ.getListaVeiculo();
        System.out.println(listaVeiculos.get(0).getModelo());
        return listaVeiculos;
    }

}
