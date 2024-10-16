package boletin3ej3;

import java.util.Scanner;

/**
 *
 * @author Selu
 */
public class Boletin3Ej3 {

    public static void main(String[] args) {
          Scanner sc = new Scanner (System.in);
        int random =  (int) (1 + Math.random() * 100);
        System.out.println(random);
        
        System.out.println("Dime un numero:");
        double numero = sc.nextDouble();
        
        
        while (numero != random && numero != -1){
            if (numero > random ){
                System.out.println("el numero es mayor que random");
            }
            else {
                if(numero < random){
                    System.out.println("el numero es menor que random ");  
                
               }
            }
            System.out.println("Dime un numero:");
            numero = sc.nextDouble();
            
        
        }
        if (numero == -1){
        System.out.println("te has rendido fracasado");
        } else {
            if (numero == random){
                System.out.println("Has acertado campeón");
            }
            else {
                System.out.println("Error del sistema");
                }
        }
       
        
        
        
    }
    
}
