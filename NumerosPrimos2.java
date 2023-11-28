
package numerosprimos;


public class NumerosPrimos2 {

    
    public static void main(String[] args) {
        
        for (int i = 0; i < 500; i++) {
            boolean numprimo = true;
            for (int j = 2; j < i; j++) {
                if (i % j ==0) numprimo=false; 
                    
            }
                if (numprimo == true) 
                    System.out.println("Es primo " + i);
                
            }
            
        }
    }
    

