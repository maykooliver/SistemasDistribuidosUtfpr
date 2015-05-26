/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aluguelveiculosutf.impl;
import java.rmi.*;

/**
 *
 * @author Lucas
 */
public class ServImpl {
    
    	public static void main(String args[]) {
        System.setSecurityManager(new RMISecurityManager());
        try {
            //ShapeList aShapeList = new ShapeListServant();
            //Naming.rebind("Shape List", aShapeList);
            System.out.println("ShapeList server	ready");
        } catch (Exception e) {
            System.out.println("ShapeList server main" + e.getMessage());
        }
    }

    
}
