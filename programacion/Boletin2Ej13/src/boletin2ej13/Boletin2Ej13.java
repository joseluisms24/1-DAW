
package boletin2ej13;

import java.util.Scanner;

/**
 *
 * @author Selu
 */
public class Boletin2Ej13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int hora, minuto, segundo;
        System.out.println("Introduce hora, minuto y segundo");
        hora = sc.nextInt();
        minuto = sc.nextInt();
        segundo = sc.nextInt();
        System.out.println("Hora actual :" + hora + ": " +minuto+" : "+segundo);
        
        if (hora >= 0 && hora <= 23 && minuto >= 0  && minuto <= 59 && segundo >= 0 && segundo <= 59){ //hora compro.   
            segundo++;
            if(segundo == 60 ) {
                segundo = 0;
                minuto++;
                if (minuto == 60)
                    minuto = 0;
                    hora++;
                    if(hora == 24) {
                        hora = 0;
                        
                    }
            }
            System.out.println("Hora un segundo más tarde: "+hora+" : "+minuto+" : "+segundo);
            } else {
            System.out.println("Hora incorrecta");
        }
            
             
    }
    
}
