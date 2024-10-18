
package boletin4ej7;

import java.util.Scanner;

/**
 *
 * @author Selu
 */
public class Boletin4ej7 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
           
           int numero1;
        System.out.println("Introduzca un numero: ");
        numero1 = sc.nextInt();
        
        esPrimo(numero1);
       
       
    }
    
    public static void esPrimo(int numero1){
        if (numero1 % 2 != 0 ) {
            System.out.println("El numero es primo");
        }
        else
            System.out.println("El numero no es primo");
        
    }
            
    
}
