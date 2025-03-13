package com.example.Biblioteca.view;

import com.example.Biblioteca.controller.EmprestimoCrontroller;
import com.example.Biblioteca.model.Emprestimo;
import com.example.Biblioteca.model.Livro;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emprestimo")
public class EmprestimoView {

    EmprestimoCrontroller emprestimoCrontroller = new EmprestimoCrontroller();

    @GetMapping
    public List<Emprestimo> getEmprestimo(@RequestParam(required = false)Integer dataFinal){
        if (dataFinal != null){
            return emprestimoCrontroller.getByDataFinnal(dataFinal);
        }
        else {
            return emprestimoCrontroller.getAll();
        }
    }

    @PostMapping
    public boolean insert(@RequestBody Emprestimo emprestimo){
        return emprestimoCrontroller.insertBanco(emprestimo);
    }

    @PostMapping("/{idEmprestimo}/livro")
    public String insertLivro(@RequestBody Livro livro, @PathVariable Integer idEmprestimo){
        return emprestimoCrontroller.insertLivro(idEmprestimo,livro).toString();
    }
}

