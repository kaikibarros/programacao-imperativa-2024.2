import java.io.IOException;
import java.util.Scanner; 




public class Main {

    public static void main(String[] args)  { 
        Scanner ler = new Scanner(System.in);

        int[] N = new int[10];
        
        System.out.print("iNSIRA UM NÚMEIRO: ")
        N[0] = ler.nextInt();

        System.out.println("Digite um número inteiro: ");
        for(int i = 0; i < N.length; i++){
            N[i] = N[i -1] * 2;
        }
       
        System.out.println("Resultante:");
        // N = ler.nextInt(); 
        for(int i = 0; i < N.length; i++){
            System.outprintln("N[" , i , "] =" , N[i]);
        }
        ler.close();


    }
 
}