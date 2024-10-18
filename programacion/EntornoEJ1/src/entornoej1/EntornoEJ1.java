
package entornoej1;
import java.util.Scanner;
/**
 *
 * @author usuarioDAW
 */
public class EntornoEJ1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dame la distancia a recorrer en kilometros");
       double distanciaRecorrer = sc.nextDouble();
        
        System.out.println("Dame la velocidad promedio esperada en km/h");
        double velocidad = sc.nextDouble();
        
        double horas = distanciaRecorrer / velocidad;
        
        System.out.println("Las horas que vas a tardar son: "+horas);
        
       
        
        
        
    }
    
}
