
package boletin4ej1;

import java.util.Scanner;

/**
 *
 * @author Selu
 */
public class Boletin4ej1 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca un numero: ");
        int n = sc.nextInt();
        eco(n);
        
    }
        
        public static void eco(int n){
            for (int i = 0; i < n; i++) {
                System.out.println("Eco...");
                
            }
        
        }
 
}
