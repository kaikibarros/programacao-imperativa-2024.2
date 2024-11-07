package beecrowdATV.fortuneTeller;
import java.io.IOException;
import java.util.Scanner;
class Main{
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        while (ler.hasNextLine()) {
            String name = ler.nextLine().trim();
            if (!name.isEmpty()) {
                int numeroSorteado = calcularNumeroAleatorio(name);
                System.out.println(numeroSorteado);
            }
        }
        ler.close();
    }
    public static int calcularNumeroAleatorio(String name){
        int total = 0;

        for(char c : name.toCharArray()){
            if(Character.isLetter(c)){
                total += letraToNumero(c);
            }
        }
        while (total > 9){
            int sum = 0;
            while( total > 0){
                sum += total % 10;
                total = total/10;
            }
            total = sum;
        }
        return total;
    }

    public static int letraToNumero(char letra){
        letra = Character.toUpperCase(letra); // converte para maiúscula
        int numero = (letra - 'A' + 1)%9;
        return numero == 0 ? 9 : numero;
    }
}