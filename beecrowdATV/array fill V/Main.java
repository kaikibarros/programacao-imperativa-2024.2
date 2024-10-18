import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] par = new int[5];
        int[] impar = new int[5];
        int parCount = 0, imparCount = 0;

        for (int i = 0; i < 15; i++) {
            int numero = scanner.nextInt();

            if (numero % 2 == 0) {
                par[parCount] = numero;
                parCount++;
                
                if (parCount == 5) {
                    for (int j = 0; j < 5; j++) {
                        System.out.println("par[" + j + "] = " + par[j]);
                    }
                    parCount = 0; // Reinicia o contador para a próxima iteração
                }
            } else {
                impar[imparCount] = numero;
                imparCount++;
                
                if (imparCount == 5) {
                    for (int j = 0; j < 5; j++) {
                        System.out.println("impar[" + j + "] = " + impar[j]);
                    }
                    imparCount = 0; // Reinicia o contador para a próxima iteração
                }
            }
        }

        for (int i = 0; i < imparCount; i++) {
            System.out.println("impar[" + i + "] = " + impar[i]);
        }
        for (int i = 0; i < parCount; i++) {
            System.out.println("par[" + i + "] = " + par[i]);
        }
        scanner.close();
    }
}