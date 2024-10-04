
package boletin2ej9;

import java.util.Scanner;

/**
 *
 * @author Selu
 */
public class Boletin2Ej9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dime el numero: ");
        int numero = sc.nextInt();
        
        if (numero < 10 ){
            System.out.println("El numero tiene 1 cifra");
        } else if (numero < 100){
            System.out.println("El numero tiene 2 cifras");
        } else if (numero < 1000){
            System.out.println("El numero tiene 3 cifras");  
        } else if (numero < 10000) {
            System.out.println("El numero tiene 4 cifras");
        } else if (numero < 100000) {
            System.out.println("El numero tiene 5 cifras");
        } else {
            System.out.println("El numero no está en el rango establecido.");
        }
        
        }
    
}
