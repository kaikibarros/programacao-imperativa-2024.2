package vetoresOrdenados;
import java.util.Random;
import java.util.Arrays;

public class main {
    public static void main(String[] args){
        int[] v =  new int[50];

        Random aleatorio = new Random();
        for (int i = 0; i < 50; i++){
             //logica que utilizei para imprimir do 1 até o 10
            v[i] = aleatorio.nextInt(10)+1;
        }
        System.out.println(Arrays.toString(v));

        bubblesort(v, v.length);

        System.out.println(Arrays.toString(v));
        
        int menor = Arrays.stream(v).min().orElseThrow();
        int maior = Arrays.stream(v).max().orElseThrow();
        // orElseThrow =  é usado para recuperar o valor, se presente, ou lançar uma exceção se o valor estiver ausente

        System.out.println(maior);
        System.out.println(menor);
       }  
     public static void bubblesort (int vet[], int n){
        int i, j, tmp;
        for (i = 0; i < n-1; i++)
        for( j = n-1; j > i; j--){
            if(vet[j] < vet[j-1]){
                tmp= vet[j-1];
                vet[j -1] = vet[j];
                vet[j] = tmp;
            }
        }
    }
}



// Imprima a mediana deste vetor (OBS: não pode utilizar nenhum comando de repetição (laço) nesta questão)
// Imprima uma listagem onde cada linha tem um valor que está no vetor e a quantidade de vezes que esse valor aparece no vetor
// Crie um novo vetor que não tenha valores repetidos (OBS: você deve criar esse vetor do tamanho exato necessário)
// OBS: a entrega deve ser realizada anexando um arquivo .java e um print screen (ou vários) mostrando o resultado da execução do seu programa

/////////FEITOOO//////////////////
// Crie um vetor de tamanho 50 e preencha com valores aleatórios entre 1 e 10 
// Ordene esse vetor utilizando o algoritmo do bubble sort
// Imprima o menor e maior valor deste vetor (OBS: não pode utilizar nenhum comando de repetição (laço) nesta questão)