
package boletin1ej8;
import java.util.Scanner;
/**
 *
 * @author usuarioDAW
 */
public class Boletin1Ej8 {
    
    public static void main(String[] args) {
       final double PERA = 1.95;
       final double MANZANA = 2.35; 
       
       Scanner sc = new Scanner(System.in);
       
       //pedir los trimestres
       System.out.println("Dame las ventas primer trimestre pera: ");
       double primerTrimestre = sc.nextDouble();
       System.out.println("Dame las ventas segundo trimestre pera: ");
       double SegundoTrimestre = sc.nextDouble();
       System.out.println("Dame las ventas tercer trimestre pera: ");
       double TercerTrimestre = sc.nextDouble();
      System.out.println("Dame las ventas 4 trimestre pera: ");
       double CuatriTrimestre = sc.nextDouble();
      
       System.out.println("Dame las ventas primer trimestre manz: ");
       double primerTrimestreM = sc.nextDouble();
       System.out.println("Dame las ventas segundo trimestre manz: ");
       double SegundoTrimestreM = sc.nextDouble();
       System.out.println("Dame las ventas tercer trimestre manz: ");
       double TercerTrimestreM = sc.nextDouble();
       System.out.println("Dame las ventas tercer trimestre manz: ");
       double CuatriTrimestreM = sc.nextDouble();
       
        //CALCULO DE TOTALES
       double resultadoPera = primerTrimestre+SegundoTrimestre+TercerTrimestre+CuatriTrimestre;
       double importetotalpera = resultadoPera*PERA;
       
       double resultadoManz = primerTrimestreM+SegundoTrimestreM+TercerTrimestreM+CuatriTrimestreM;
       double importetotalmanz = resultadoManz*MANZANA;
       
      double importetotal = importetotalpera + importetotalmanz;
      System.out.println("El importe total de todo es: "+importetotal);
       
       
    }
    
}
