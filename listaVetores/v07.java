package listaVetores;
import java.util.Scanner;

// Escreva um programa que leia 10 numeros inteiros e os armazene em um vetor. Imprima ´
//o vetor, o maior elemento e a posic¸ao que ele se encontra.

public class v07 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int[] vetor = new int[10];

        for(int i = 0; i < vetor.length; i++){
            System.out.printf("digite o %d número: ", i + 1);
            vetor[i] = ler.nextInt();
        }
        int maiorElemento = vetor[0];
        int posicaoMaior = 0;

        for(int i = 1; i < vetor.length; i++){
            if(vetor[i] > maiorElemento) {
                 maiorElemento = vetor[i] ;
                 posicaoMaior = i;
            }
        }
        System.out.printf(" o maior elemento é %d%n",maiorElemento);
        System.out.printf("e a sua posição é a %d",posicaoMaior + 1);

        ler.close();
    }
}