package set.exerciciosSet;

public class Linguagem implements Comparable<String> {
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
    public int compareTo(String o) {
        return 0;
    }

    @Override
    public String toString() {
        return "Linguagem{" +
                "nome='" + nome + '\'' +
                ", ide='" + ide + '\'' +
                ", ano=" + ano +
                '}';
    }
}
