package set.ordenacaoSet;

import java.util.Objects;

public class Serie implements Comparable<Serie> {
    private String nome;
    private String genero;
    private int tempoEpisodio;

    public Serie(String nome, String genero, int tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getTempoEpisodio() {
        return tempoEpisodio;
    }

    public void setTempoEpisodio(int tempoEpisodio) {
        this.tempoEpisodio = tempoEpisodio;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return tempoEpisodio == serie.tempoEpisodio && Objects.equals(nome, serie.nome) && Objects.equals(genero, serie.genero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoEpisodio);
        }


    @Override
    public int compareTo(Serie o) {
//        if (o.tempoEpisodio < tempoEpisodio){
//            return 1;
//        } else if (o.tempoEpisodio > tempoEpisodio) {
//            return -1;
//        } else {
//            return 0;
//        }
        int temp = Integer.compare(this.getTempoEpisodio(), o.getTempoEpisodio());
        int genero = this.getGenero().compareTo(o.getGenero());
        if (temp != 0) return temp;
        return genero;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", tempoEpisodio=" + tempoEpisodio +
                '}';
    }
}
