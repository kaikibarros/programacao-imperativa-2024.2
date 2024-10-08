package listaVetores;
import java.util.Scanner;

// Fac¸a um programa que leia um vetor de 8 posic¸oes e, em seguida, leia tamb ˜ em dois valores X e Y quaisquer correspondentes a duas posic¸oes no vetor. Ao final seu programa
// devera escrever a soma dos valores encontrados nas respectivas posic¸ ´ oes ˜ X e Y .


public class v04 {
    public static void main (String[] args){
    Scanner ler = new Scanner(System.in);
    final int[] vetor = new int[8];

        
    for(int i = 0; i < 8; i++){
        System.out.print("Digite o valor para a posição " + i +": ");
        vetor[i] = ler.nextInt();
    }
    System.out.println("digite a posição X: ");
    int x = ler.nextInt();

    System.out.println("digite a posição y:");
    int y = ler.nextInt();

    if(x >=0 && x < 8 && y >= 0 && y < 8){
        int soma = vetor[x] + vetor[y];
        System.out.println(soma);
    } else {
        System.out.println("erro");
    }
    ler.close();
    }
}
