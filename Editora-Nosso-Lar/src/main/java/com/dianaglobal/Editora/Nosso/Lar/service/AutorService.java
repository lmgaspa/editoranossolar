package com.dianaglobal.Editora.Nosso.Lar.service;

import com.dianaglobal.Editora.Nosso.Lar.domain.AutorDTO;
import com.dianaglobal.Editora.Nosso.Lar.model.Autor;
import com.dianaglobal.Editora.Nosso.Lar.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class AutorService {

    @Autowired
    private AutorRepository autorRepository;

    public List<AutorDTO> listar() {
        return autorRepository.findAll().stream().map(this::toDTO).collect(Collectors.toList());
    }

    public AutorDTO criar(AutorDTO autorDTO) {
        Autor autor = new Autor();
        autor.setNome(autorDTO.getNome());
        autor.setQuantidadeLivros(autorDTO.getQuantidadeLivros() != null ? autorDTO.getQuantidadeLivros() : 0);
        Autor salvo = autorRepository.save(autor);
        return toDTO(salvo);
    }

    public AutorDTO atualizar(UUID id, AutorDTO autorDTO) {
        Optional<Autor> optionalAutor = autorRepository.findById(id);
        if (optionalAutor.isEmpty()) {
            throw new RuntimeException("Autor não encontrado");
        }

        Autor autor = optionalAutor.get();
        autor.setNome(autorDTO.getNome());
        autor.setQuantidadeLivros(autorDTO.getQuantidadeLivros());
        return toDTO(autorRepository.save(autor));
    }

    public void deletar(UUID id) {
        if (!autorRepository.existsById(id)) {
            throw new RuntimeException("Autor não encontrado");
        }
        autorRepository.deleteById(id);
    }

    private AutorDTO toDTO(Autor autor) {
        AutorDTO dto = new AutorDTO();
        dto.setId(autor.getId());
        dto.setNome(autor.getNome());
        dto.setQuantidadeLivros(autor.getQuantidadeLivros());
        return dto;
    }
}