package com.example.Biblioteca.model;

import java.util.ArrayList;

public class Emprestimo {

    private int idEmprestimo;
    private String dataInicio;
    private String dataFim;
    private ArrayList<Livro> livrosEmprestados;
    private Cliente cliente;

    public Emprestimo(int idEmprestimo, String dataInicio, String dataFim, ArrayList<Livro> livrosEmprestados, Cliente cliente) {
        this.idEmprestimo = idEmprestimo;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.livrosEmprestados = livrosEmprestados;
        this.cliente = cliente;


    }

    public int getIdEmprestimo() {
        return idEmprestimo;
    }

    public void setIdEmprestimo(int idEmprestimo) {
        this.idEmprestimo = idEmprestimo;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    public ArrayList<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public void setLivrosEmprestados(ArrayList<Livro> livrosEmprestados) {
        this.livrosEmprestados = livrosEmprestados;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
