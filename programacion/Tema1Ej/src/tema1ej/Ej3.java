/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema1ej;
import java.util.Scanner;
/**
 *
 * @author usuarioDAW
 */
public class Ej3 {
    public static void main(String[] args) {
        System.out.println("Dime el año: ");
        Scanner sc = new Scanner(System.in);
        int AñoActual = sc.nextInt();
        
        System.out.println("Dime el año de nacimiento: ");
        int AñoNac = sc.nextInt();
        
        //Calculo de edad
        int edad = 0;
        
        edad =  AñoActual - AñoNac;
        
        System.out.println("La edad del alumno es: "+edad);
        
          
    }
}
