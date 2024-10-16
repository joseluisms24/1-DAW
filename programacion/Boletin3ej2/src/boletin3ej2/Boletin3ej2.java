package boletin3ej2;

import java.util.Scanner;

/**
 *
 * @author Selu
 */
public class Boletin3ej2 {

    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       
        System.out.println("Dime una edad para comenzar (que no sea negativa): ");
        int edad = sc.nextInt();
        int contadorAlumno=0;
        int ContadordeMayorEdad=0;
        int TotalEdad = 0;
        int media = 0;
        
        while(edad > 0){
         contadorAlumno++;   
         TotalEdad = TotalEdad + edad;
         media = TotalEdad / contadorAlumno;
         if(edad > 18){
         ContadordeMayorEdad++;
        
         }
          System.out.println("La media es: "+media+", La edad total es: "+TotalEdad+" El numero de mayores de edad: "+ContadordeMayorEdad+" y el numero de alumnos es: "+contadorAlumno);
       
        System.out.println("Dime una edad para comenzar (que no sea negativa): ");
       edad = sc.nextInt();
             
        }
            
        
    }
    
}
