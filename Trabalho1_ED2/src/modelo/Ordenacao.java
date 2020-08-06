/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author 2017101202010123
 */
public class Ordenacao {

    public int[] bubbleSort(int v[]) {
        for (int k = v.length; k >= 1; k--) {
            for (int j = 1; j < k; j++) {
                if (v[j - 1] > v[j]) {
                    troca(v, j, j - 1);
                }
            }
        }
        return v;
    }

    public void troca(int v[], int m, int n) {
        int aux = v[m];
        v[m] = v[n];
        v[n] = aux;
    }

    public int[] insertionSort(int v[]) {
        int j;
        int k = 0;
        int i;

        for (j = 1; j < v.length; j++) {
            k = v[j];
            for (i = j - 1; (i >= 0) && (v[i] > k); i--) {
                v[i + 1] = v[i];
            }
            v[i + 1] = k;
        }
        return v;
    }

    public int[] selectionSort(int v[]) {
        for (int fixo = 0; fixo < v.length - 1; fixo++) {
            int menor = fixo;

            for (int i = menor + 1; i < v.length; i++) {
                if (v[i] < v[menor]) {
                    menor = i;
                }
            }
            if (menor != fixo) {
                int t = v[fixo];
                v[fixo] = v[menor];
                v[menor] = t;
            }
        }
        return v;
    }
}
