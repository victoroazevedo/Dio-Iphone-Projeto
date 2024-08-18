package iphone;

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void tocar() {
        System.out.println("Tocando música");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música");
    }

    @Override
    public void proximaFaixa() {
        System.out.println("Próxima faixa");
    }

    @Override
    public void fazerChamada(String numero) {
        System.out.println("Chamando " + numero);
    }

    @Override
    public void encerrarChamada() {
        System.out.println("Encerrando chamada");
    }

    @Override
    public void atenderChamada() {
        System.out.println("Atendendo chamada");
    }

    @Override
    public void abrirPagina(String url) {
        System.out.println("Abrindo página " + url);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }

    @Override
    public void adicionarAosFavoritos(String url) {
        System.out.println("Adicionando página " + url + " aos favoritos");
    }

    // Método principal para testar a classe iPhone
    public static void main(String[] args) {
        iPhone meuIphone = new iPhone();

        meuIphone.tocar();
        meuIphone.pausar();
        meuIphone.proximaFaixa();

        meuIphone.fazerChamada("123-456-7890");
        meuIphone.atenderChamada();
        meuIphone.encerrarChamada();

        // Testando NavegadorInternet
        meuIphone.abrirPagina("https://www.exemplo.com");
        meuIphone.atualizarPagina();
        meuIphone.adicionarAosFavoritos("https://www.exemplo.com");
    }
}