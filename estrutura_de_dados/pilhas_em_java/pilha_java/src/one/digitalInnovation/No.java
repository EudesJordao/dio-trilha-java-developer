package estrutura_de_dados.pilhas_em_java.pilha_java.src.one.digitalInnovation;

public class No {

    private int dado;
    private  No refNo = null;

    public No() {}

    public No(int dado) {
        this.dado = dado;
    }


    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public No getRefNo() {
        return refNo;
    }

    public void setRefNo(No refNo) {
        this.refNo = refNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "dado=" + dado +
                '}';
    }
}
