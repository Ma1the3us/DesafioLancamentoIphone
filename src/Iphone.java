public class Iphone implements NavegadorInternet, ReprodutorMusical, AparelhoTelefonico {

    @Override
    public void exibirPagina(String url) {

    }

    @Override
    public void adicionarNovaAba() {
    }

    @Override
    public void atualizarPagina() {
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada");

    }

    @Override
    public void selecionarMusica(String musica) {

    }

    @Override
    public void ligar(String numero) {

    }

    @Override
    public void atender() {
        System.out.println("Atendendo a ligação");

    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("iniciando correio de voz");

    }
}
