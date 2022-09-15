package br.com.letcode.java.helloworld;

public class Aula2_OperadorTabela {
    public static void main(String[] args) {

        boolean resultado = false;
        System.out.println(resultado);

        //operadores lógicos para ir a praia
        boolean fimDeSemana = true;
        boolean fazendoSol = true;

        boolean vamosAPraia = fimDeSemana && fazendoSol;
        System.out.println(vamosAPraia);

        //*TABELA VERDADE*//

        // Operador && (AND)
        // true && true = true
        // true && false = false
        // false && true = false
        // false && false = false

        // Operador || (OR)
        // true || true = true
        // true || false = true
        // false || true = true
        // false || false = false

        // Operador ternário

        ///três termos o primeiro sendo avaliado, por isso a interrrogação
        ///o segundo termo é o valor caso o resultado seja verdadeiro
        ///terceiro termo é o valor caso seja falso

        String mensagem = fimDeSemana ? "É fim de semana." : "Não é fim de semana.";
        System.out.println(mensagem);
    }
}
