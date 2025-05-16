package list.ordenacaoList;

public class Gato implements Comparable<Gato>{
    private String nome;
    private String cor;
    private int idade;

    public Gato(int idade, String cor, String nome) {
        this.idade = idade;
        this.cor = cor;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                ", cor='" + cor + '\'' +
                ", idade=" + idade +
                '}';
    }


    @Override
    public int compareTo(Gato o) {
        if (o.getIdade() < this.getIdade()){
            return 1;
        } else if (o.getIdade() > this.getIdade()) {
            return -1;
        }
        return 0;
    }
}
