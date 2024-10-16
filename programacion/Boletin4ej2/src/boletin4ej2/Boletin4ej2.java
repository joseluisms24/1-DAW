
package boletin4ej2;

import java.util.Scanner;

/**
 *
 * @author Selu
 */
public class Boletin4ej2 {

    public static void main(String[] args) {
        
           Scanner sc = new Scanner(System.in);
           
           int a, b;
        
        System.out.println("Introduzca un numero: ");
        a = sc.nextInt();
         System.out.println("Introduzca un numero: ");
        b = sc.nextInt();
        if (a < b) {
            PedirNumeros(a,b);
        }
        else
                PedirNumeros(b,a);
        
    }
        
        public static void PedirNumeros(int a, int b){
            for (int i = a; i <= b; i++) {
                System.out.println(i);
            }
            
            
            
        }
    }
    
