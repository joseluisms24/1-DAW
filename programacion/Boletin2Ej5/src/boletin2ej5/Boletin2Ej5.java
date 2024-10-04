
package boletin2ej5;
import java.util.Scanner;

/**
 *
 * @author Selu
 */
public class Boletin2Ej5 {

    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Indique el numero:");
          double numero = sc.nextDouble();
          
          
          if (numero >= 1 || numero == 0 || numero <= -1) {
              System.out.println("El numero no es casi-cero");
        } else {
              System.out.println("El numero es casi-cero");
        }

        
    }
    
}
