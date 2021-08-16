/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsntools;


/**
 *
 * @author longy
 */
public class DSNTools {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StoreClass tesClass = new StoreClass();
        tesClass.setAnpla(90);
        tesClass.setW(500);
        tesClass.setH(500);
        tesClass.setP((float) 0.85);
        tesClass.setR(50);
        tesClass.setT(3700);
        tesClass.setT0(1000);
        System.out.println(tesClass.getN0());
        System.out.println(tesClass.getGroup());
        System.out.println(tesClass.getN());
        
    }
    
}
