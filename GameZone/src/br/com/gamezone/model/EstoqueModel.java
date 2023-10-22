package br.com.gamezone.model;

public class EstoqueModel {

    private int id_produto;
    private int id_jogo;
    private String nome_jogo;
    private int quantidade;
    private double preco_unitario;

    public EstoqueModel() {
    }

    public EstoqueModel(int id_produto, int id_jogo, String nome_jogo, int quantidade, double preco_unitario) {
        this.id_produto = id_produto;
        this.id_jogo = id_jogo;
        this.nome_jogo = nome_jogo;
        this.quantidade = quantidade;
        this.preco_unitario = preco_unitario;
    }

    public int getId_produto() {
        return id_produto;
    }

    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

    public int getId_jogo() {
        return id_jogo;
    }

    public void setId_jogo(int id_jogo) {
        this.id_jogo = id_jogo;
    }

    public String getNome_jogo() {
        return nome_jogo;
    }

    public void setNome_jogo(String nome_jogo) {
        this.nome_jogo = nome_jogo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco_unitario() {
        return preco_unitario;
    }

    public void setPreco_unitario(double preco_unitario) {
        this.preco_unitario = preco_unitario;
    }

}
