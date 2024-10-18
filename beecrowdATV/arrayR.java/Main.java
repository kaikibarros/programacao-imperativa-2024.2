import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] X = new int[10];

        for (int i = 0; i < 10; i++) {
            X[i] = scanner.nextInt();
            if (X[i] <= 0) {
                X[i] = 1;
            }
        }

        // Saída formatada
        for (int i = 0; i < 10; i++) {
            System.out.println("X[" + i + "] = " + X[i]);
        }
        scanner.close();
    }
}