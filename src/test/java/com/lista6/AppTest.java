package com.lista6;
import org.junit.Test;

public class AppTest 
{

    @Test
     public void testeExercicio1() {
      Exercicio1 app = new Exercicio1();
      String nome = app.nome("Joao");
      String cpf = app.cpf("111.111.111-11");
      int idade = app.idade(20);
      System.out.println(nome+" " + cpf +" "+ idade);
}
}
