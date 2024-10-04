
package boletin1ej10;
import java.util.Scanner;
/**
 *
 * @author usuarioDAW
 */
public class Boletin1Ej10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final double PI = 3.14;
         Scanner sc = new Scanner(System.in);
        //pedir el radio
        double radio;
        System.out.println("Dame el radio para las operaciones");
        radio = sc.nextDouble();
        
        double longitud = 2*PI * radio;
        double area = PI *(radio*radio);
        
        System.out.println("La longitud es: "+ +longitud);
        System.out.println("El area es: "+area);
        
    }    
}
