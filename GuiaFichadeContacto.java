
package guiafichadecontacto;
import java.util.Scanner;

public class GuiaFichadeContacto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre completo: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese su edad: ");
        int edad= scanner.nextInt();
        System.out.println("Ingrese su numero telefonico: ");
        int telefono= scanner.nextInt();
        System.out.println("Ingrese su correo electronico: ");
        String correo= scanner.nextLine();
        scanner.close();
        
        System.out.println("FICHA DE CONTACTO");
        System.out.println("Nombre completo: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Correo electronico: " + correo);
        System.out.println("Telefono: " + telefono);
    }
    
}
