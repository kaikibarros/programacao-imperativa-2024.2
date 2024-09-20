public class aula03{
  public static void main(String[] args) {
    // if if else ? switch
    // == > < >= <= != ! (true / false)

    

    // tabela verdade AND &&
    /*
    VV = V
    VF = F
    FF = F
    FV = F
    */
    // tabela verdade OR ||
    /*
    VV = V
    VF = V
    FF = F
    FV = V
    */
    int nota=65;
    int faltas= 10;
    int maxFaltas=5;
    int media= 50;
    String res;

    // condição ternária
    res= ((nota>=media && faltas<=maxFaltas) ? "Aprovado" : "Reprovado");
    // res= (faltas > media? 1 : 0);
    System.out.println(res);

    // switch

    int pos=3;
    switch(pos){
      case 1:
        System.out.println("primeiro lugar");
        break;
      case 2:
        System.out.println("segundo lugar");
        break;
      case 3:
        System.out.println("terceiro lugar");
        break;
      case 4: case 5: case 6:
        System.out.println("certificado");
        break;
      default: 
        System.out.println("não est[a no pódio");
        break;
    }

    
    if((nota >= media) && (faltas <= maxFaltas)){
      System.out.println("aprovado");
    }else if (nota >= 40){
      System.out.println("recuperação");
    } else {
      System.out.println("reprovado");
    }
    System.out.println("fim");
  }
}