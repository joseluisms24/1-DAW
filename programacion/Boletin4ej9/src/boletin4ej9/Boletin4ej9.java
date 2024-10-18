/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin4ej9;

import java.util.Scanner;

/**
 *
 * @author Selu
 */
public class Boletin4ej9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
       
        int numero1;
        System.out.println("Introduzca un numero: ");
        numero1 = sc.nextInt();
        
        DivisoresPrimos(numero1);
       
    }
    
    
     public static void DivisoresPrimos(int numero1) {
       
       
        for (int div = 1; div <= numero1; div++) {
                if(numero1 % div == 0 && esPrimo(div)){
                    System.out.println("Los numeros divisores primos son: "+div);
        }
                
                
      }
    }
      public static boolean esPrimo(long n) {
        boolean esPrimo = true;
        long raiz = (long)Math.sqrt(n);
        // Probamos posibles divisores entre 2 y n -1
        for (long d = 2; d <= raiz && esPrimo; d++) {
            if (n % d == 0) { //Si n es divisible por d
                esPrimo = false;
            }
        }
        return esPrimo;
     
    }
}      
