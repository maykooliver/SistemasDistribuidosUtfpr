/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aluguelveiculosutf.servidor;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas
 */
public class ServicosServ {

    private static ServicosServ instancia;
    public static ArrayList<Veiculo> listaVeiculo = new ArrayList<>();


    private ServicosServ(){
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
        String msg = "Veículo cadastrado com sucesso!";
        JOptionPane.showMessageDialog(null, msg);
    }

    public void editarVeiculo(int indice, Veiculo veiculo) {
        listaVeiculo.set(indice, veiculo);
        String msg = "Veículo editado com sucesso!";
        JOptionPane.showMessageDialog(null, msg);
    }

    public Veiculo buscarVeiculo(String modeloVeiculo) {
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
