package ProyectoDeCalculadoraDeMatrices;

import java.util.Scanner;

public class MatricesOperaciones {
    
    // MULTIPLICACION ESCALAR
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("INGRESE EL NUMERO DE RENGLONES DE LA MATRIZ:");
        int ren = leer.nextInt();
        System.out.println("INGRESE EL NUMERO DE COLUMNAS DE LA MATRIZ :");
        int col = leer.nextInt();
        System.out.println("INGRESE LA CANTIDAD ESCALAR:");
        int esc = leer.nextInt();

        int mat [][]= new int [ren][col];

        System.out.println("INGRESE LOS VALORES DE CADA LUGAR DE LA MATRIZ:");
        for (int i = 0; i < ren; i++) {
            for (int j = 0; j < col; j++) {
                mat[i][j] = leer.nextInt();
                mat[i][j] *= esc;
            }
        }
        for (int i = 0; i < ren; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
