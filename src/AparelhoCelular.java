public class AparelhoCelular {
    public static void main(String[] args) throws Exception {
        Iphone iphone = new Iphone();

        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("Imagine");

        iphone.ligar("11999999999");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        iphone.exibirPagina("google.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

    }
}
