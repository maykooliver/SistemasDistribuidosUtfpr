/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aluguelveiculosutf.impl;

import aluguelveiculosutf.interfaces.InterfaceCli;
import aluguelveiculosutf.interfaces.InterfaceServ;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas
 */
public class CliImpl extends UnicastRemoteObject implements InterfaceCli{

    public String nome;
    public boolean interesseCarro;
    public int numCarro;
    
    InterfaceServ refServ;
    
    public CliImpl() throws RemoteException, NotBoundException{
        /*Registry referenciaServicoNomes;
        referenciaServicoNomes = LocateRegistry.getRegistry("localhost", 1099);
        try
        {
            refServ = (InterfaceServ) referenciaServicoNomes.lookup("Conta Bancária");
        }catch(RemoteException e){
            System.out.println(e.getMessage());
            String msg = "Servidor bancário fora do ar!";
            JOptionPane.showMessageDialog(null, msg);
            System.exit(0);
        }*/
    }
    
    /**
     *
     * @throws RemoteException
     */
    @Override
    public void receberNotif() throws RemoteException{
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
