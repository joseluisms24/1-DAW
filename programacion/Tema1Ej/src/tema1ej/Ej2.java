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
public class Ej2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime su edad: ");
        int edad = sc.nextInt();
        
        //proximo año
        int ProximoAño = 0;
        ProximoAño = edad + 1;
        System.out.println("El proximo año tendrá: "+ProximoAño);
        
    }
    
}
