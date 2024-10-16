/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin4ej5;

import java.util.Scanner;

/**
 *
 * @author Selu
 */
public class Boletin4ej5 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
           
           int numero1, numero2,numero3;
        System.out.println("Introduzca un numero: ");
        numero1 = sc.nextInt();
         System.out.println("Introduzca un numero: ");
        numero2 = sc.nextInt();
        System.out.println("Introduzca un numero: ");
        numero3 = sc.nextInt();
        
        maximo(numero1,numero2,numero3);
        
       
  
    }
    
   public static void maximo(int numero1, int numero2, int numero3){
            if (numero1 > numero2 && numero2 > numero3) {
                System.out.println("Este numero es mayor: "+numero1+" El segundo es: "+numero2+"El tercero es: "+numero3);
            }
            else
                if (numero1 > numero3 && numero3 > numero2) {
                    System.out.println("Este numero es mayor: "+numero1+" El segundo es: "+numero3+"El tercero es: "+numero2);
                }else
                    if (numero2 > numero1 && numero1 > numero3) {
                        System.out.println("Este numero es mayor: "+numero2+" El segundo es: "+numero1+"El tercero es: "+numero3);
                    }else
                        if (numero2 > numero3 && numero3 > numero1) {
                        System.out.println("Este numero es mayor: "+numero2+" El segundo es: "+numero3+"El tercero es: "+numero1);
                        }else
                            if (numero3 > numero1 && numero1 > numero2) {
                        System.out.println("Este numero es mayor: "+numero3+" El segundo es: "+numero1+"El tercero es: "+numero2);
                            }else
                                if (numero3 > numero2 && numero2 > numero1) {
                        System.out.println("Este numero es mayor: "+numero3+" El segundo es: "+numero2+"El tercero es: "+numero1);
                                }
       }
           
       }
   
   
        
