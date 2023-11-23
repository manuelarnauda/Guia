
package factorial;
import java.util.Scanner;

public class Factorial {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Escribe un numero entero: ");
        int numeroentero= scanner.nextInt();
        
        int factorialnumero= 1;
        
        for (int i = 1; i <=numeroentero; i++) {
            factorialnumero *=i;
            
            System.out.println(factorialnumero);
            
        }
    }
    
}
