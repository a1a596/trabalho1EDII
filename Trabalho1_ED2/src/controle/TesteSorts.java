/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.util.Arrays;
import javax.swing.JOptionPane;
import modelo.Ordenacao;

/**
 *
 * @author 2017101202010123
 */
public class TesteSorts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ordenacao testes = new Ordenacao();
   
        int[] vet = {10, 9, 42, 12, 4, 2, 14, 88, 76, 18};
        int[] vet2 = {101, 90, 422, 112, 44, 221, 144, 858, 726, 118};
        int[] vet3 = {10, 904, 22, 12, 424, 21, 44, 58, 72, 18};
        
        System.out.printf("Vetor: %s", Arrays.toString(vet));
        System.out.printf("\nBubbleSort: %s", Arrays.toString(testes.bubbleSort(vet)));
        System.out.println();
        
        System.out.println("\n");
        System.out.printf("Vetor: %s", Arrays.toString(vet2));
        System.out.printf("\nInsertionSort: %s",Arrays.toString(testes.insertionSort(vet2)));
        
        
        System.out.println("\n");
        System.out.printf("Vetor: %s", Arrays.toString(vet3));
        System.out.printf("\nSelectionSort: %s",Arrays.toString(testes.selectionSort(vet3)));
        System.out.println();
        
    }
    
}
