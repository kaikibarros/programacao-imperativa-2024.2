import java.util.Scanner;

//   Peça ao usuário que insira seu peso (em kg) e altura (em metros).
//   Calcule e exiba o Índice de Massa Corporal (IMC). Depois,
//   com base no valor do IMC, informe ao usuário se ele está abaixo do peso, peso normal, sobrepeso ou obeso.


public class CalculoImc {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double altura;
        double peso;


        System.out.print("Digite o peso: ");
        peso = entrada.nextDouble();
        System.out.print("Digite o alura: ");
        altura = entrada.nextDouble();

        double imc = peso / (altura * altura);

        System.out.printf("O seu IMC é: %.2f\n", + imc);


        if (imc < 18.5) {
            System.out.println("Você está abaixo do peso.");
        } else if (imc >= 18.5 && imc < 24.9) {
            System.out.println("Você está com peso normal.");
        } else if (imc >= 25 && imc < 29.9) {
            System.out.println("Você está com sobrepeso.");
        } else if (imc >= 30 && imc < 34.9) {
            System.out.println("você está obeso");
        } else {
            System.out.println("não foi possível calcular o IMC, revise seus dados");
        }
    }

    }
