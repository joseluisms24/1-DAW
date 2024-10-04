//pedir dos numero enteros y son iguales

package boletin2ej2;
import java.util.Scanner;
/**
 *
 * @author Selu
 */
public class Boletin2Ej2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       //pedir variables
        System.out.println("Poner el numero 1:");
        int numeroA = sc.nextInt();
        System.out.println("Poner el numero 2:");
        int numeroB = sc.nextInt();
        
        if (numeroA == numeroB){
            System.out.println("El numero es igual");
        }
        else{
            System.out.println("el numero no coincide sorry.");
        }
        
        
    }
    
}
