
package boletin2ej1;
import java.util.Scanner;

/**
 *
 * @author Selu
 */
public class Boletin2Ej1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
  
        
        System.out.println("Dime su numero y lo compruebo:");
        int numero = sc.nextInt();
        
        if (numero % 2 == 0){
            System.out.println("El numero es par");
          }
        else{
            System.out.println("El numero es impar");
        }
            
    }
    
    
}
