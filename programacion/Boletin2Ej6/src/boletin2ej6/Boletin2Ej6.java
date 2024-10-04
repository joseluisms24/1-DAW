
package boletin2ej6;
import java.util.Scanner;
/**
 *
 * @author Selu
 */
public class Boletin2Ej6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //pedir varibales
         System.out.println("Poner el numero A:");
        int numeroA = sc.nextInt();
        System.out.println("Poner el numero B:");
        int numeroB = sc.nextInt();
        
        //proceso
        if (numeroA > numeroB) {
            System.out.println("El numero a: "+numeroA+"y el numero B: "+numeroB);
            
        } else {
            System.out.println("El numero b: "+numeroB+" NumeroA: "+numeroA);
        }
       


    }
    
}
