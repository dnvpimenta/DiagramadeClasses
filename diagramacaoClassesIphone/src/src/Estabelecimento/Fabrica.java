package src.Estabelecimento;

import src.Equipamento.Musica.ReproduzirMusica;
import src.Equipamento.Navegador.NavegadorInternet;
import src.Equipamento.Telefone.AparelhoTelefonico;
import src.EquipamentoIphone.EquipamentoIphone;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoIphone iphone = new EquipamentoIphone();
        ReproduzirMusica musica = (ReproduzirMusica) iphone;
        AparelhoTelefonico telefonico = (AparelhoTelefonico) iphone;
        NavegadorInternet internet = (NavegadorInternet) iphone;


        System.out.println("Musica");
        musica.selecionarMusica();
        musica.tocar();
        musica.pausar();

        System.out.println("Telefone");
        telefonico.ligar();
        telefonico.atender();
        telefonico.iniciarCorreioVoz();

        System.out.println("Internet");
        internet.pagina();
        internet.adicionandoNovaPagina();
        internet.atualizaPagina();
    }
}