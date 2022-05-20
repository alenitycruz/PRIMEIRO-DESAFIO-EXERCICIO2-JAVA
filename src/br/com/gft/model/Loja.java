package br.com.gft.model;
import java.util.Iterator;
import java.util.List;

public class Loja {
    //ABSTRACAO
    private String nome;
    private String cnpj;
    private List<Livro> livro;
    private List<VideoGame> games;

    //METODOS
    public void Loja() {}

    public Loja(String nome, String cnpj, List<Livro> livro, List<VideoGame> games) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.setLivro(livro);
        this.setGames(games);
    }

    //GETTERS
    public String getNome() {
        return nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public List<Livro> getLivro() {
        return livro;
    }

    public List<VideoGame> getGames() {
        return games;
    }


    //SETTERS
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setLivro(List<Livro> livro) {
        this.livro = livro;
    }

    public void setGames(List<VideoGame> games) {
        this.games = games;
    }

    //METODOS
    public void listaLivros() {if (livro == null) System.out.print("A loja não tem livros no seu estoque.");}

    public void listaVideoGames() { if (games == null) System.out.print("A loja não tem games no seu estoque.");}





    public double calculaPatrimonio() {
        Iterator<Livro> iterator = livro.iterator();
        Double soma1 = 0d;
        while(iterator.hasNext(livro.get(1))){
            Double next = iterator.next();
            soma1 += next;
        }
        Iterator<VideoGame> iterator = games.iterator();
        Double soma2 = 0d;
        while(iterator.hasNext(games.get(1))){
            Double next = iterator.next();
            soma2 += next;
        }
        Double soma = soma1 + soma2;
        return soma;
    }



}
