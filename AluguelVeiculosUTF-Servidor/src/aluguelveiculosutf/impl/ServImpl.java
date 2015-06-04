package aluguelveiculosutf.impl;

import aluguelveiculosutf.interfaces.InterfaceCli;
import aluguelveiculosutf.interfaces.InterfaceServ;
import aluguelveiculosutf.servidor.Interessado;
import aluguelveiculosutf.servidor.Locador;
import aluguelveiculosutf.servidor.ServicosServ;
import static aluguelveiculosutf.servidor.ServicosServ.listaVeiculo;
import aluguelveiculosutf.servidor.Veiculo;
import aluguelveiculosutf.util.MyNumber;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Date;
import java.util.NoSuchElementException;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas
 */
public class ServImpl extends UnicastRemoteObject implements InterfaceServ{
    
   public static ArrayList<Locador> listaLocadores;
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
            //contas = new ArrayList<>();

            System.out.println("Serviços de locação de veículos iniciado..\n");
            
        }catch(RemoteException e){
            System.out.println(e.getMessage());
            System.exit(0);
        }        
    }

     @Override
    public boolean alugarVeic(String modeloVeiculoLocado, String locRetirada, String locDevolucao, String dataIni, String horaInicio, String dataTerm, String horaFim, String condutor, int idade, String numeroParcelas, InterfaceCli ref) throws RemoteException {
        //Bloquear veículo para locação (que ja deve estar bloqueado pela solicitaçãodo form) e popular os dados 
        // da classe Locador e adicioná=lo ao array.
        
        Locador locador = new Locador(modeloVeiculoLocado, locRetirada, locDevolucao, dataIni, horaInicio, dataTerm, horaFim, condutor, idade, numeroParcelas, ref) ;
        
        listaLocadores.add(locador);

        int indice = 0;
        
        for (Veiculo veiculo: listaVeiculo){
            if(veiculo.getModelo().equals(modeloVeiculoLocado)){
                veiculo.setOcupado(true);
                ServicosServ.editarVeiculo(indice, veiculo);
            }else{
                indice ++;
            }
        }
        
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
        int indice = 0;
        
        for (Veiculo veiculo: listaVeiculo){
            if(veiculo.getModelo().equals(modeloVeic)){
                if(!veiculo.isOcupado()){
                    return true;
                }else{
                    return false;
                }
            }else{
                indice ++;
            }
        }
        
        return false;
    }

    @Override
    public boolean devolverVeiculo(String nomeCli, InterfaceCli ref) throws RemoteException {
        
        try {
            int indice = 0;
            
            String modelo = null;
            
            for (Locador loc : listaLocadores) {
                if (loc.getNomeCondutor().equals(nomeCli)) {
                    modelo = loc.getModeloVeiculoLocado();
                    listaLocadores.remove(indice);
                } else {
                    indice++;
                }
            }
            
            indice = 0;
            
            for (Veiculo veiculo : listaVeiculo) {
                if (veiculo.getModelo().equals(modelo)) {
                    veiculo.setOcupado(false);
                    ServicosServ.editarVeiculo(indice, veiculo);
                } else {
                    indice++;
                }
            }
            
            return true;
            
        } catch (Exception e) {
        }

        return false;
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
