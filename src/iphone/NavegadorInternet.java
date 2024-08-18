package iphone;

public interface NavegadorInternet {
    void abrirPagina(String url);
    void atualizarPagina();
    void adicionarAosFavoritos(String url);
}