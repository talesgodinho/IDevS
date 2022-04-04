package desafio01.application;

import desafio01.util.methodsExamples;

public class Program {

    public static void main(String[] args) {

        String palavra = methodsExamples.inputString();

        System.out.println("A pontuação da palavra " + palavra.toLowerCase() +  " é: " + methodsExamples.calculaPontuacao(palavra) + " pontos");

    }
}
