// Peça ao usuário para inserir um número inteiro e exiba a tabuada desse número de 1 a 10.

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner entrada  = new Scanner(System.in);


        System.out.print("Informe um número inteiro: ");
        int numero = entrada.nextInt();

        System.out.println("Tabuada do " + numero + ": ");

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + "x" + i + " = " + (numero * i));
        }
        entrada.close();
    }
}
