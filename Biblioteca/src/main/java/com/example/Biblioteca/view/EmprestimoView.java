package com.example.Biblioteca.view;

import com.example.Biblioteca.controller.EmprestimoCrontroller;
import com.example.Biblioteca.model.Cliente;
import com.example.Biblioteca.model.Emprestimo;
import com.example.Biblioteca.model.Livro;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emprestimo")
public class EmprestimoView {

    EmprestimoCrontroller emprestimoCrontroller = new EmprestimoCrontroller();

    @GetMapping
    public List<Emprestimo> getEmprestimo(@RequestParam(required = false)String dataFinal){
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

    @PutMapping("/{idEmprestimo}/{dataFinal}")
    public Emprestimo update(@RequestBody Emprestimo emprestimo, @PathVariable int idEmprestimo){
        return emprestimoCrontroller.update(idEmprestimo, emprestimo);
    }

    @PutMapping("/{idEmprestimo}/Cliente")
    public boolean update(@PathVariable int idEmprestimo, @RequestBody Cliente cliente){
        return emprestimoCrontroller.updateCliente(idEmprestimo,cliente);
    }

    @DeleteMapping("/{idEmprestimo}")
    public boolean delete(@PathVariable int idEmprestimo){
        return emprestimoCrontroller.delete(idEmprestimo);
    }
}

