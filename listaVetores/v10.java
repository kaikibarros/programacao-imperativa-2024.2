package listaVetores;
import java.util.Scanner;

//Faça um programa para ler a nota da prova de 15 alunos
// e armazene num vetor, calcule e imprima a media geral.

public class v10 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Double[] nota = new Double[15];

        System.out.println("/////Leitor de notas/////");

        for (int i = 0; i < 15; i++) {
            System.out.printf("Insira a %d nota: ", i + 1);
            nota[i] = ler.nextDouble();
            while(nota[i] > 10){
                System.out.println("O valor deve ser menor que 10");
                System.out.printf("Insira a %d nota: ", i + 1);
                nota[i] = ler.nextDouble();
            }
        }

        System.out.printf("a média é: %.2f%n ", calcularMedia(nota));

        ler.close();
    }

    public static double calcularMedia(Double[] notas) {
        double total = 0;
        for (Double nota : notas) {
            total += nota;
        }
        return total/notas.length; // retorna a media
    }
}