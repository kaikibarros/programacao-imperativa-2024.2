
import java.sql.SQLOutput;
public class vetoraula{
   public static void main(String[] args) {
       // gerar 2 binários e exibir a soma

           final int TAM = 16;
               int[] binario1 = new int[TAM];
               int[] binario2 = new int[TAM];
               int num1 = 1323;
               int num2 = 937;
               preencherVetorBinario(binario1, num1);
               imprimirVetor(binario1);
               preencherVetorBinario(binario2, num2);
               imprimirVetor(binario2);
               //imprimir3Vetor();
           }

           public static void preencherVetorBinario(int[] vetor, int num) {
               for (int i = vetor.length - 1; i >= 0; i--) {
                   vetor[i] = num % 2;
                   num /= 2;
               }
               if (num != 0) {
                   System.out.println("Erro: não deu para representar " + num);
               }
           }

           public static void imprimirVetor(int[] vetor) {
               for (int i = 0; i < vetor.length; i++) {
                   System.out.print(vetor[i] + " ");
               }
               System.out.println();
           }
           public static void imprimir3Vetor(int[] vetor){
               int valorAtual = 0;
            //    int va1=0;
               //soma = vetor1[i]+ vetor2[i]+ vai1;

               for (int i =0; i < vetor.length; i++ ){
                   switch( valorAtual) {
                    //    case 1: soma == 0
                    //            valorAtual = 0; vai1 = 0;
                    //            break;
                    //    case 2: soma == 0
                    //    break;
                   }
                //    System.out.println(vetor[i] + binario1 + binario2);
               };
       }
}
