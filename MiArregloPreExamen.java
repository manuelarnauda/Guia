
package miarreglopreexamen;


public class MiArregloPreExamen {

    
    public static void main(String[] args) {
        int[][] calificaciones= {
            {10, 9, 9, 8},
            {7, 7, 9, 10},
            {8, 9, 8,9},
            {10, 10, 10, 7},
        };
        
        SumaCalificaciones(calificaciones);
        System.out.println();
        SumaPorDia(calificaciones);
        System.out.println();
    }
    public static void SumaCalificaciones(int[][]calificaciones) {
        for (int i = 0; i < calificaciones.length; i++) {
            int suma= 0;
            for (int j = 0; j < calificaciones[i].length; j++) {
                suma+= calificaciones[i][j];
                
            }
            System.out.println("Suma de calificaciones " + (i) + suma);
            
        }
    }
        public static void SumaPorDia(int[][]calificaciones) {
            for (int j = 0; j < calificaciones[0].length; j++) {
                int suma= 0;
                for (int i = 0; i < calificaciones.length; i++) {
                    suma+= calificaciones[i][j];
                    
                }
                System.out.println("Suma Por Dia " + (j) + suma);
            }
            System.out.println();
        }
    }

