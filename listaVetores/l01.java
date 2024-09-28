package listaVetores;


// Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7.
// (b) Armazene em uma variavel inteira (simples) a soma entre os valores das posic¸ ´ oes ˜
// A[0], A[1] e A[5] do vetor e mostre na tela esta soma.
// (c) Modifique o vetor na posic¸ao 4, atribuindo a esta posic¸ ˜ ao o valor 100. ˜
// (d) Mostre na tela cada valor do vetor A, um em cada linha.

public class l01 {
    public static void main (String[] args){
        int[] A = {1,0,5,-2,-5, 7};

        int soma = A[0] + A[1] + A[5];
        System.out.printf("a soma é %d%n", soma);

        A[4] = 100;

        for(int i =0; i < A.length; i++) {
            System.out.println(A[i]);
        }
} 
    }
   
