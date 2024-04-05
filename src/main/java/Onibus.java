public class Onibus{

  double preco;
  Passageiro[] passager= new Passageiro[10];
  int qtdPassageiros=0;
  double total = 0;

  public Onibus(double p){
    this.preco = p;
  }
  double pagarPassagem(Passageiro passageiro){
    
     passager[qtdPassageiros] = passageiro;
     qtdPassageiros++;
    if(passageiro.estudante){
      total += preco/2;
      return (preco / 2);
    }
    else{
      total += preco;
      return preco;
    }
   
  }

  void listaPassageiros(){
    for(int i=0; i<qtdPassageiros; i++){
      System.out.println(passager[i].nome);
    }
    
  }
  void listaEstudantes(){
    for(int i=0; i<qtdPassageiros; i++){
      if(passager[i].estudante)
      System.out.println(passager[i].nome);
    }

  }
  double totalArrecadado(){
    
    return total;
  }
  
}