

import java.util.Scanner;

//   Escreva um programa que peça ao usuário dois números inteiros
//   exiba todos os números pares e depois todos os números ímpares entre esses dois números.

public class NumerosPares {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

        System.out.print("informe um número inteiro: ");
        int num1 = entrada.nextInt();
        System.out.print("informe mais um número inteiro: ");
        int num2 = entrada.nextInt();

        System.out.println("Números pares entre " +num1 + " e " + num2 + ": ");
        for (int i = Math.min(num1, num2); i <= Math.max(num1, num2); i++) {
            if (i % 2 == 0) {
                System.out.println(i + " ");
            }
        }
        System.out.println("Números ímpares entre " +num1 + " e " + num2 + ": ");
        for (int i = Math.min(num1, num2); i <= Math.max(num1, num2); i++) {
            if (i % 2 != 0) {
                System.out.println(i + " ");
            }
        }
        entrada.close();
    }
}
