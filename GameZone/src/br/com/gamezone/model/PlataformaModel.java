package br.com.gamezone.model;

public class PlataformaModel {

    int id_plataforma;

    String plataforma;

    int id_jogo;

    public PlataformaModel() {
    }

    public PlataformaModel(int id_plataforma, String plataforma, int id_jogo) {
        this.id_plataforma = id_plataforma;
        this.plataforma = plataforma;
        this.id_jogo = id_jogo;
    }

    public int getId_plataforma() {
        return id_plataforma;
    }

    public void setId_plataforma(int id_plataforma) {
        this.id_plataforma = id_plataforma;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public int getId_jogo() {
        return id_jogo;
    }

    public void setId_jogo(int id_jogo) {
        this.id_jogo = id_jogo;
    }

    @Override
    public String toString() {
        return getPlataforma();
    }

    
    
}
