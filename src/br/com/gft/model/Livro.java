package br.com.gft.model;

import br.com.gft.interfaces.Imposto;


import java.util.ArrayList;
import java.util.List;

public class    Livro extends Produto implements Imposto {
    //ABSTRACAO
    private String autor;
    private String tema;
    private int qdtPag;


    //METODOS
    public Livro() {}

    public Livro(String nome, double preco, int qtd, String autor, String tema, int qtdPag) {
        this.setNome(nome);
        this.setPreco(preco);
        this.setQtd(qtd);
        this.setAutor(autor);
        this.setTema(tema);
        this.setQdtPag(qtdPag);
    }




    //GETTERS

    public String getAutor() {
        return autor;
    }
    public String getTema() {
        return tema;
    }

    public int getQdtPag() {
        return qdtPag;
    }


    //SETTERS

    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setTema(String tema) {
        this.tema = tema;
    }

    public void setQdtPag(int qdtPag) {
        this.qdtPag = qdtPag;
    }


    @Override
    public void calculaImposto(double imposto) {
        if (tema == "educativo") imposto = preco * 1.0d;
        else imposto = preco * 0.1d;
    }

    //ESTOQUE
    public void estoqueLivros() {
        Livro l1 = new Livro("Harry Potter", 40d, 50, "J. K. Rowling", "fantasia", 300);
        Livro l2 = new Livro("Senhor dos Anéis", 60d, 30, "J. R. R. Tolkien", "fantasia", 500);
        Livro l3 = new Livro("Java POO", 20d, 50, "GFT", "educativo", 500);
        List<Livro> livro = new ArrayList<>();
        livro.add(l1);
        livro.add(l2);
        livro.add(l3);
    }



}
