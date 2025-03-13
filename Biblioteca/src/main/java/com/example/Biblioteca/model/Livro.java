package com.example.Biblioteca.model;

public class Livro {

    private Long idLivro;
    private String nome;
    private String autor;
    private String genero;

    public Livro(Long idLivro, String nome, String autor, String genero) {
        this.idLivro = idLivro;
        this.nome = nome;
        this.autor = autor;
        this.genero = genero;
    }

    public Long getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(Long idLivro) {
        this.idLivro = idLivro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
