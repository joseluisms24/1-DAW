
package Boletin1Ej4;

/**
 *
 * @author usuarioDAW
 */
public class Boletin1Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        short Numero_Max= Short.MAX_VALUE;
        short numeroMin= Short.MIN_VALUE;
        
        System.out.println("El numero maximo:" + Numero_Max);
        System.out.println("El numero minimo:" + numeroMin);
        
       //incremento y decremento para desbordamiento.
        Numero_Max++;
        numeroMin--;
        
        System.out.println("El numero maximo:" + Numero_Max);
        System.out.println("El numero minimo:" + numeroMin);

      
    
    }
    
}
