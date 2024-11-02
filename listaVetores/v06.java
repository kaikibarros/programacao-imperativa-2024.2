package listaVetores;
import java.util.Scanner;
import java.util.Arrays;


// Faca um programa que receba do usuario um vetor com 10 posicoes. Em seguida deverá
// ser impresso o maior e o menor elemento do vetor.
public class v06 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        final int[] vetor = new int[10];
        
        System.out.println("Digite 10 números inteiros!");
        for(int i = 0; i < 10; i++){
            System.out.printf("digite o %d número: ", i +1);
           vetor[i] = ler.nextInt();
        }
       exibirMaiorMenor(vetor);
       
    }
    public static void exibirMaiorMenor(int[] v) {
        int maior = Arrays.stream(v).max().orElseThrow();
        int menor = Arrays.stream(v).min().orElseThrow();
        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
    }
}
