package JAVAPROJECT.assinantes;
import JAVAPROJECT.chamada.Chamada;

 // declarando as variáveis
public class Assinantes {
   private long cpf;
   private String nome;
   private int numCel;
   private int numChamadas;
}

//Criando uma array
   private Chamada[] chamadas;

 //Construtor
   public Assinantes (long cpf, String nome, int numCel, int numChamadas) {
      this.cpf = cpf;
      this.nome = nome;
      this.numCel = numCel;
      this.chamadas = new Chamada[numChamadas];
      this.numChamadas = 0;
   }