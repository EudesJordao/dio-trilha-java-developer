package estrutura_de_dados.pilhas_em_java.pilha_java.src;

import estrutura_de_dados.pilhas_em_java.pilha_java.src.one.digitalInnovation.Pilha;
import estrutura_de_dados.pilhas_em_java.pilha_java.src.one.digitalInnovation.No;

public class Main {
    public static void main(String[] args) {
        Pilha minhaPilha = new Pilha();
        No no1 = new No(1);
        No no2 = new No(2);
        No no3 = new No(3);
        No no4 = new No(4);
        No no5 = new No(5);
        No no6 = new No(6);

        minhaPilha.push(no1);
        minhaPilha.push(no2);
        minhaPilha.push(no3);
        minhaPilha.push(no4);
        minhaPilha.push(no5);
        minhaPilha.push(no6);

        minhaPilha.pop();
        minhaPilha.pop();


        System.out.println(minhaPilha.top());
    }
}