import java.util.Scanner;

public class vetores {

    // busca simples linear
    public static int buscaSimples(int[] valor, int k) {
        for (int i = 0; i < valor.length; i++) {
            if (valor[i] == k) {
                return i;  // Retorna a posição se o elemento for encontrado
            }
        }
        return -1;  // Retorna -1 se o elemento não for encontrado no vetor
    }

    // busca melhorada, caso o valor esteja ordenado, feita por binário
    public static int buscaMelhorada(int[] valor, int k){
        int inicio = 0;
        int fim = valor.length - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;

            if (valor[meio] == k) {
                return meio;  // Retorna a posição se encontrar
            }

            if (valor[meio] < k) {
                inicio = meio + 1;  // Procura na metade superior
            } else {
                fim = meio - 1;  // Procura na metade inferior
            }
        }
        return -1;  // Retorna -1 se não encontrar
    
    }
    
    public static void main (String[] args) {

        final int pedido = 10;
        int[] valor = new int[pedido]; 
        Scanner scan = new Scanner(System.in);
        boolean isSorted = true;

        System.out.println("Digite 10 valores inteiros:");
        for (int i = 0; i < pedido; i++) {
            System.out.printf("Digite o %dº número: ", i + 1);
            valor[i] = scan.nextInt();

            // Verifica se o vetor está ordenado
            if (i > 0 && valor[i] < valor[i - 1]) {
                isSorted = false;
            }
        }

        if (isSorted) {
            System.out.println("O vetor está ordenado");
        } else {
            System.out.println("O vetor não está ordenado");
        }

        while (true) {
            System.out.print("Digite o valor que queira buscar (digite -1 para cancelar): ");
            int k = scan.nextInt();

            if (k == -1) {
                System.out.println("Busca cancelada");
                break;
            }

            int numeroBuscado = buscaSimples(valor, k);

            if(isSorted){

            }else{
                // int numeroBuscado = busca(valor, k);
            }

            if (numeroBuscado != -1) {
                System.out.println("Número encontrado na posição: " + numeroBuscado);
            } else {
                System.out.println("Número não encontrado.");
            }
        }
        scan.close();
    }
}
