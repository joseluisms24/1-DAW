/*
Desarrollar un programa que solicite los valores mínimo y máximo de un rango. A
continuación solicitará por teclado un número que debe estar dentro del rango. Si el
valor introducido no pertenence al rango, la aplicación volverá a pedir otro valor, y así
repetidas veces, hasta que el valor se encuentre dentro del rango.
 */
package boletin3ej5;

import java.util.Scanner;

public class Boletin3Ej5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Dame un valor minimo");
        int minimo = sc.nextInt();
        
        System.out.println("Dame un valor máximo");
        int maximo = sc.nextInt();
        
        System.out.println("Dame un valor entre medio de los dos");
        int valor_Medio = sc.nextInt();
        
        while (valor_Medio < minimo || maximo < valor_Medio ) {
            
            System.out.println("El valor no está en el rango dame otro");
            valor_Medio = sc.nextInt();
            
        }
        
        if (valor_Medio > minimo){
            if (valor_Medio < maximo) {
                    System.out.println("El valor está en medio de los dos");
                
            }
        }
        
        
        
        
    }
    
}
