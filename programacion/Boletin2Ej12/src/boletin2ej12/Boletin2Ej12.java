
package boletin2ej12;
import java.util.Scanner;
/**
 *
 * @author Selu
 */
public class Boletin2Ej12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         boolean correcto = false;
        System.out.println("Dame el dia, el mes y el año: ");
        int dia = sc.nextInt();
        int mes = sc.nextInt();
        int año = sc.nextInt();
        
        //if (dia <= 0 && mes <= 0 && mes >12 && dia > 31 && año < 0 ) {
          //  System.out.println("Los datos introducidos no son correctios");
       // } else {
         //   if(mes == 2){
           //     if(dia<= 28){
             //       System.out.println("La fecha es: "+dia+" / "+mes+" / "+año);
                //} else {
                 //    if(mes == 4 || mes == 6 || mes == 9 || mes == 11 ){
                   //      if (dia >= 30){
                     //     System.out.println("La fecha es: "+dia+" / "+mes+" / "+año);
                    // } else{
                      //       if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 12){
                        //     System.out.println("La fecha es: "+dia+" / "+mes+" / "+año);
                         //} 
                           // else {
                             //    System.out.println("algo fallo");
                               //  }
            
            //}
                 int diasDelMes = 0;
            switch (mes) {
                case 1,3,5,7,8,10,12:  
                    diasDelMes = 31;
                    break;

                case 2: 
                    diasDelMes = 28; //febrero
                    break;
                default:
                    diasDelMes=30; //Meses de 30 dias
         
            }
               if (mes >= 1 && mes <= 12 && dia >= 1 && dia <= diasDelMes){
                   correcto = true;
                   
               }
               
               System.out.println("La fecha es: " + (correcto?"correcta":"Incorrecta"));
            }
        
        }

        
       
