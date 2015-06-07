package aluguelveiculosutf.servidor;

import aluguelveiculosutf.impl.ServImpl;
import static aluguelveiculosutf.impl.ServImpl.listaLocadores;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas
 */
public class ServicosServ {

    private static ServicosServ instancia;
    public static ArrayList<Veiculo> listaVeiculo;


    private ServicosServ(){
        listaVeiculo = new ArrayList<>();
        
//        try {
//            //Cria o registro para receber as referencias, para a porta 1099, local
//            Registry referenciaServicoNome = LocateRegistry.createRegistry(1099);
//
//            //A classe é associada a um nome para ser acessado externamente
//            //(Registra uma referencia de objeto remoto)
//            //referenciaServicoNome.rebind("Conta Bancária", this);
//            //Inicia o mapa hash de contas
//            //contas = new MapContas();
//            System.out.println("Serviços bancárias iniciados..\n");
//        } catch (RemoteException e) {
//            System.out.println(e.getMessage());
//            System.exit(0);
//        }
    }

    public static ArrayList<Veiculo> getListaVeiculo() {
        return listaVeiculo;
    }

    public void setListaVeiculo(ArrayList<Veiculo> listaVeiculo) {
        this.listaVeiculo = listaVeiculo;
    }

    public static ServicosServ getInstancia() {
        if (instancia == null) {
            instancia = new ServicosServ();
        }
        return instancia;
    }

    public void salvarVeiculo(Veiculo veiculo) {
        listaVeiculo.add(veiculo);
        Serializa serializa = new Serializa();
        String msg = "Veículo cadastrado com sucesso!";
        JOptionPane.showMessageDialog(null, msg);
        serializa.serializaVeiculos(listaVeiculo);
        
    }

    public static void editarVeiculo(int indice, boolean reqCliente, Veiculo veiculo) {
        indice = indice - 1;
        listaVeiculo.set(indice, veiculo);
        if(!reqCliente){
            String msg = "Veículo editado com sucesso!";
            JOptionPane.showMessageDialog(null, msg);
        }
        
        Serializa serializa = new Serializa();
        serializa.serializaVeiculos(listaVeiculo);
            
        int i = 0;
        
        for (Interessado inter : ServImpl.listaInteressados) {
            if (inter.getModeloVeic().equals(veiculo.getModelo())){
                if(inter.getValor() >= veiculo.getValorLocacao()){
                    ServImpl.notificarCarro(inter.getModeloVeic(), inter.getRefCli());
                    //ServImpl.listaInteressados.remove(i);
                }
            }
            i++;
        }
    }

    public static Veiculo buscarVeiculo(String modeloVeiculo) {
        Veiculo veiculo = null;
        try {
            veiculo = listaVeiculo.
                    stream().
                    filter(v -> (v.modelo == null ? modeloVeiculo == null
                                    : v.modelo.equals(modeloVeiculo))).
                    findFirst().get();
        } catch (NoSuchElementException e) {
            String msg = "Veículo não cadastrado!";
            JOptionPane.showMessageDialog(null, msg);
        }

        return veiculo;
    }
    
//    public Veiculo buscarVeiculo(int id) {
//        Veiculo veiculo = null;
//        try {
//            veiculo = listaVeiculo.
//                    stream().
//                    filter(v -> (v.hashCode() == 0 ? id == 0
//                                    : v.hashCode() == id)).
//                    findFirst().get();
//        } catch (NoSuchElementException e) {
//            String msg = "Veículo não cadastrado!";
//            JOptionPane.showMessageDialog(null, msg);
//        }
//
//        return veiculo;
//    }

}
