package com.example.Biblioteca.banco;

import com.example.Biblioteca.model.Cliente;
import com.example.Biblioteca.model.Emprestimo;
import com.example.Biblioteca.model.Livro;

import java.util.ArrayList;
import java.util.List;

public class EmprestimoBanco {

    private List<Emprestimo> emprestimos;

    public EmprestimoBanco(){
        this.emprestimos = new ArrayList<>();
    }

    public List<Emprestimo> findAll(){
        return new ArrayList<>(emprestimos);
    }

    public List<Emprestimo> findByDataFinal(int dataFinal){
        return emprestimos.stream()
                .filter(empres -> empres.getDataFim() == dataFinal )
                .toList();
    }

    public boolean insert(Emprestimo emprestimo){
        emprestimos.add(emprestimo);
        return true;
    }

    public Emprestimo insertLivros(int idEmprestimo, Livro livro){
        Emprestimo emprestimoBd = emprestimos. stream()
                .filter(e -> e.getIdEmprestimo()==idEmprestimo)
                .findFirst()
                .orElse(null);

        if (emprestimoBd == null){
            return null;
        }
        emprestimoBd.getLivrosEmprestados().add(livro);

        return emprestimoBd;
    }

public boolean update(int idEmprestimo, Emprestimo emprestimo){
    Emprestimo emprestimoBd = emprestimos.stream()
            .filter(c -> c.getIdEmprestimo() == idEmprestimo)
            .findFirst()
            .orElse(null);

    if (emprestimoBd == null){
        return false;
    }
    emprestimoBd.setDataFim(emprestimo.getDataFim());
    return true;
}

public boolean updateCliente(int idEmprestimo, int idCliente, Cliente cliente){
        Emprestimo emprestimoBd = emprestimos.stream()
                .filter(e->e.getIdEmprestimo()==idEmprestimo)
                .findFirst()
                .orElse(null);

        if (emprestimoBd == null){
            return false;
        }

        Cliente clienteBd = emprestimoBd.getCliente();
        clienteBd.setIdCliente(cliente.getIdCliente());
        clienteBd.setCpf(cliente.getCpf());
        clienteBd.setEmail(cliente.getEmail());
        clienteBd.setNome(cliente.getNome());
        clienteBd.setTelefone(cliente.getTelefone());
        return true;
    }

}
