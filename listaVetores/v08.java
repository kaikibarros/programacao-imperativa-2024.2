package listaVetores;
import java.util.Scanner;
//Crie um programa que le 6 valores inteiros e, em seguida, mostre na tela os valores lidos ˆ
//na ordem inversa.

public class v08 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int[] vetor = new int[6];

        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Digite o %d valor: ", i + 1);
            vetor[i] = ler.nextInt();
        }
       for (int i = vetor.length - 1; i >= 0; i--) {
           System.out.print(" / " + vetor[i]);
       }
    }
}