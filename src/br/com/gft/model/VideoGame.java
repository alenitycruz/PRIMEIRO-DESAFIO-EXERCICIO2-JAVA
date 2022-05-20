
package br.com.gft.model;

import br.com.gft.interfaces.Imposto;
import br.com.gft.model.Produto;

import java.util.ArrayList;
import java.util.List;

public class VideoGame extends Produto implements Imposto{
    //ABSTRACAO
    private String marca;
    private String modelo;
    private boolean isUsado;



    //METODOS

    public VideoGame() {}
    public VideoGame(String nome, double preco, int qtd, String marca, String modelo, boolean isUsado) {
        this.setNome(nome);
        this.setPreco(preco);
        this.setQtd(qtd);
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setUsado(isUsado);
    }


    //GETTERS

    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }

    public boolean isUsado() {
        return isUsado;
    }


    //SETTERS

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setUsado(boolean usado) {
        isUsado = usado;
    }


    @Override
    public void calculaImposto(double imposto) {
        if (isUsado == true) imposto = preco * 0.25d;
        else imposto = preco * 0.45d;
    }

    //ESTOQUE
    public void estoqueVideoGames() {
        VideoGame ps4 = new VideoGame("PS4", 1800d, 100, "Sony", "Slim", false);
        VideoGame ps4Usado = new VideoGame("PS4", 1000d, 7, "Sony", "Slim", true);
        VideoGame xbox = new VideoGame("XBOX", 1500d, 500, "Microsoft", "One", false);

        List<VideoGame> games = new ArrayList<>();
        games.add(ps4);
        games.add(ps4Usado);
        games.add(xbox);
    }

}
