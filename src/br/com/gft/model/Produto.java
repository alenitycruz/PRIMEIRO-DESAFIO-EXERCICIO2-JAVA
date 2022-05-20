package br.com.gft.model;

public abstract class Produto {
    //ABSTRACAO
    protected String nome;
    protected double preco;
    protected int qtd;

    //METODO
    public Produto() {}

    public Produto(String nome, double preco, int qdt) {
        this.setNome(nome);
        this.setPreco(preco);
        this.setQtd(qtd);
    }


    //GETTERS
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQtd() {
        return qtd;
    }


    //SETTERS
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
}
