package beecrowdATV.arraySelection1;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double[] A = new double[100];

        for (int i = 0; i < 100; i++) {
            A[i] = ler.nextDouble();
        }

        for (int i = 0; i < 100; i++) {
            if (A[i] <= 10.0) {
               
                System.out.printf("A[%d] = %.1f%n", i, A[i]);
            }
        }
        ler.close();
    }
}