package br.com.gamezone.model;

import java.util.Date;

public class GameModel {

    private int id_jogo;
    private String nome;
    private String genero;
    private String descricao;
    private String data_compra;
    private String desenvolvedora;
    private String plataformas;
    private String Avaliacao;
    private Double preco;
    private int estoque;

    public GameModel() {
    }

    public GameModel(int id_jogo, String nome, String genero, String descricao, String data_compra, String desenvolvedora, String plataformas, String Avaliacao, Double preco, int estoque) {
        this.id_jogo = id_jogo;
        this.nome = nome;
        this.genero = genero;
        this.descricao = descricao;
        this.data_compra = data_compra;
        this.desenvolvedora = desenvolvedora;
        this.plataformas = plataformas;
        this.Avaliacao = Avaliacao;
        this.preco = preco;
        this.estoque = estoque;
    }

    public int getId_jogo() {
        return id_jogo;
    }

    public void setId_jogo(int id_jogo) {
        this.id_jogo = id_jogo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getData_compra() {
        return data_compra;
    }

    public void setData_compra(String data_compra) {
        this.data_compra = data_compra;
    }

    public String getDesenvolvedora() {
        return desenvolvedora;
    }

    public void setDesenvolvedora(String desenvolvedora) {
        this.desenvolvedora = desenvolvedora;
    }

    public String getPlataformas() {
        return plataformas;
    }

    public void setPlataformas(String plataformas) {
        this.plataformas = plataformas;
    }

    public String getAvaliacao() {
        return Avaliacao;
    }

    public void setAvaliacao(String Avaliacao) {
        this.Avaliacao = Avaliacao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

}
