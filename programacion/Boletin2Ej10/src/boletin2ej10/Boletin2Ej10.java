
package boletin2ej10;

import java.util.Scanner;
//10. Numero capicuo entre 0 y 9999
/**
 *
 * @author Selu
 */
public class Boletin2Ej10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dame un numero para saber si es capicuo: ");
        int numero = sc.nextInt();
        
        int unidades = numero%10;
        int decenas = numero/10%10;
        int centenas = numero/100%10;
        int millares = numero/1000%10;
        
        if (numero>=1000 && millares == unidades && decenas == centenas) {
            System.out.println("el numero es capicuo");
           
         }else if (numero >= 100 && centenas == unidades) {
             System.out.println("el numero es capicuo");
                 
        } else if (numero >= 10 && decenas == unidades) {
            System.out.println("El numero es capicuo");
        } else {
            System.out.println("El numero no está dentro del rango marcado o no es capicuo");
        }    
    }
    
}
