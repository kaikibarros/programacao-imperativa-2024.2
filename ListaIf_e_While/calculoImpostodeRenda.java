import java.util.Scanner;

public class calculoImpostodeRenda {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o seu salário bruto: ");
        double salario = entrada.nextDouble();

        double[] faixas = {22847.76, 33919.80, 45012.60, 55976.16};
        double[] aliquotas = {0.075, 0.15, 0.225, 0.275};

        double imposto = 0.0;
        double salarioRestante = salario;
        int i = 0;

        while (i < faixas.length) {
            double limiteFaixa = faixas[i];
            double aliquota = aliquotas[i];

            if (salarioRestante > limiteFaixa) {
                imposto += (limiteFaixa - (i > 0 ? faixas[i - 1] : 0)) * aliquota;
            } else {
                imposto += (salarioRestante - (i > 0 ? faixas[i - 1] : 0)) * aliquota;
                break;
            }
            i++;
        }

        // Para salários acima da última faixa
        if (salarioRestante > faixas[faixas.length - 1]) {
            imposto += (salarioRestante - faixas[faixas.length - 1]) * aliquotas[aliquotas.length - 1];
        }

        System.out.printf("O imposto de renda devido é: R$ %.2f%n", imposto);

        entrada.close();
    }
}

//  Peça ao usuário para inserir seu salário bruto.
//  Calcule o valor do imposto de renda na fonte descontado no seu salário
//  conforme as alíquotas vigentes.