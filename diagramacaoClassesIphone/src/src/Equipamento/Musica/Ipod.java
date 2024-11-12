package src.Equipamento.Musica;

public class Ipod implements ReproduzirMusica {
   public void tocar() {
        System.out.println("Tocando musica");
    }

    public void pausar() {
        System.out.println("Pause");
    }

    public void selecionarMusica() {
        System.out.println("Selecionar musica");
    }
}