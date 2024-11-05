package listaVetores;
import java.util.Scanner;

// Fazer um programa para ler 5 valores e, em seguida, mostrar todos os valores lidos
// juntamente com o maior, o menor e a média dos valores.
public class v12 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] valor = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.printf("Insira o %d valor: ", i + 1);
            valor[i] = ler.nextInt();
        }


        System.out.println("Média: " + calcularMedia(valor));


        int[] maiorMenor = calcularMaiorMenor(valor);
        System.out.println("Maior valor: " + maiorMenor[0]);
        System.out.println("Menor valor: " + maiorMenor[1]);

        ler.close();
    }

    public static int[] calcularMaiorMenor(int[] total) {
        int maior = total[0];
        int menor = total[0];

        for (int i = 1; i < total.length; i++) {
            if (total[i] > maior) {
                maior = total[i];
            }
            if (total[i] < menor) {
                menor = total[i];
            }
        }

        return new int[] {maior, menor};
    }

    public static int calcularMedia(int[] valor) {
        int total = 0;
        for (int i : valor) {
            total += i;
        }
        return total / valor.length;
    }
}
