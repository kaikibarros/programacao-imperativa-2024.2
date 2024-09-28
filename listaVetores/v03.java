package listaVetores;
import java.util.Scanner;

public class v03 {
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        double[] numeros = new double[10];
        double[] quadrados = new double[10];

        System.out.println("Digite 10 números reais: ");
        for(int i= 0; i < 10; i++){ 
            //retorna a quantidade de caracteres que a compõe. 
            System.out.println("Número" + (i + 1) + ": ");
            numeros[i] = ler.nextDouble();
            quadrados[i] = numeros[i] * numeros[i];
        }

        System.out.println("\nNúmeros lidos:");
        for (double num : numeros) {
            System.out.println(num);}


            System.out.println("\nQuadrados dos números:");
        for (double quad : quadrados) {
            System.out.println(quad);}

        ler.close();
        // entender oq siginifica o : no for
        // inicio,condição,  incremento
        // organizar
        }
    }
