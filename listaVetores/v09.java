package listaVetores;
import java.util.Scanner;

// Crie um programa que le 6 valores inteiros pares e, em seguida, mostre na tela os valores ˆ
//lidos na ordem inversa.

public class v09 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int [] vetor = new int[6];

        System.out.println("Digite um valor par! ");

        for(int i = 0; i < 6; i++) {
            System.out.print("Insira: ");
            vetor[i] = ler.nextInt();
            while(vetor[i] % 2 != 0){
                System.out.println(vetor[i] + " é um valor ímpar! Digite um valor par!");
                vetor[i] = ler.nextInt();
            }
        }
        System.out.println("Ordem inversa: ");
        for (int i = vetor.length -1; i >= 0; i--) {
            if (vetor[i] % 2 == 0){
                System.out.print(" / " + vetor[i]);
            }
        }
        ler.close();
    }
}
