package br.com.gamezone.model;

public class GerenteModel {

    private int id_gerente;

    private String usuario;

    private String senha;

    public GerenteModel() {
    }

    public GerenteModel(int id_gerente, String usuario, String senha) {
        this.id_gerente = id_gerente;
        this.usuario = usuario;
        this.senha = senha;
    }

    public int getId_gerente() {
        return id_gerente;
    }

    public void setId_gerente(int id_gerente) {
        this.id_gerente = id_gerente;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
