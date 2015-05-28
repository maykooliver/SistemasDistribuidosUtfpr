package aluguelveiculosutf.servidor;

import aluguelveiculosutf.impl.ServImpl;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;

/**
 *
 * @author Lucas
 */
public class AluguelVeiculosUTFServidor{

    /**
     * Main.
     * Inicia o servidor.
     * @param args the command line arguments
     * @throws java.rmi.RemoteException
     * @throws java.rmi.AlreadyBoundException
     */
    public static void main(String[] args) throws RemoteException, AlreadyBoundException 
    {
        ServImpl servidor = new ServImpl();
    }
    
}
