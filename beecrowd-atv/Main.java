import java.io.IOException;
import java.util.Scanner; 
public class Main {
    public static void main(String[] args)  { 
        Scanner ler = new Scanner(System.in);
        int[]N= new int[10];
        N[0]=ler.nextInt();
        for(int i=1; i< N.length;i++){
            N[i] = N[i - 1]*2;
        }
        for(int i=0;i< N.length; i++){
            System.out.println("N["+i+"] ="+N[i]);
        }
        ler.close();
    }
}

// FUNCIONOU