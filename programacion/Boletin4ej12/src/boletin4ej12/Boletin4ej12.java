
package boletin4ej12;

import java.util.Scanner;

/**
 *
 * @author Selu
 */
public class Boletin4ej12 {

    public static void main(String[] args) {
                     Scanner sc = new Scanner(System.in);
        int numero1;
        int numero2;
        
      System.out.println("Introduzca un numero: ");
        numero1 = sc.nextInt();
        System.out.println("Introduzca un numero: ");
        numero2 = sc.nextInt();
        
        int opcion;
        
        System.out.println("Dime la opcion que vas a hacer");
        opcion = sc.nextInt();
        
        System.out.println("El resultado de la operación elegida es = " +calculadora(numero1, numero2, opcion));
        }
    
        public static int calculadora (int numero1, int numero2, int opcion){
            int resultado = 0;
            switch (opcion) {
                case 1:
                    resultado = numero1+numero2;
                    break;
                
                case 2:
                    resultado = numero1-numero2;
                    break;
                case 3: 
                    resultado = numero1*numero2;
                    
                    break;
                case 4:
                     resultado = numero1 / numero2;   
                    break;
                default:
                    System.out.println("Ha elegido la opcion correcta.");
            }
        return resultado;
        
        }



    
}
