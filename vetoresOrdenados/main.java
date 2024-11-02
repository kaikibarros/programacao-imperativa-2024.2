package vetoresOrdenados;
import java.util.Random;
import java.util.Arrays;

public class main {
    public static void main(String[] args){
        int[] v =  new int[50];

        Random aleatorio = new Random();
        for (int i = 0; i < 50; i++){   
            v[i] = aleatorio.nextInt(10)+1;//logica que utilizei para imprimir do 1 até o 10
        }
        System.out.println(" Vetor Original: ");
        System.out.println(Arrays.toString(v));

        System.out.println(" Vetor Ordenado: ");
        bubblesort(v, v.length);

        System.out.println(Arrays.toString(v));
        System.out.println(" ");
        System.out.printf("Exibição de maior e menor valor: %n");
        exibirMaiorEMenorValor(v);
        
        
        System.out.printf("%nExibição da Mediana %n");
        double mediana= Mediana(Arrays.stream(v).asDoubleStream().toArray());
        System.out.println("Mediana: " + mediana);

        System.out.printf("%nQuantidade de valores em um vetor: %n");
        imprimirContagem(v);

        //imprimir valores únicos do vetor 
        int[] unico = vetorValorUnico(v);
        System.out.printf("%nVetor de valores únicos: ");
        System.out.println(Arrays.toString(unico));

       }  
       public static void exibirMaiorEMenorValor(int[] v) {
        int menor = Arrays.stream(v).min().orElseThrow();
        int maior = Arrays.stream(v).max().orElseThrow();
        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
         // orElseThrow =  é usado para recuperar o valor, se presente, ou lançar uma exceção se o valor estiver ausente

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
    public static double Mediana(double[] v){
        int mediana = v.length/2;
        if(v.length%2 ==1) {
            return v[mediana];
        } else{
            return (v[mediana -1] + v[mediana]) / 2;     
        }
    }
    public static void imprimirContagem(int[] v){
        int[] valorUnico = Arrays.stream(v).distinct().toArray();
        for (int val : valorUnico) {
            int count = (int) Arrays.stream(v).filter(x -> x == val).count();
            System.out.println("Valor: " + val + " / Quantidade: " + count );
        }
    }
    public static int[] vetorValorUnico(int[] v) {
        return Arrays.stream(v).distinct().toArray();
    }
}


// OBS: a entrega deve ser realizada anexando um arquivo .java e um print screen (ou vários) mostrando o resultado da execução do seu programa

/////////FEITOOO//////////////////
// Crie um vetor de tamanho 50 e preencha com valores aleatórios entre 1 e 10 
// Ordene esse vetor utilizando o algoritmo do bubble sort
// Imprima o menor e maior valor deste vetor (OBS: não pode utilizar nenhum comando de repetição (laço) nesta questão)
// Imprima a mediana deste vetor (OBS: não pode utilizar nenhum comando de repetição (laço) nesta questão)
// Imprima uma listagem onde cada linha tem um valor que está no vetor e a quantidade de vezes que esse valor aparece no vetor
// Crie um novo vetor que não tenha valores repetidos (OBS: você deve criar esse vetor do tamanho exato necessário)