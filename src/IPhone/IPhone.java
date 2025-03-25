package IPhone;

import IPhone.Funcionalidades.AparelhoCelular;
import IPhone.Funcionalidades.Navegador;
import IPhone.Funcionalidades.ReprodutorMusical;

public class IPhone implements AparelhoCelular, Navegador, ReprodutorMusical {


    //Aparelho celular
    public String ligar(String numero){
        return "Ligando para: " + numero;
    }

    public void atender(){
        System.out.println("Ligação atendida!");
    }

    public void iniciarCorreioVoz(){
        System.out.println("Gravando mensagem de voz!");
    }

    //Reprodutor Musical

    public void tocar(){
        System.out.println("Tocando música");
    }

    public void pausar(){
        System.out.println("Música pausada");
    }

    public String selecionarMusica(String musica){
        return "Tocando: " + musica;
    }

    //Navegador

    public String exibirPagina(String url){
        return "Acessando: " + url;
    }

    public void adicionarNovaAba(){
        System.out.println("Nova Aba criada!");
    }

    public void atualizarPagina(){
        System.out.println("Página atualizada!");
    }
}
