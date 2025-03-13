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

    public List<Emprestimo> findByDataFinal(String dataFinal){
        return emprestimos.stream()
                .filter(empres -> empres.getDataFim().equals(dataFinal))
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

public boolean updateCliente(int idEmprestimo, Cliente cliente){
        Emprestimo emprestimoBd = emprestimos.stream()
                .filter(e->e.getIdEmprestimo() == idEmprestimo)
                .findFirst()
                .orElse(null);

        if (emprestimoBd == null){
            return false;
        }

        emprestimoBd.getCliente().setIdCliente(cliente.getIdCliente());
        emprestimoBd.getCliente().setNome(cliente.getNome());
        emprestimoBd.getCliente().setCpf(cliente.getCpf());
        emprestimoBd.getCliente().setTelefone(cliente.getTelefone());
        emprestimoBd.getCliente().setEmail(cliente.getEmail());
        return true;
    }

    public boolean delete(int idEmprestimo){
        Emprestimo emprestimoBd = emprestimos.stream()
                .filter(e -> e.getIdEmprestimo() == idEmprestimo)
                .findFirst()
                .orElse(null);
        emprestimos.remove(emprestimoBd);
        return true;
    }

}
