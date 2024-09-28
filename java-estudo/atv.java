import java.util.Scanner;

public class atv{
    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        final int TAM = 16;

        System.out.println("digite um número inteiro: ");
        int valorIn = scan.nextInt();
    
        int num =valorIn;
        while(num != 0){
            System.out.println(num % 2);
            num /= 2;

            // preencherVetorBinario(binario2, num2);
            // imprimirVetor(binario2);

            public static void preencherVetorBinario(int[], vetor, int num {
                for (int i = vetor.length -1; i>= 0; i--){
                    vetor[i] = num % 2;
                    num /=2;
                }
            }
            public static void somarBinario(int[],vetor, int num {
                
            }
        }
    }
}