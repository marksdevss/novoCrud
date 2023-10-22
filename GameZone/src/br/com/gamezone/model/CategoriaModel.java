package br.com.gamezone.model;

public class CategoriaModel {

    int id_categoria;

    String categoria;

    int id_jogo;

    public CategoriaModel() {
    }

    public CategoriaModel(int id_categoria, String categoria, int id_jogo) {
        this.id_categoria = id_categoria;
        this.categoria = categoria;
        this.id_jogo = id_jogo;
    }

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getId_jogo() {
        return id_jogo;
    }

    public void setId_jogo(int id_jogo) {
        this.id_jogo = id_jogo;
    }

    @Override
    public String toString() {
        return getCategoria();
    }

}
