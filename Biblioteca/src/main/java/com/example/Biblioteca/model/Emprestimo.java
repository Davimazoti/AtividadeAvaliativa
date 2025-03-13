package com.example.Biblioteca.model;

import java.util.ArrayList;

public class Emprestimo {

    private Long idEmprestimo;
    private int dataInicio;
    private int dataFim;
    private ArrayList<Livro> livrosEmprestados;
    private Cliente cliente;

    public Emprestimo(Long idEmprestimo, int dataInicio, int dataFim, ArrayList<Livro> livrosEmprestados, Cliente cliente) {
        this.idEmprestimo = idEmprestimo;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.livrosEmprestados = livrosEmprestados;
        this.cliente = cliente;


    }

    public Long getIdEmprestimo() {
        return idEmprestimo;
    }

    public void setIdEmprestimo(Long idEmprestimo) {
        this.idEmprestimo = idEmprestimo;
    }

    public int getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(int dataInicio) {
        this.dataInicio = dataInicio;
    }

    public int getDataFim() {
        return dataFim;
    }

    public void setDataFim(int dataFim) {
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
