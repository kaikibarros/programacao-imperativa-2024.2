package beecrowdATV.arrayFill2;
import java.io.IOException;
import java.util.Scanner;


public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        int T = ler.nextInt();
        int V = 0;
        int[] N = new int[10];
        for (int i = 0; i < 1000; i++) {
            N[i] = i % T; 
        }
        for (int i = 0; i < 1000; i++) {
            System.out.println("N[" + i + "] = " + N[i]);
        }
        ler.close();
    }
}