/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aluguelveiculosutf.servidor;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Vinicius
 */
public class Serializa {

    public void serializaVeiculos(ArrayList<Veiculo> listaVeiculo){
        try {
                FileOutputStream arquivoGrav = new FileOutputStream("C:/dadosVeiculos/dadosVeiculos.txt");
                ObjectOutputStream objGravar = new ObjectOutputStream(arquivoGrav);
                //Professor profserializa = new Professor();
                objGravar.writeObject(listaVeiculo);
                objGravar.flush();
                objGravar.close();
                arquivoGrav.flush();
                arquivoGrav.close();
                //System.out.println("Objeto gravado com sucesso!");
        } catch (Exception e) {
                e.printStackTrace();
        }
    }

    public void descerializaVeiculos(){
        try {
            FileInputStream arquivoLeitura = new FileInputStream("C:/dadosVeiculos/dadosVeiculos.txt");
            ObjectInputStream objLeitura = new ObjectInputStream(arquivoLeitura);
            //Professor  = (Clientes) objLeitura.readObject();
            //System.out.println(arquivoLeitura);
            objLeitura.close();
            arquivoLeitura.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
