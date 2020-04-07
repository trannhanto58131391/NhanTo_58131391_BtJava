/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhanto_58131391_btjava;

import calculates.CasioCalculator;
import interfaces.ICalculate;

/**
 *
 * @author TNT
 */
public class NhanTo_58131391_BtJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        ICalculate calculator = new CasioCalculator();
        System.out.println("7 + 8 = " + calculator.cong(7, 8));
        System.out.println("9 * 3 = " + calculator.nhan(9, 3));
        System.out.println("9 - 3 = " + calculator.tru(9, 3));
        System.out.println("9 / 3 = " + calculator.chia(9, 3));
    }
    
}
