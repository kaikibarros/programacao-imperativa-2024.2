package listaVetores;

//Faça um programa que preencha um vetor com 10 numeros reais, calcule e mostre a
//quantidade de numeros negativos e a soma dos numeros positivos desse vetor.

import java.util.Random;

public class v11 {
    public static void main(String[] args) {
        Double[] vetor = new Double[10];

        Random preencherAleatorio = new Random();
        for (int i = 0; i < 10; i++) {
            vetor[i] = preencherAleatorio.nextDouble() * 20 -10;
            System.out.printf(" %.2f /", vetor[i]);
            }
            double soma = 0;
            for(double valor : vetor){
                if(valor > 0){
                    soma += valor;
                }
        }
        System.out.printf("%na soma é: %.2f%n", soma);
        int contarNegativo = 0;
        for(double valor : vetor){
            if(valor < 0){
                contarNegativo++;
            }
        }
        System.out.println("a quantidade de números negativos é: " + contarNegativo);
    }

}
