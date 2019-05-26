package coste.recursividad;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author oscar
 */
public class CalculoPotencia {
    
    public static void main(String[] args) {
        int b = 5;
        int n = 2;
        System.out.println(potencia(b, n));
    }
    
    /**
     * El tamaño del problema es el exponente de la potencia N, que se va reduciendo de uno en uno por lo que la reducción es 
     * por sustracción. El caso base y el caso recursivo tienen ambos coste constante y la recursión es lineal, por lo que:
     * O(n * O(1) + O(1)), que es O(n), siendo n el exponente de la potencia.
     * @param b
     * @param n
     * @return 
     */
    private static int potencia(int b, int n){
        if(n==0){
            return 1;
        } else {
            return b * potencia(b, n-1);
        }
    }
}
