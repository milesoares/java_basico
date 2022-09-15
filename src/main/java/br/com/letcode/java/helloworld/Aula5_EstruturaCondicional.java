package br.com.letcode.java.helloworld;

public class Aula3_EstruturaCondicional {

    public static void main(String[] args) {

        /*int notaDoAluno = 70;

        //se nota é maior ou igual 70, então aprovado
        //if-else
        if (notaDoAluno >= 70) {
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Não aprovado.");
        }*/

        int nota = 100;
        String graduacao;

        if (nota >= 80) {
            graduacao = "A";
        } else if (nota < 80 && nota >= 70) {
            graduacao = "B";
        } else if (nota < 70 && nota >= 60) {
            graduacao = "C";
        } else if (nota < 60 && nota >= 0) {
            graduacao = "D";
        } else {
            graduacao = "";
        }

        switch (graduacao) {
            case "A":
            case "B":
                System.out.println("Aluno aprovado!");
                break;
            case "C":
            case "D":
                System.out.println("Não aprovado.");
                break;
            default:
                System.out.println("Graduação inválida.");
        }
    }
}
