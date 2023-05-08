package com.lista6;
import java.util.Scanner;

public class Exercicio1 
{
    public static void main( String[] args ){
        Scanner leia = new Scanner(System.in);
         int idade;
         String nome, cpf;

         System.out.print("Digite seu nome:");
         nome = leia.next();
         if (nome == "") {
            System.out.println(" O nome não pode estar vazio");
        }
        else {
            System.out.println(" Seu nome é válido");
        }
        ///////////////////////////////////////////////////////////////////
         System.out.print("Digite sua idade:");
         idade = leia.nextInt();
         if (idade < 0 || idade > 120) {
            System.out.println("Idade Invalida");
         } else {
            System.out.println("Sua idade Válida");
         }
         //////////////////////////////////////////////////////////////////
         System.out.print("Digite seu CPF (Exemplo 000.000.000-00) :");
         cpf = leia.next();
         leia.close();
         if(cpf.length()!=11){
            System.out.print("CPF inválido");
         }
         else {
            System.out.println("CPF válido");
            }
         }
    
    public String nome(String nome) {
        return nome;
     }
     
     public String cpf(String cpf) {
         return cpf;
     }
     
     
    public int idade(int idade) {
         return idade;
    }
}