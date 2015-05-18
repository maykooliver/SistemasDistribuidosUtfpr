/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aluguelveiculosutf.interfaces;

import java.rmi.RemoteException;

/**
 *
 * @author Lucas
 */
public interface InterfaceServ {
    
    public void consultarVeic() throws RemoteException;
    
    public void alugarVeic() throws RemoteException;
    
    public void regInteresse() throws RemoteException;
    
}
