package desafio01.util;

import java.util.*;

public class methodsExamples {

    public static String inputString(){

        Scanner input = new Scanner(System.in);

        System.out.println("*———————————————————————————————————————————*");
        System.out.print("Digite uma palavra: ");
        String palavra =  input.nextLine();
        System.out.println("*———————————————————————————————————————————*");

        return palavra.toLowerCase();
    }

    public static int calculaPontuacao(String palavra){
        int pont = 0;

        for (int i=0; i<palavra.length(); i++) {
            pont = pont + retornaValor(palavra.charAt(i));
        }

        return pont;
    }

    private static int retornaValor(char c){

        ArrayList valor1 = new ArrayList();
        ArrayList valor2 = new ArrayList();
        ArrayList valor3 = new ArrayList();
        ArrayList valor4 = new ArrayList();
        ArrayList valor5 = new ArrayList();
        ArrayList valor8 = new ArrayList();
        ArrayList valor10 = new ArrayList();

        valor1.add('a');
        valor1.add('e');
        valor1.add('i');
        valor1.add('o');
        valor1.add('u');
        valor1.add('l');
        valor1.add('n');
        valor1.add('r');
        valor1.add('s');
        valor1.add('t');

        valor2.add('d');
        valor2.add('g');

        valor3.add('b');
        valor3.add('c');
        valor3.add('m');
        valor3.add('p');

        valor4.add('f');
        valor4.add('h');
        valor4.add('v');
        valor4.add('w');
        valor4.add('y');

        valor5.add('k');

        valor8.add('j');
        valor8.add('x');

        valor10.add('q');
        valor10.add('z');


        if(valor1.contains(c)){
            return 1;
        } else if(valor2.contains(c)){
            return 2;
        } else if(valor3.contains(c)){
            return 3;
        } else if(valor4.contains(c)){
            return 4;
        } else if(valor5.contains(c)){
            return 5;
        } else if(valor8.contains(c)){
            return 8;
        } else if(valor10.contains(c)){
            return 10;
        }

        return 0;
    }
}
