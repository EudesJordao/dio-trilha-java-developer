package map.ordenacaoMap;

public class Livros{
    private String nome;
    private int paginas;

    public Livros( String nome, int paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Livros{" +
                ", nome='" + nome + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}
