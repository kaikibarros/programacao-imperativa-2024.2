package desafioAula;

public class main{
    public static void insertionSort (int[] v, int tam){
            int[] numeros = {15,76,89,23,45,67,89};
    for (int i = 0; i < tam; i++) {
        int temp = v[i];
        int desloca = v[i-1];
        while (desloca > 0 && temp < v[desloca]){
            v[desloca+1] = v[desloca];
            --desloca;
        }
        v[desloca+1] =temp;
    System.out.println(numeros[i]);
    }}}