
package diasdelasemana;
import java.util.Scanner;

public class DiasdelaSemana {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String dia1= "Lunes";
        String dia2= "Martes";
        String dia3= "Miercoles";
        String dia4= "Jueves";
        String dia5= "Viernes";
        String dia6= "Sabado";
        String dia7= "Domingo";
        
        System.out.println("Bienvenido, a continuacion conoceras los dias de la semana a partir del numero que ingreses");
        System.out.println("Por favor, ingresa un numero del 1 al 7: ");
        int numeroelegido= scanner.nextInt();
        
        switch (numeroelegido) {
            case 1:
                System.out.println("Hola, soy " + dia1);
                break;
            case 2:
                System.out.println("Hola, soy " + dia2);
                break;
            case 3:
                System.out.println("Hola, soy " + dia3);
                break;
            case 4:
                System.out.println("Hola, soy " + dia4);
                break;
            case 5:
                System.out.println("Hola, soy " + dia5);
                break;
            case 6:
                System.out.println("Hola, soy " + dia6);
                break;
            case 7:
                System.out.println("Hola, soy " + dia7);
                break;
            default:
                System.out.println("Opcion invalida");
        }
    }
    
}
