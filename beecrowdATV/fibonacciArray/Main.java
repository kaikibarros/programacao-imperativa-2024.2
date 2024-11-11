package beecrowdATV.fibonacciArray;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        long[] fibonacci = new long[61];

        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i = 2; i <= 60; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
            int T = ler.nextInt();
            for (int i = 0; i < T; i++) {
               int N = ler.nextInt();
                System.out.println("Fib(" + N + ") = " + fibonacci[N]);
            }
            ler.close();
                }
            }
// ler o numero de fibonaccis
//int T
// N(0 <= N <= 60)
// para cada loop imprimir Fib(N) = X