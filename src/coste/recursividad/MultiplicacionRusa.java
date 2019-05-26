package coste.recursividad;

/*
 * T(n) = O(logb(n)*Cnr(n)+Cb(n)) Si a = 1 (Recursión lineal)
 * Cb(n) = O(1) // Coste caso base
 * Cnr(n)= O(n) // Coste de las operaciones no recursivas en cada llamada
 * a = 1 // número de llamadas recursivas
 * b = 2 // tamaño de los subproblemas (2 ya que es el factor que hace disminuir a a)
 * O(log2n * O(1) + O(1)) que es O(log2n) ==== O(log2 a)
 */

public class MultiplicacionRusa {
     public static void main(String[] args) {
         int a = 3;
         int b = 5;
         System.out.println(mult_rusa(a, b));
     }
     
     private static int mult_rusa(int a, int b){
         if(a==1){
             return b;
         }
         if(a%2!=0){
             return b+mult_rusa(a/2, b*2);
         } else {
             return mult_rusa(a/2, b*2);
         }
     }
}
