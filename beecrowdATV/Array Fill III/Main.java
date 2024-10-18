import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] N = new double[100];

        // Leitura do número de precisão dupla
        N[0] = scanner.nextDouble();
        // Preencher as posições subsequentes com a metade do número anterior
        for (int i = 1; i < 100; i++) {
            N[i] = N[i - 1] / 2.0;
        }
        // Saída formatada com 4 casas decimais
        for (int i = 0; i < 100; i++) {
            System.out.printf("N[%d] = %.4f%n", i, N[i]);
        }

        scanner.close();
    }
}