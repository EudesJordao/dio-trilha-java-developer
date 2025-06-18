package set.exerciciosSet;

import java.util.Comparator;

public class Linguagem implements Comparable<Linguagem>{
    private String nome;
    private String ide;
    private int ano;

    public Linguagem(String nome, String ide, int ano) {
        this.nome = nome;
        this.ide = ide;
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIde() {
        return ide;
    }

    public void setIde(String ide) {
        this.ide = ide;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }


    @Override
    public String toString() {
        return "Linguagem{" +
                "nome='" + nome + '\'' +
                ", ide='" + ide + '\'' +
                ", ano=" + ano +
                '}';
    }


    @Override
    public int compareTo(Linguagem o) {
        return this.getNome().compareTo(o.getNome());
    }
}
