import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
    public static void main (String[] args) throws java.lang.Exception
    {
        number1to100();
        somatodosimpares();
        multiplosde3sem3();
    }
    public static void number1to100() { 
    	
    	System.out.println("Números de 1 até 100:");
        for (int i = 1; i <= 100; i++) {
            if (i > 1) {
                System.out.print(", ");
            }
            System.out.print(i);
        }
        System.out.println();
    }
    public static void somatodosimpares() {
    	System.out.println("Soma de todos os ímpares entre 10 e 1000:");
        int sum = 0;
        for (int i = 11; i < 1000; i += 2) {
            sum += i;
        }
        System.out.println(sum);
    }
    public static void multiplosde3sem3() {
    	System.out.println("Múltiplos de 3 sem contar com o três:");
        boolean first = true;
        for (int i = 3; i < 1000; i += 3) {
            if (i % 10 != 3) {
                if (!first) {
                    System.out.print(", ");
                }
                System.out.print(i);
                first = false;
            }
        }
        System.out.println();
    }
}
