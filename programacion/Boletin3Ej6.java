/*
 Escribir todos los múltiplos de 7 menores que 100.
 */
package boletin3ej6;

import java.util.Scanner;

/**
 *
 * @author Selu
 */
public class Boletin3Ej6 {

    public static void main(String[] args) {
         Scanner sc = new Scanner (System.in);
         
         for (int i = 1; 7*i < 100; i++) {
             int resultado;
             resultado = 7*i;
             System.out.println("Los numero son: "+resultado);
            
        }
    }
    
}
