
package boletin2ej4;
import java.util.Scanner;
/**
 *
 * @author Selu
 */
public class Boletin2Ej4 {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
//variables
        System.out.println("Poner el numero A:");
        int numeroA = sc.nextInt();
        System.out.println("Poner el numero B:");
        int numeroB = sc.nextInt();
        
        
          if (numeroA == numeroB) {
                System.out.println("El numero es igual y no se puede comparar.");
        } 
           else {
              if (numeroA > numeroB){
                  System.out.println("El numero A es mayor que b");
              }
              else{
                  System.out.println("El numero B es mayor que A");
              }
          }
        
    }
    
}
