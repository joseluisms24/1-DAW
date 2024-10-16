
package boletin4ej3;

import java.util.Scanner;

/**
 *
 * @author Selu
 */
public class Boletin4ej3 {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
           
           double altura, radio;
        
        System.out.println("Introduzca altura: ");
        altura = sc.nextDouble();
         System.out.println("Introduzca radio: ");
        radio = sc.nextDouble();
        
        System.out.println("Dame un valor si quieres el area 1 o volumen 2");
        int valor = sc.nextInt();
        
        switch (valor) {
            case 1:
                
                System.out.println("El resultado es:" +CalculoArea(altura,radio));
                break;
            
            case 2:
                
                System.out.println("El resultado es" +CalculoVolumen(altura,radio));
                
                break;
            default:
                break;
        }
    }
        
        public static double CalculoArea(double altura, double radio){
           double resultadoArea =  2 * Math.PI * (altura + radio);
           
           return resultadoArea;
        }
        
         public static double CalculoVolumen(double altura, double radio){
           double resultadoVolumen =  Math.PI * radio*radio * altura;
           
           return resultadoVolumen;
         }
 
}
