package com.dianaglobal.Editora.Nosso.Lar.controller;

import com.dianaglobal.Editora.Nosso.Lar.domain.AutorDTO;
import com.dianaglobal.Editora.Nosso.Lar.service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/autores")
public class AutorController {

    @Autowired
    private AutorService autorService;

    @GetMapping
    public List<AutorDTO> listar() {
        return autorService.listar();
    }

    @PostMapping
    public AutorDTO criar(@RequestBody AutorDTO autorDTO) {
        return autorService.criar(autorDTO);
    }

    @PutMapping("/{id}")
    public AutorDTO atualizar(@PathVariable UUID id, @RequestBody AutorDTO autorDTO) {
        return autorService.atualizar(id, autorDTO);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable UUID id) {
        autorService.deletar(id);
    }
}
