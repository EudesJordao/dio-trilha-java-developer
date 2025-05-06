package principais_implementacoes.stack;

import principais_implementacoes.stack.one.digitalInovation.Celular;

import java.util.Stack;

public class Main {

    public static void main(String[] args){
        Stack<Celular> celulars = new Stack<>();
        celulars.push(new Celular("LG"));
        celulars.push(new Celular("Samsung"));
        celulars.push(new Celular("Apple"));

        System.out.println(celulars);
        System.out.println(celulars.pop());
        System.out.println(celulars);
        System.out.println(celulars.peek());
        System.out.println(celulars);
        System.out.println(celulars.empty());
    }
}
