
package areadelcirculo;
import java.util.Scanner;

public class AreadelCirculo {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double pi= 3.1416;
        
        System.out.println("Hola, le ayudaremos a calcular el area del circulo");
        System.out.println("Ingrese el radio del circulo: ");
        double radio = scanner.nextDouble();
        
        double areacirculo= pi*radio*radio;
        
        System.out.println("El area del circulo es de " + areacirculo + "cm cuadrados");
        
    }
    
}
