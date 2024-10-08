package listaVetores;
import java.util.Scanner;

// Leia um vetor de 10 posic¸oes. Contar e escrever quantos valores pares ele possui.

public class v05{
public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    final int[] vetor = new int[10];
    int pares =0;

    for(int i = 0; i < 10; i++){
        System.out.print("digite o número "+ i+ ": " );
        vetor[i] = ler.nextInt();
        if(vetor[i] % 2 == 0)
        pares++;
    }
    System.out.println(pares);

    }

}