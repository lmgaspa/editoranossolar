package com.dianaglobal.Editora.Nosso.Lar.controller;

import com.dianaglobal.Editora.Nosso.Lar.dto.LivroDTO;
import com.dianaglobal.Editora.Nosso.Lar.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/livros")
public class LivroController {

    @Autowired
    private LivroService livroService;

    @GetMapping
    public List<LivroDTO> listar() {
        return livroService.listar();
    }

    @PostMapping
    public LivroDTO criar(@RequestBody LivroDTO livroDTO) {
        return livroService.criar(livroDTO);
    }

    @PutMapping("/{id}")
    public LivroDTO atualizar(@PathVariable UUID id, @RequestBody LivroDTO livroDTO) {
        return livroService.atualizar(id, livroDTO);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable UUID id) {
        livroService.deletar(id);
    }
}
