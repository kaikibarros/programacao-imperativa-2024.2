public class aula05 {
  public static void main (String[] args){
    
    
    // FOR 
    // inicialização, condição, incremento
    for(int cont=0 ; cont == 5; cont++){
      System.out.println("CFB ");
    }
    System.out.print("Fim do programa");

    //WHILE 
    //só precisa da condição no parâmetro;
    int cont=0;
    while(cont <5){
      System.out.println(cont + "CFB");
      cont++;
    }
    System.out.print("Fim do programa");

    // DO-WHILE
    // executa pelo menos uma vez, independente da condição;

    //int cont1 = 0;
    do {
      System.out.println(cont + "CFB");
      cont++;
    }while(cont <=0);
  }
}