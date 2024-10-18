
package boletin4ej11;

import java.util.Scanner;

/**
 *
 * @author Selu
 */
public class Boletin4ej11 {

    public static void main(String[] args) {
        // TODO code application logic here
                   Scanner sc = new Scanner(System.in);
        double a;
        int n;
        
      System.out.println("Introduzca un numero: ");
        a = sc.nextDouble();
        System.out.println("Introduzca un numero: ");
        n = sc.nextInt();
        
        System.out.println("el numero es: " +NumeroElevado(n,a));
        
    }
    public static double NumeroElevado (int n, double a){
        
        double producto = 1;
        for (int i = 1; i <= n; i++) {
            producto *= a; 
            
        }
       
    return producto;
    }
 
}
