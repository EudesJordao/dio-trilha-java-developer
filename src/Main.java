import IPhone.IPhone;

public class Main {
    public static void main(String[] args) {
        IPhone iPhone = new IPhone();

        String url = iPhone.exibirPagina("www.google.com");
        System.out.println(url);
        iPhone.adicionarNovaAba();
        iPhone.atualizarPagina();
        String numero = iPhone.ligar("99999-9999");
        System.out.println(numero);
        iPhone.atender();
        iPhone.iniciarCorreioVoz();
        String musica = iPhone.selecionarMusica("Só uma coisa me satisfaz");
        System.out.println(musica);
        iPhone.tocar();
        iPhone.pausar();
    }
}