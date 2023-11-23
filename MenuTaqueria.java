
package menutaqueria;
import java.util.Scanner;

public class MenuTaqueria {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double precio;
        int ordenelegida;
        do {            
        System.out.println("Sea bienvenido a la taqueria El Amigo del Sur");
        System.out.println("Tenemos las siguientes ordenes a elegir: ");
        System.out.println("1. Orden de pastor: CH: $20, M: $30, G: $40");
        System.out.println("2. Orden de bistec: CH: $15, M: $25, G: $35");
        System.out.println("3. Orden de adobada: CH: $18, M: $28, G: $38"); 
        System.out.println("4. Salir");
        ordenelegida= scanner.nextInt();
        scanner.nextLine();
        
        String orden;
            if (ordenelegida==1) {
                orden= "Orden de pastor";
            } else if (ordenelegida==2) {
                orden= "Ordn de bistec";
            } else { 
                orden= "Orden de adobada";
            }
            switch (ordenelegida) {
                case 1:
                    System.out.println("Tamanio de la orden(CH, M, G)");
                    String tamanio= scanner.nextLine();
                    if (tamanio.equals("CH")) {
                        precio= 20;
                    } else if (tamanio.equals("M")) {
                        precio= 30;
                    } else { 
                        precio= 40;
                    }
                    System.out.println("Por un cobro extra de $10, podemos regalarle salsas. Esta de acuerdo?");
                    String cobroextra= scanner.nextLine();
                    if (cobroextra.equals("Si")) {
                        precio+=10;
                    } else if (cobroextra.equals("No")) {
                    precio+=0;
                    }
                    System.out.println("Orden comprada: " + ordenelegida);
                    System.out.println("Se le cobro extra: " + cobroextra);
                    System.out.println("Total de la cuenta: " + precio);
                    break;
                case 2: 
                    System.out.println("Tamanio de la orden(CH, M, G)");
                    String tamanio2= scanner.nextLine();
                    if (tamanio2.equals("CH")) {
                        precio= 15;
                    } else if (tamanio2.equals("M")) {
                        precio= 25;
                    } else { 
                        precio= 35;
                    }
                    System.out.println("Por un cobro extra de $10, podemos regalarle salsas. Esta de acuerdo?");
                    String cobroextra2= scanner.nextLine();
                    if (cobroextra2.equals("Si")) {
                        precio+=10;
                    } else if (cobroextra2.equals("No")) {
                    precio+=0;
                    }
                    System.out.println("Orden comprada: " + ordenelegida);
                    System.out.println("Se le cobro extra: " + cobroextra2);
                    System.out.println("Total de la cuenta: " + precio);
                    break;
                case 3: 
                    System.out.println("Tamanio de la orden(CH, M, G)");
                    String tamanio3= scanner.nextLine();
                    if (tamanio3.equals("CH")) {
                        precio= 18;
                    } else if (tamanio3.equals("M")) {
                        precio= 28;
                    } else { 
                        precio= 38;
                    }
                    System.out.println("Por un cobro extra de $10, podemos regalarle salsas. Esta de acuerdo?");
                    String cobroextra3= scanner.nextLine();
                    if (cobroextra3.equals("Si")) {
                        precio+=10;
                    } else if (cobroextra3.equals("No")) {
                    precio+=0;
                    }
                    System.out.println("Orden comprada: " + ordenelegida);
                    System.out.println("Se le cobro extra: " + cobroextra3);
                    System.out.println("Total de la cuenta: " + precio);
                    break;
                case 4:
                    System.out.println("Gracias por su visita. vuelva pronto");
       
                default:
                    System.out.println("Opcion invalida");
            }
        
        } while (true);
        
        
    }
    
}
