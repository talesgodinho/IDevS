package desafio01.application;

import desafio01.util.MethodsExamples;

public class Program {

    public static void main(String[] args) {

        String palavra = MethodsExamples.inputString();

        System.out.println("A pontuação da palavra " + palavra.toLowerCase() +  " é: " + MethodsExamples.calculaPontuacao(palavra) + " pontos");

    }
}
