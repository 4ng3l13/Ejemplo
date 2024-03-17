import java.util.Scanner;

public class Ejemplo {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner leer = new Scanner(System.in);

        int num1 = leer.nextInt();
        int num2 = leer.nextInt();

        int operacion = num1 + num2;
        
        System.out.println(operacion);
        System.out.println(Math.pow(num1, 3));
        
    }
}