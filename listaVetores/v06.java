package listaVetores;
import java.util.Scanner;


// Faca um programa que receba do usuario um vetor com 10 posicoes. Em seguida deverá
// ser impresso o maior e o menor elemento do vetor.
public class v06 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        final int[] vetor = new int[10];
        
        System.out.println("Digitw 10 números inteiros!");
        for(int i = 0; i < 3; i++){
            System.out.printf("digite o %d número: ", i);
           int num = ler.nextInt();
        }

        
    }
    
}
