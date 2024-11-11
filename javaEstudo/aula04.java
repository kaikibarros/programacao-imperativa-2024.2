import java.util.Scanner;

public class aula04 {
  public static void main(String[] args){
   // scanner é uma classe e oq eu nomeio é o objeto
    // system.in ler oq vem do teclado
    
    Scanner sc = new Scanner(System.in);
    String nome="";
    int num1=0, num2=0,res=0;
    // constante: final int MEDIA=60;


    // pq o meu sout não vai pro terminal?
    System.out.print("digite o seu nome: ");
    nome=sc.nextLine();

    
    System.out.print("Digite o primeiro número: ");
    num1 = sc.nextInt();
    System.out.print("Digite o segundo número: ");
    num2 = sc.nextInt();
    res= num1+num2;
    System.out.printf("$s A soma de %d com %d é: %d",nome,num1,num2,res); 

    sc.close();
  }
}