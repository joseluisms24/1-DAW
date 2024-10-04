
package boletin2ej7;
import java.util.Scanner;
/**
 *
 * @author Selu
 */
public class Boletin2Ej7 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
         System.out.println("Poner el numero A:");
        int numeroA = sc.nextInt();
        System.out.println("Poner el numero B:");
        int numeroB = sc.nextInt();
        System.out.println("Poner el numero C: ");
        int numeroC = sc.nextInt();
        
        if (numeroA >= numeroB && numeroB >= numeroC && numeroA >= numeroC) {
            //numero A es mayor, B es mayor que C 
            System.out.println(numeroA+" , "+numeroB+" , "+numeroC);
        }   else if (numeroA>=numeroB && numeroC>=numeroB && numeroA >= numeroC){
            //numero a es mayor, c es mayor que b
            System.out.println(numeroA+" , "+numeroC+" , "+numeroB);
        } else if (numeroB>=numeroA && numeroA>=numeroC && numeroB >= numeroC){
            //numero b es mayor, A es mayor que c
            System.out.println(numeroB+" , "+numeroA+" , "+numeroC);
          } else if (numeroB>=numeroA && numeroB>=numeroC && numeroC >= numeroA){
            //numero b es mayor, C es mayor que A
            System.out.println(numeroB+" , "+numeroC+" , "+numeroA);  
        } else if (numeroC>=numeroB && numeroB >= numeroA && numeroC>numeroA){
            //numero c es mayor, B es mayor A
            System.out.println(numeroC+" , "+numeroB+" , "+numeroA);
         } else if (numeroC>=numeroA && numeroC>=numeroB && numeroA >= numeroB){
            //numero C es mayor, A es mayor que c
            System.out.println(numeroC+" , "+numeroA+" , "+numeroB);  
        }
        
       
    }
    
}
