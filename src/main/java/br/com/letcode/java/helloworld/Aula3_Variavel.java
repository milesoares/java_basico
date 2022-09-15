package br.com.letcode.java.helloworld;

public class Aula1_Variavel {

        public static void main(String[] args) {
                //System.out.println("Hello World!");

                //var string
                String nome = "Milena";
                System.out.println("Olá, " + nome);

                //var number
                int a;
                int b = 2;
                a = 3;
                int soma = a + b;
                int subtracao = a - b;
                int multiplicacao = a * b;
                float divisao = (float) a / b;

                System.out.println(soma);
                System.out.println(subtracao);
                System.out.println(multiplicacao);
                System.out.println(divisao);
        }
}
