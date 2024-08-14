import java.util.*;

class Ideone
{
    public static void main (String[] args) throws java.lang.Exception
    {
        printNumbers1To100();
        printSumOfOddNumbers();
        printMultiplesOf3NotEndingIn3();
    }

    // Função para imprimir os números de 1 a 100 separados por vírgula
    public static void printNumbers1To100() {
        for (int i = 1; i <= 100; i++) {
            if (i > 1) {
                System.out.print(", ");
            }
            System.out.print(i);
        }
        System.out.println();
    }

    // Função para imprimir o somatório de todos os números ímpares entre 10 e 1000
    public static void printSumOfOddNumbers() {
        int sum = 0;
        for (int i = 11; i < 1000; i += 2) {
            sum += i;
        }
        System.out.println(sum);
    }

    // Função para imprimir todos os números múltiplos de 3 que não terminem em 3
    public static void printMultiplesOf3NotEndingIn3() {
        boolean first = true;
        for (int i = 3; i < 1000; i += 3) {
            if (i % 10 != 3) {
                if (!first) {
                    System.out.print(", ");
                }
                System.out.print(i);
                first = false;
            }
        }
        System.out.println();
    }
}
