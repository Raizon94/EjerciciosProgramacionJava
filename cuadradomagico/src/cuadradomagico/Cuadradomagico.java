package cuadradomagico;

import java.util.*;

/**
 *
 * @author bilian
 */
public class Cuadradomagico {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca N para definir un cuadrado NxN");
        int n = sc.nextInt();
        int[][] matriz = new int[n][n];
        int[] resultados = new int[(n * n + 2)];
        boolean magico = true;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Introduce un numero para la posición " + (i + 1) + "x" + (j + 1));
                matriz[i][j] = sc.nextInt();
            }
        }
        
        //Recogemos todos los resultados
        for (int i = 0; i < (n + 2); i++) {
            
        }
       
    }
    
}
