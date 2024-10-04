
package boletin2ej11;
import java.util.Scanner;
/**
 *
 * @author Selu
 */
public class Boletin2Ej11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dame la nota: ");
        int nota = sc.nextInt();
       
        
        switch (nota) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("El alumno tiene un insuficiente");
                break;
            case 5:
                  System.out.println("El alumno tiene un suficiente");
                break;
            case 6:
                  System.out.println("El alumno tiene un bien");
                break;
                
            case 7:
            case 8:
                  System.out.println("El alumno tiene un notable");
                break;
              case 9:
              case 10:
                  System.out.println("El alumno tiene un sobresaliente");
                break;    
            default:
                System.out.println("Ha habido un error");
                
        }
    }
    
}
