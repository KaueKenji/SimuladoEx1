import java.io.SequenceInputStream;

public class Main {
  public static void main(String[] args) {

    Passageiro p1 = new Passageiro("João", true);
    Passageiro p2 = new Passageiro("Ana", true);
    Passageiro p3 = new Passageiro("Jorge", false);
    Passageiro p4 = new Passageiro("Amanda", false);

    Onibus o1 = new Onibus(10.00);

    System.out.println(o1.pagarPassagem(p1));
    System.out.println(o1.pagarPassagem(p2));
    System.out.println(o1.pagarPassagem(p3));
    System.out.println(o1.pagarPassagem(p4));
    

    o1.listaPassageiros();
    o1.listaEstudantes();
    System.out.println(o1.totalArrecadado());
  }

}