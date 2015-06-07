package aluguelveiculosutf.util;

import aluguelveiculosutf.servidor.Veiculo;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * Classe de terceiros adaptada.
 * @author Desconhecido.
 */
public class Serializa {

    public void serializaVeiculos(ArrayList<Veiculo> listaVeiculo){
        try {
                FileOutputStream arquivoGrav = new FileOutputStream("C:/dadosVeiculos/dadosVeiculos.txt");
                ObjectOutputStream objGravar = new ObjectOutputStream(arquivoGrav);
                objGravar.writeObject(listaVeiculo);
                objGravar.flush();
                objGravar.close();
                arquivoGrav.flush();
                arquivoGrav.close();
        } catch (Exception e) {
                e.printStackTrace();
        }
    }

    public ArrayList<Veiculo> descerializaVeiculos(){
        ArrayList<Veiculo> listaVeiculo = new ArrayList<>();
        try {
            FileInputStream arquivoLeitura = new FileInputStream("C:/dadosVeiculos/dadosVeiculos.txt");
            ObjectInputStream objLeitura = new ObjectInputStream(arquivoLeitura);
            listaVeiculo = (ArrayList<Veiculo>) objLeitura.readObject();
            objLeitura.close();
            arquivoLeitura.close();
            
            return listaVeiculo;
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return null;
    }


}
