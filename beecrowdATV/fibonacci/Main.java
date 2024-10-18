package beecrowdATV.fibonacci;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int T = ler.nextInt();     
        long[] fib = new long[61]; // O índice máximo é 60
        fib[0] = 0;
        fib[1] = 1;
        
        for (int i = 2; i <= 60; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        for (int i = 0; i < T; i++) {
            int N = ler.nextInt();
            System.out.printf("Fib(%d) = %d%n", N, fib[N]);
        }
        ler.close();
    }
}

