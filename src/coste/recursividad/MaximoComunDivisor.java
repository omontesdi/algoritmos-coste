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
public class MaximoComunDivisor {
    public static void main(String[] args) {
        int a = 30;
        int b = 5;
        
        System.out.println(mcd(a, b));
    }
    
    /**
     * Coste:
     * la reducción del problema se realiza mediante división y el coste estaría en O(log n) con n un valor en función de B. 
     * La base del logaritmo da igual, porque al final todos los logaritmos son proporcionales según sus bases, así que sin problema 
     * por ese lado. Todo correcto. 
     * Lo que sí es interesante es intentar ver en qué valor se va subdividiendo el problema... y eso depende de B. 
     * Como vamos a calcular el coste en el caso peor, tendremos que analizar cómo se debe reducir B de forma que nos de la 
     * peor secuencia posible, es decir: cuantás más llamadas recursivas mejor (para nuestros propósitos).
     * @param a
     * @param b
     * @return 
     */
    private static int mcd(int a, int b){
        if(b==0){
            return a; //Coste O(1)
        } else {
            return mcd(b, a % b);
        }
    }
}
