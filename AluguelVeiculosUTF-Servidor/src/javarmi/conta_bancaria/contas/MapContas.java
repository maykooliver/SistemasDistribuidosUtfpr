/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javarmi.conta_bancaria.contas;

import java.util.HashMap;
import java.util.Map;
import aluguelveiculosutf.impl.ContaImpl;

/**
 * Hash Map de Contas de clientes.
 * @author lucasmelocvl
 */
public class MapContas {
    
    public Map<String, ContaImpl> contas;   //HashMap que possuirá todas as contas.
    
    public MapContas(){
        contas = new HashMap<String, ContaImpl>();
    }
    
    /**
     * Inserir conta.
     * Insere uma nova conta no mapa hash de contas.
     * @param numConta Numero da conta do cliente.
     * @param conta Objeto conta.
     */
    public void inserirConta(String numConta, ContaImpl conta){
        contas.put(numConta, conta);  
    }
    
    /**
     * Recuperar conta.
     * Recupa uma conta do cliente do mapa hash.
     * @param numConta Número da conta do cliente.
     * @return ContaImpl Conta do cliente.
     */
    public ContaImpl recuperarConta(String numConta){
        ContaImpl conta = contas.get(numConta);
        return conta;
    }
    
    /**
     * Conta existe.
     * Verifica se a conta existe.
     * @param numConta Numero da conta a ser checado.
     * @return boolean True se a conta existir.
     */
    public boolean contaExiste(String numConta){
        ContaImpl conta = this.recuperarConta(numConta);
        if(conta == null){
            return false;
        }
        return true;
    }
    
}
