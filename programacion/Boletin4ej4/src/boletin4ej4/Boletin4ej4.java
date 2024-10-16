
package boletin4ej4;

import java.util.Scanner;

/**
 *
 * @author Selu
 */
public class Boletin4ej4 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
           
           int numero1, numero2;
        System.out.println("Introduzca un numero: ");
        numero1 = sc.nextInt();
         System.out.println("Introduzca un numero: ");
        numero2 = sc.nextInt();
        
        maximo(numero1,numero2);
        
  
    }
    
   public static void maximo(int numero1, int numero2){
            if (numero1 >= numero2) {
                System.out.println("Este numero es mayor: "+numero1+" El menor es: "+numero2);
            }
            else
                System.out.println("Este numero es mayor: "+numero2+" El menor es: "+numero1);
           
           
        }
    
}
