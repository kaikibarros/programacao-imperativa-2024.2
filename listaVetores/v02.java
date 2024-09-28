package listaVetores;
import java.util.Scanner;

public class v02 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int[] A = new int[6];

        System.out.println("Digite 6 números inteiros");
        for(int i =0; i < 6; i++) {
        System.out.print("Número " + (i +1) + ": ");
        A[i] = ler.nextInt();
        
        }
       
        System.out.print("os valores foram: ");
        for(int i=0; i<A.length; i++){
            System.out.print(A[i]+"/ ");
        }
        ler.close();
    }
}
