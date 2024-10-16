
package boletin4ej6;

import java.util.Scanner;

public class Boletin4ej6 {

    public static void main(String[] args) {
              Scanner sc = new Scanner(System.in);

       
        System.out.println("Dime un carácter: ");
         char n = sc.next().charAt(0);
        esVocal(n);
    }
    //ES MAS BONITO CON SWITCH GRACIAS
    public static void esVocal(char n){
        boolean c = false;
        if (n == 'a'||n == 'e'||n == 'i'||n == 'o'||n =='u'){
            c = true;
            System.out.println("El caracter es vocal");
        }else{
                System.out.println("No es vocal");
        }
        
    }
}   
