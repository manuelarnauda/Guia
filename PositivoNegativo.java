
package positivonegativo;
import java.util.Scanner;

public class PositivoNegativo {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Hola, vamos a determinar si un numero es positivo o negativo");
        System.out.println("A continuacion, escribe un numero cualquiera: ");
        double numeroelegido = scanner.nextDouble();
        
        if (numeroelegido>=0) {
            System.out.println("El numero que escribio es positivo");
        } else  {
            System.out.println("El numero que escribio es negativo");
        }
        
    }
    
}
