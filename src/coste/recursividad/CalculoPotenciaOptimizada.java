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
public class CalculoPotenciaOptimizada {
    
     public static void main(String[] args) {
        int b = 5;
        int n = 2;
        System.out.println(potencia(b, n));
     }
     
     /**
      * El tamaño del problema es el exponente de la potencia N, que se va reduciendo entre 2, por lo que la reducción es por división. 
      * El caso base y el caso recursivo tienen ambos coste constante y la recursión es lineal, por lo que:
      * O(log2 n * O(1) + O(1)), que es O(log2 n), siendo n el exponente de la potencia.
      * El valor de a que comentas es 1, ya que la recursión es lineal. En el caso recursivo, por cada llamada a potencia2 se llama 
      * otra vez a potencia2.
      * El orden de complejidad es mejor que en el caso CalculoPotencia ya que en este caso es logarítmico y en el caso anterior 
      * era lineal.
      * 
      * @param b
      * @param n
      * @return 
      */
     private static int potencia(int b, int n){
         if(n==0){
             return 1;
         }
         int rec = potencia(b,n/2);
         if(n%2==0){
             return rec*rec;
         } else {
             return b*rec*rec;
         }
     }
    
}
