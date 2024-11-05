package listaVetores;
import java.util.Scanner;
//Fazer um programa para ler 5 valores e, em seguida, mostrar a posic¸ao onde se encon- ˜
//tram o maior e o menor valor
public class v13 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int[] valor = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.printf("Insira o %d valor: ", i + 1);
            valor[i] = ler.nextInt();
        }
        int[] resultado = buscarPosicao(valor);
        System.out.println("Maior valor: " + valor[resultado[0]] + " na posição: " + resultado[0]);
        System.out.println("Menor valor: " + valor[resultado[1]] + " na posição: " + resultado[1]);

    ler.close();

        }
        public static int[] buscarPosicao ( int[] array){
            int maior = 0;
            int menor = 0;

            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[menor]) {
                    menor = i;
                }
                if (array[i] > array[maior]) {
                    maior = i;
                }
            }
            return new int[]{maior, menor};}
    }