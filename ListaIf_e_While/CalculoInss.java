import java.util.Scanner;

// Peça ao usuário para inserir seu salário bruto.
// Calcule o valor de contribuição ao INSS com base nas alíquotas vigentes.
// Exiba o valor da contribuição e o salário líquido.



public class CalculoInss {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


        System.out.println("Insira o seu salário bruto: ");
        double salarioBruto = entrada.nextDouble();

        double[] faixas = {1320.00,2571.29, 3856.94, 7507.49};
        double[] aliquotas = {0.075, 0.09, 0.12, 0.14};

        double contribuicaoInss = 0.0;
        double salarioRestante = salarioBruto;

        int i = 0; // iniciando contador

        while (i < faixas.length && salarioRestante > 0 ) {
            double faixa = faixas[i];
            double aliquota = aliquotas[i];

            if (salarioRestante > faixa) {
                contribuicaoInss += faixa * aliquota;
                salarioRestante -= faixa;
            } else if (salarioRestante < faixa) {
                contribuicaoInss += salarioRestante * aliquota;
                salarioRestante = 0;
            } else {
                System.out.println("erro ao calcular o valor da contribuição e salário líquido");
            }
            i++;
        }

        if (salarioRestante > faixas.length - 1) {
            contribuicaoInss += (salarioBruto - faixas[faixas.length - 1] * aliquotas[aliquotas.length - 1]);
        }

            double salarioLiquido = salarioBruto - contribuicaoInss;
            System.out.println(contribuicaoInss);
            System.out.println(salarioLiquido);
        }
}

//7,5% para salários até R$ 1.320,00
//9% para a parte do salário entre R$ 1.320,01 e R$ 2.571,29
//12% para a parte do salário entre R$ 2.571,30 e R$ 3.856,94
//14% para a parte do salário entre R$ 3.856,95 e R$ 7.507,49








