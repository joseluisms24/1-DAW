
package boletin4ej10;

import java.util.Scanner;

/**
 *
 * @author Selu
 */
public class Boletin4ej10 {

    public static void main(String[] args) {
        int numeroA, numerob;
            Scanner sc = new Scanner(System.in);
       
        System.out.println("Introduzca un numero: ");
        numeroA = sc.nextInt();
        System.out.println("Introduzca un numero: ");
        numerob = sc.nextInt();
        
        System.out.println("Los numeros son amigos: " +SonAmigos(numeroA, numerob));
        
        
    }
    public static boolean SonAmigos(int numeroA, int numerob) {
       int sumaDivisoresPropiosA = 0;
       int sumaDivisoresPropiosB = 0;
      

        for (int div = 1; div < numeroA; div++) {
                if(numeroA % div == 0){
                    sumaDivisoresPropiosA += div;
                    
        }
        } 
        for (int div = 1; div < numerob; div++) {
                if(numerob % div == 0){
                    sumaDivisoresPropiosB += div;
                    
        }        
        }        
                
        return sumaDivisoresPropiosA == numerob && sumaDivisoresPropiosB == numeroA;
    }

}
