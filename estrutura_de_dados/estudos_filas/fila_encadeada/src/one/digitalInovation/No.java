package estrutura_de_dados.estudos_filas.fila_encadeada.src.one.digitalInovation;

public class No<T> {

    private T conteudo;
    private estrutura_de_dados.estudos_filas.fila.src.one.digitalInovation.No<T> proximoNo;

    public No() {
        this.proximoNo = null;
    }

    public No(T conteudo) {
        this.conteudo = conteudo;
        this.proximoNo = null;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public estrutura_de_dados.estudos_filas.fila.src.one.digitalInovation.No<T> getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(estrutura_de_dados.estudos_filas.fila.src.one.digitalInovation.No<T> proximoNo) {
        this.proximoNo = proximoNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "conteudo=" + conteudo +
                '}';
    }
}
