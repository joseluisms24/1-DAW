
package boletin4ej8;

import java.util.Scanner;

/**
 *
 * @author Selu
 */
public class Boletin4ej8 {

    public static void main(String[] args) {
       //CONTADOR!!
         Scanner sc = new Scanner(System.in);
       
        int numero1;
        System.out.println("Introduzca un numero: ");
        numero1 = sc.nextInt();
       
        ComprobadorDivisores(numero1);
            
    }
    
    
    public static void ComprobadorDivisores (int numero1) {
        int res = 0;
        
        for (int contador = 1; contador <= numero1 ; contador++) {
           if(numero1 % contador == 0 ){
               System.out.println("Los numeros divisores son " +contador);
        }
               
    }
    }
}