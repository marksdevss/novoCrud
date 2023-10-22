package br.com.gamezone.model;


public class GameModel {

    private int id_jogo;
    private String nome;
    private String descricao;
    private String data_cadastro;
    private Double preco;
    private int estoque;

    public GameModel() {
    }

    public GameModel(int id_jogo, String nome, String descricao, String data_cadastro, Double preco, int estoque) {
        this.id_jogo = id_jogo;
        this.nome = nome;
        this.descricao = descricao;
        this.data_cadastro = data_cadastro;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getData_cadastro() {
        return data_cadastro;
    }

    public void setData_cadastro(String data_cadastro) {
        this.data_cadastro = data_cadastro;
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
