package src.EquipamentoIphone;

import src.Equipamento.Musica.ReproduzirMusica;
import src.Equipamento.Navegador.NavegadorInternet;
import src.Equipamento.Telefone.AparelhoTelefonico;


public class EquipamentoIphone implements ReproduzirMusica, NavegadorInternet, AparelhoTelefonico {
    public void tocar() {
        System.out.println("Reproduzindo musica via Iphone");
    }

    public void pausar() {
        System.out.println("Música Pausada via Iphone");
    }

    public void selecionarMusica() {
        System.out.println("Selecionando musica via Iphone");
    }


    public void pagina() {
        System.out.println("Abrindo pagina via Iphone");
    }

    public void adicionandoNovaPagina() {
        System.out.println("Adicionando nova pagina via Iphone");
    }

    public void atualizaPagina() {
        System.out.println("Atualizando a pagina via Iphone");
    }

    public void ligar() {
        System.out.println("Efetuar uma ligação via Iphone");
    }

    public void atender() {
        System.out.println("Atender ligação via Iphone");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Abrir correio de voz via Iphone");
    }
}