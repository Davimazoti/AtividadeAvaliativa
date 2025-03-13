package com.example.Biblioteca.controller;

import com.example.Biblioteca.banco.EmprestimoBanco;
import com.example.Biblioteca.model.Emprestimo;
import com.example.Biblioteca.model.Livro;

import java.util.List;

public class EmprestimoCrontroller {

    EmprestimoBanco repository = new EmprestimoBanco();

    public List<Emprestimo> getAll(){
        return repository.findAll();
    }

    public List<Emprestimo> getByDataFinnal(int dataFinal){
        return repository.findByDataFinal(dataFinal);
    }

    public boolean insertBanco(Emprestimo emprestimo){
        return repository.insert(emprestimo);
    }

    public Emprestimo insertLivro(int idEmprestimo, Livro livro){
        return repository.insertLivros(idEmprestimo, livro);
    }
}
