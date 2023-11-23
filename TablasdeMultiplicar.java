
package tablasdemultiplicar;
import java.util.Scanner;

public class TablasdeMultiplicar {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Aqui le mostraremos las tablas de multiplicar");
        System.out.println("A continuacion, escriba un numero del 1 al 10 para apreciar las tablas");
        int numero = scanner.nextInt();
        
        for (int i = 1; i <= 10; i++) {
           int multiplicacion= numero*i;
           
           
            System.out.println(numero + "*" + i + "= " + multiplicacion);
            
        }
    }
    
}
