package boletin1ej7;
import java.util.Scanner;
/**
 *
 * @author usuarioDAW
 */
public class Boletin1Ej7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
       
        double numero=0;
        System.out.println("Dime un número con decimales.");
        numero = sc.nextDouble();
       
        double resultado;
        resultado = numero + 0.5;
        resultado = (int)resultado;
        System.out.println("El número es:" +resultado);
        
    }
    
}
