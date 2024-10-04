package boletin1ej9;
import java.util.Scanner;

/**
 *
 * @author usuarioDAW
 */
public class Boletin1Ej9 {

    public static void main(String[] args) {
      double pera;
      double manzana; 
       
       Scanner sc = new Scanner(System.in);
       //pedir las variables de pera y maznana
        System.out.println("Dame el valor de manzana del año: ");
        manzana = sc.nextDouble();
         System.out.println("Dame el valor de pera del año: ");
         pera = sc.nextDouble();
         
       //pedir los trimestres
       System.out.println("Dame las ventas primer trimestre pera: ");
       double primerTrimestre = sc.nextDouble();
       System.out.println("Dame las ventas segundo trimestre pera: ");
       double SegundoTrimestre = sc.nextDouble();
       System.out.println("Dame las ventas tercer trimestre pera: ");
       double TercerTrimestre = sc.nextDouble();
        System.out.println("Dame las ventas tercer trimestre pera: ");
       double CuatroTrimestre = sc.nextDouble();
      
          System.out.println("Dame las ventas primer trimestre manz: ");
       double primerTrimestreM = sc.nextDouble();
       System.out.println("Dame las ventas segundo trimestre manz: ");
       double SegundoTrimestreM = sc.nextDouble();
       System.out.println("Dame las ventas tercer trimestre manz: ");
       double TercerTrimestreM = sc.nextDouble();
       System.out.println("Dame las ventas tercer trimestre manz: ");
       double CuatroTrimestreM = sc.nextDouble();
       
        //CALCULO DE TOTALES
       double resultadoPera = primerTrimestre+SegundoTrimestre+TercerTrimestre+CuatroTrimestre;
       double importetotalpera = resultadoPera*pera;
       
       double resultadoManz = primerTrimestreM+SegundoTrimestreM+TercerTrimestreM+CuatroTrimestreM;
       double importetotalmanz = resultadoManz*manzana;
       
      double importetotal = importetotalpera + importetotalmanz;
      System.out.println("El importe total de todo es: "+importetotal);
       
    }
    
}
