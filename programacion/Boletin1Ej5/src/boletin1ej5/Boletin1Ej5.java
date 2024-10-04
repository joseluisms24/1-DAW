package boletin1ej5;
import java.util.Scanner;
/**
 *
 * @author usuarioDAW
 */
public class Boletin1Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //nota 1 
       System.out.println("Dime la nota 1: ");
       int nota1 = sc.nextInt();
       
       //nota 2
       System.out.println("Dime la nota 2: ");
       int nota2 = sc.nextInt();
       double resultado;
       
        resultado = (double)(nota1+nota2) /2;
       
       System.out.println("El resultado de la media es: "+resultado);
    }
    
}
