/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import modelo.Ordenacao;

/**
 *
 * @author 2017101202010123
 */
public class TesteBubleSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ordenacao buble = new Ordenacao();
        
        int[] vet = {10, 9, 20, 40, 30, 33, 12, 25, 10, 17};
        
        System.out.println(buble.bubbleSort(vet));
        
        
    }
    
}
