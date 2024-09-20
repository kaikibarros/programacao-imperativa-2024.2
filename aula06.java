//vetores ou arrays
import java.util.Scanner;

public class aula06{
  public static void main(String[] args){
   // int n1,n2,n3,n4,n5; isso é a mesma coisa do debaixo
    //constante
    // final int TAM=5;
    // int[] num= new int[TAM];
    // int[] numeros= {10,20,30,40,50};
    // num[0] =10;
    // num[1] =5;
    // num[2] =7;
    // num[3] =8;
    // num[4] =2;
    // for(int i =0; i<numeros.length; i++){
    //   System.out.printf("%d -", numeros[i]);
    // }
    // System.out.printf("%d -", numeros[2]);
    // System.out.println(num[3]);

  final int TAM=5;
  char[] gabarito={'a','a','d','b','c'};
  char[] respostas=new char[TAM];
  int nota=0;
  Scanner scan=new Scanner(System.in);

    respostas[0]='a';
    respostas[1]='c';
    respostas[2]='d';
    respostas[3]='b';
    respostas[4]='c';

    for(int i=0; i<TAM; i++){
      System.out.printf("informe a resposta d%:", i);
      respostas[i]=scan.nextLine().charAt(0);
    }
    
    for(int i=0; i<TAM; i++){
    if(respostas[i]==gabarito[i]){
      nota++;
    }
   }
    System.out.printf("nota do aluno: %d", nota);
  }
}