
// Solicite ao usuário para inserir um número inteiro positivo e calcule o fatorial desse número.
// Utilize um loop `while` para realizar o cálculo.

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


        System.out.println("Digite um número inteiro positivo: ");
        int numero = entrada.nextInt();

        int fatorial = 1;
        int i = numero;

        if (numero >= 0) {
            while (i > 0) {
                fatorial *= i;
                i--;
            }
            System.out.println("O fatorial de " + numero + " é " + fatorial);
        } else {
            System.out.println("Insira um número inteiro positivo.");
        }
        entrada.close();
    }
}
