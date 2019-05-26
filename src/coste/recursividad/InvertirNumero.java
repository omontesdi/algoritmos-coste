/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coste.recursividad;

/**
 *
 * @author Oscar
 */
public class InvertirNumero {

    public static void main(String[] args) {
        int n = 12345;
        System.out.println(invertir(n));
    }

    private static int invertir(int n) {
        return invertirAux(0, n);
    }

    private static int invertirAux(int ac, int n) {
        if(n==0){
            return ac;
        }
        return invertirAux(ac * 10 + (n % 10), n / 10);
    }
}
