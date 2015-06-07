package aluguelveiculosutf.impl;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import aluguelveiculosutf.interfaces.InterfaceCli;
import aluguelveiculosutf.interfaces.InterfaceServ;
import aluguelveiculosutf.servidor.Serializa;
import aluguelveiculosutf.servidor.Veiculo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * Implementação do cliente.
 * Classe responsável por implementar a InterfaceCli e demais funções para o Cliente.
 * @author lucasmelocvl
 */
public class CliImpl extends UnicastRemoteObject implements InterfaceCli
{
    public String nomeCli;
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
        referenciaServicoNomes = LocateRegistry.getRegistry("localhost", 1099);
        try
        {
            refServ = (InterfaceServ) referenciaServicoNomes.lookup("Locacao de Veiculos");
        }catch(RemoteException e){
            System.out.println(e.getMessage());
            String msg = "Não foi possível conectar ao servidor.";
            JOptionPane.showMessageDialog(null, msg);
            System.exit(0);
        }
    }
    
    /**
     * Notificação de carro disponível.
     * Se o cliente estiver habilitado para receber notificações automáticas,
     * quando o carro de interesse estiver disponível, ele receberá uma notificação.
     * @param msg Mensagem do servidor.
     * @throws java.rmi.RemoteException
     */
    @Override
    public void notifCarroDisp(String msg) throws RemoteException
    {
        JOptionPane.showMessageDialog(null, msg);
    }
    
    /**
     * Devolver Veículo.
     * Realiza a solicitação para a devolução de um veículo.
     * Cliente - Servidor. 
     * @return boolean
     * @throws java.rmi.RemoteException 
     */
    public boolean devolverVeiculo() throws RemoteException{
        boolean ret = refServ.devolverVeiculo(nomeCli, this);
        return ret;
    }

    /**
     * Alugar Veículo.
     * Efetiva a locação de um veículo.
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
    public boolean alugarVeic(String modeloVeiculoLocado, String locRetirada, String locDevolucao, String dataIni, String horaInicio, String dataTerm, String horaFim, String condutor, int idade, String numeroParcelas){
        boolean ret = false;
        try {
            ret = refServ.alugarVeic(modeloVeiculoLocado, locRetirada, locDevolucao, dataIni, horaInicio, dataTerm, horaFim, condutor, idade, numeroParcelas, this);
        } catch (RemoteException ex) {
            Logger.getLogger(CliImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ret;
    }

    /**
     * Registrar Interesse de Veículo.
     * Registra o interesse em um veículo para quando ele estiver em um valor estipulado.
     * @param modeloVeic
     * @param valor
     * @return 
     */
    public boolean regInteresseVeic(String modeloVeic, float valor){
        boolean ret = false;
        String modelo[] = modeloVeic.split("-");
        System.out.println("Registrar interesse em modelo: " + modelo[0]);
        try {
            ret = refServ.regInteresseVeic(modelo[0], valor, this);
        } catch (RemoteException ex) {
            Logger.getLogger(CliImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ret;
    }

    /**
     * Solicitar Formulário de Locação.
     * Solicita o formulário de locação para determinado veículo, bloqueando o acesso
     * deste veículo pelos demais clientes.
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

    public void novoCliente() {
        try {
            refServ.novoClienteConectado(nomeCli);
        } catch (RemoteException ex) {
            Logger.getLogger(CliImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
//    public ArrayList<Veiculo> consultarVeiculo(){
//        ArrayList<Veiculo> listaVeiculo = new ArrayList<>();
//        try {
//            listaVeiculo = refServ.consultarVeiculos();
//        } catch (RemoteException ex) {
//            System.out.println("!adrem");
//            //Logger.getLogger(CliImpl.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return listaVeiculo;
//    }
    
     public ArrayList<Veiculo> consultarVeiculo() throws IOException, ClassNotFoundException{
        refServ.consultarVeiculos();
        ArrayList<Veiculo> listaVeiculo = new ArrayList<>();
        Serializa serializa = new Serializa();
        listaVeiculo = serializa.descerializaVeiculos();
        return listaVeiculo;
    }
    
}