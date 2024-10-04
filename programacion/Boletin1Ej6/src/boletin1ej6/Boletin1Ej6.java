//Calculo de la media aritmetica con decimales
package boletin1ej6;
import java.util.Locale;
import java.util.Scanner;
//d+3 = d=d+3 notas.
/**
 *
 * @author usuarioDAW
 */
public class Boletin1Ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //nota 1 
       System.out.println("Dime la nota 1: ");
       double nota1;
        nota1 = sc.nextDouble();
       
       //nota 2
       System.out.println("Dime la nota 2: ");
       double nota2 = sc.nextDouble();
       
       //nota3.
       System.out.println("Dime la nota 3: ");
       double nota3 = sc.nextDouble();
       
       int resultado;
       
        resultado =(int)(nota1+nota2+nota3) /3;
       
       System.out.println("El resultado de la media es: "+resultado);
         
    }
    
}
