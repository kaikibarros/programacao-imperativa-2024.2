package beecrowdATV.arraySelection;

import java.util.Scanner;
public class arraySelection1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
    double[] A = new double[100];

    for (int i = 0; i < A.length; i++) {
        A[i] = ler.nextDouble();
    }

    for(int i = 0; i < 100; i++){
        if(A[i] <= 10){
            System.out.printf("A[%d] = %.1f%n", i, A[i]);}}
    }
}
