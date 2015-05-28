/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aluguelveiculosutf.servidor;

import aluguelveiculosutf.interfaces.InterfaceCli;

/**
 *
 * @author Lucas
 */
public class Interessado {
    
    private String modeloVeic;
    private float valor;
    private InterfaceCli refCli;
    
    public Interessado(String modVeic, float preco, InterfaceCli ref){
        modeloVeic = modVeic;
        valor = preco;
        refCli = ref;
    }

    /**
     * @return the modeloVeic
     */
    public String getModeloVeic() {
        return modeloVeic;
    }

    /**
     * @param modeloVeic the modeloVeic to set
     */
    public void setModeloVeic(String modeloVeic) {
        this.modeloVeic = modeloVeic;
    }

    /**
     * @return the valor
     */
    public float getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(float valor) {
        this.valor = valor;
    }

    /**
     * @return the ref
     */
    public InterfaceCli getRefCli() {
        return refCli;
    }

    /**
     * @param ref the ref to set
     */
    public void setRefCli(InterfaceCli ref) {
        this.refCli = ref;
    }
}
