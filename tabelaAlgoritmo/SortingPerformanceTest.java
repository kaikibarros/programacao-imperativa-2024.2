package tabelaAlgoritmo;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class SortingPerformanceTest {

    public static void main(String[] args) {
        int[] sizes = {10, 100, 1000, 10000, 100000, 1000000, 10000000};
        long timeLimit = 300000; // 5 minutos em milissegundos

        System.out.println("Running sorting tests...");

        for (int size : sizes) {
            System.out.println("\nVector Size: " + size);

            // Gerar vetores nas diferentes condições
            int[] unorderedArray = generateRandomArray(size);
            int[] ascendingArray = IntStream.range(0, size).toArray();
            int[] descendingArray = IntStream.iterate(size, n -> n - 1).limit(size).toArray();

            // Testar Bubble Sort
            long bubbleSortTime = testSortAlgorithm("Bubble Sort", unorderedArray, ascendingArray, descendingArray, SortingPerformanceTest::bubbleSort, timeLimit);
            if (bubbleSortTime > timeLimit) break;

            // Testar Insertion Sort
            long insertionSortTime = testSortAlgorithm("Insertion Sort", unorderedArray, ascendingArray, descendingArray, SortingPerformanceTest::insertionSort, timeLimit);
            if (insertionSortTime > timeLimit) break;

            // Testar Selection Sort
            long selectionSortTime = testSortAlgorithm("Selection Sort", unorderedArray, ascendingArray, descendingArray, SortingPerformanceTest::selectionSort, timeLimit);
            if (selectionSortTime > timeLimit) break;
        }

        // Aqui você poderia plotar os gráficos com bibliotecas como JFreeChart ou outra biblioteca de gráficos em Java.
    }

    // Método para testar e medir o tempo de execução de cada algoritmo de ordenação
    private static long testSortAlgorithm(String algorithmName, int[] unorderedArray, int[] ascendingArray, int[] descendingArray, SortFunction sortFunction, long timeLimit) {
        System.out.println("\nTesting " + algorithmName + "...");

        long totalExecutionTime = 0;
        int[][] scenarios = {unorderedArray, ascendingArray, descendingArray};
        String[] descriptions = {"Unordered", "Ascending Order", "Descending Order"};

        for (int i = 0; i < scenarios.length; i++) {
            int[] arrayCopy = Arrays.copyOf(scenarios[i], scenarios[i].length);

            long startTime = System.currentTimeMillis();
            sortFunction.sort(arrayCopy);
            long endTime = System.currentTimeMillis();

            long executionTime = endTime - startTime;
            totalExecutionTime += executionTime;

            System.out.printf("%s - %s: %d ms%n", algorithmName, descriptions[i], executionTime);

            // Verificar se o tempo ultrapassou o limite
            if (totalExecutionTime > timeLimit) {
                System.out.printf("%s took too long to execute (>%d ms), halting further tests on this size.%n", algorithmName, timeLimit);
                break;
            }
        }

        return totalExecutionTime;
    }

    // Função para gerar um array aleatório
    private static int[] generateRandomArray(int size) {
        Random rand = new Random();
        return rand.ints(size, 0, size).toArray();
    }

    // Algoritmos de ordenação
    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }

    public static void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    // Interface funcional para permitir a passagem de métodos de ordenação
    @FunctionalInterface
    interface SortFunction {
        void sort(int[] array);
    }
}



// Crie um programa que rode os algoritmos de bubbleSort, insertionSort e selectionSort.
//Você deve imprimir para cada execução, o tempo de execução (em milissegundos) de cada algoritmos de ordenação para
// as seguintes situações:
//ordenar um vetor todo desordenado
//ordenar um vetor todo ordenado (ordem crescente)
//ordenar um vetor todo ordenado (ordem decrescente)
//Você deve criar três gráficos, 1 para cada algoritmo de ordenação, onde o eixo horizontal representa a quantidade
// de elementos do vetor e no eixo vertical o tempo em milissegundos.
//
//Você deve plotar valores para vetor de tamanho 10, 100, 1000, 10000, 100000, 1000000, 10000000, etc.
//
//Você deve parar a execução quando o tempo de execução for maior que 5 minutos, nesta situação, diminua o tamanho do
// vetor pela metade e execute novamente. Repita essa operação até que o programa termine normalmente dentro do tempo
// de 5 minutos. Esse tamanho de vetor e tempo de execução serão os últimos valores a serem plotados em cada gráfico.