public class aula02{

  //static não precisa criar outro método, é o método para o código todo
  
  public static void main(String[] args) {

    int n1=10,n2=20,n3=30;
    int res= n1+n2+n3;
    int num=100;
    String nome="bruno";
    
    System.out.print("sem quebra de linha");
    System.out.println("com quebra de linha");
    System.out.printf("Canal:%s%nAno:%d", "Curso", 2021);
    System.out.printf("valor da variável num:%d%nNome:%s",num,nome);
  }
}