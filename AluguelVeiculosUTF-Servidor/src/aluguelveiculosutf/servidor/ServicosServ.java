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

/**
 *
 * @author Lucas
 */
public class ServicosServ {
    
    public ServicosServ(){
            try{
            //Cria o registro para receber as referencias, para a porta 1099, local
            Registry referenciaServicoNome = LocateRegistry.createRegistry(1099);

            //A classe é associada a um nome para ser acessado externamente
            //(Registra uma referencia de objeto remoto)
            //referenciaServicoNome.rebind("Conta Bancária", this);

            //Inicia o mapa hash de contas
            //contas = new MapContas();

            System.out.println("Serviços bancárias iniciados..\n");
        }catch(RemoteException e){
            System.out.println(e.getMessage());
            System.exit(0);
        }
    }
    
    
    public ArrayList<Veiculo> listaVeiculo;
    
    public void salvarVeiculo(Veiculo veiculo){
        listaVeiculo.add(veiculo);
    }
    
    public void editarVeiculo(int indice, Veiculo veiculo){
        listaVeiculo.set(indice, veiculo);
    }
    
}
