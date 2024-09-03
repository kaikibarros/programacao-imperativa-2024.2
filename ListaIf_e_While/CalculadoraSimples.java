// Escreva um programa que peça ao usuário dois números inteiros e
// exiba a soma, subtração, multiplicação e divisão (caso o denominador não seja zero).


import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        System.out.println("Olá, eu sou uma calculadora simples!");
                Scanner ler  = new Scanner(System.in);

                int num1;
                int num2;

        System.out.println("digite um número: ");
        num1 = ler.nextInt();
        System.out.println("digite mais um número: ");
        num2 = ler.nextInt();

        String soma, divisao, multiplicacao, subtracao;


        soma = String.valueOf(num1 + num2);
        multiplicacao = String.valueOf(num1 * num2);
        subtracao = String.valueOf(num1 - num2);

        if (num2 != 0) {
            divisao = String.valueOf(num2 / num1);
        } else {
            divisao = "não é possível dividir por zero";
        }
        System.out.println("o resultado da soma é  " + soma);
        System.out.println("o resultado da divisao é: " + divisao);
        System.out.println("o resultado da mulplicacao é: " + multiplicacao);
        System.out.println("o resultado da subtracao é: " + subtracao);
    }
}
