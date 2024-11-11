package beecrowdATV.sortedLength;
import java.util.Scanner;

public class Main {
    static int tam;
    static String[] palavras = new String[100];

    // Função de comparação para ordenar por comprimento em ordem decrescente
    public static int comp(String a, String b) {
        return b.length() - a.length();
    }

    // Implementação do Insertion Sort que ordena palavras por comprimento decrescente
    public static void insertionSort() {
        for (int i = 1; i < tam; ++i) {
            String aux = palavras[i];
            int j = i - 1;

            while (j >= 0 && comp(aux, palavras[j]) < 0) {
                palavras[j + 1] = palavras[j];
                j--;
            }
            palavras[j + 1] = aux;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha após o número

        for (int k = 0; k < N; ++k) {
            String frase = scanner.nextLine();

            tam = 0;
            String[] tokens = frase.split(" ");
            for (String token : tokens) {
                palavras[tam++] = token;
            }

            insertionSort();

            // Exibir as palavras ordenadas
            System.out.print(palavras[0]);
            for (int i = 1; i < tam; ++i) {
                System.out.print(" " + palavras[i]);
            }
            System.out.println();
        }

        scanner.close();
    }
}