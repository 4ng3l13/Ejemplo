package ProyectoDeCalculadoraDeMatrices;

import java.util.Scanner;

public class SumaYRestaMatrices {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("ingrese el numero de renglones de la matriz:");
        int ren = leer.nextInt();
        System.out.println("ingrese el numero de columnas de la matriz:");
        int col = leer.nextInt();

        int matrizA [][] = new int[ren][col];
        int matrizB [][] = new int[ren][col];
        int nuevaM [][] = new int[ren][col];

        System.out.println("ingrese los valores de la matriz A:");
        for (int i = 0; i < ren; i++) {
            for (int j = 0; j < col; j++) {
                matrizA [i][j] = leer.nextInt();
            }
        }
        System.out.println("ingrese los valores de la matriz B");
        for (int i = 0; i < ren; i++) {
            for (int j = 0; j < col; j++) {
                matrizB [i][j] = leer.nextInt();
            }
        }

        System.out.println("operacion que desea realizar? (suma o resta)");
        String operacion = leer.next();

        // calculo de la suma y resta de una matriz
        if ("suma".equals(operacion)) {
            for (int i = 0; i < ren; i++) {
                for (int j = 0; j < col; j++) {
                    nuevaM[i][j] = (matrizA[i][j])+(matrizB[i][j]);
                }
            }
        }else{
            for (int i = 0; i < ren; i++) {
                for (int j = 0; j < col; j++) {
                    nuevaM[i][j] = (matrizA[i][j])-(matrizB[i][j]);
                }
            }
        }

        System.out.println("Resultado: ");
        for (int i = 0; i < ren; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(nuevaM[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
