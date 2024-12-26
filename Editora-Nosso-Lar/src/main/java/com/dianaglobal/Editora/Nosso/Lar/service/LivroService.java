package com.dianaglobal.Editora.Nosso.Lar.service;

import com.dianaglobal.Editora.Nosso.Lar.domain.LivroDTO;
import com.dianaglobal.Editora.Nosso.Lar.model.Autor;
import com.dianaglobal.Editora.Nosso.Lar.model.Livro;
import com.dianaglobal.Editora.Nosso.Lar.repository.AutorRepository;
import com.dianaglobal.Editora.Nosso.Lar.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class LivroService {

    @Autowired
    private LivroRepository livroRepository;

    @Autowired
    private AutorRepository autorRepository;

    public List<LivroDTO> listar() {
        return livroRepository.findAll().stream().map(this::toDTO).collect(Collectors.toList());
    }

    public LivroDTO criar(LivroDTO livroDTO) {
        Optional<Autor> autor = autorRepository.findById(livroDTO.getAutorId());
        if (autor.isEmpty()) {
            throw new RuntimeException("Autor não encontrado");
        }

        Livro livro = new Livro();
        livro.setIsbn(livroDTO.getIsbn());
        livro.setTitulo(livroDTO.getTitulo());
        livro.setPreco(livroDTO.getPreco());
        livro.setQuantidade(livroDTO.getQuantidade());
        livro.setPaginas(livroDTO.getPaginas());
        livro.setDataPublicacao(livroDTO.getDataPublicacao());
        livro.setAutor(autor.get());
        Livro salvo = livroRepository.save(livro);
        return toDTO(salvo);
    }

    public LivroDTO atualizar(UUID id, LivroDTO livroDTO) {
        Optional<Livro> optionalLivro = livroRepository.findById(id);
        if (optionalLivro.isEmpty()) {
            throw new RuntimeException("Livro não encontrado");
        }

        Livro livro = optionalLivro.get();
        livro.setTitulo(livroDTO.getTitulo());
        livro.setPreco(livroDTO.getPreco());
        livro.setQuantidade(livroDTO.getQuantidade());
        livro.setPaginas(livroDTO.getPaginas());
        livro.setDataPublicacao(livroDTO.getDataPublicacao());
        return toDTO(livroRepository.save(livro));
    }

    public void deletar(UUID id) {
        if (!livroRepository.existsById(id)) {
            throw new RuntimeException("Livro não encontrado");
        }
        livroRepository.deleteById(id);
    }

    private LivroDTO toDTO(Livro livro) {
        LivroDTO dto = new LivroDTO();
        dto.setId(livro.getId());
        dto.setIsbn(livro.getIsbn());
        dto.setTitulo(livro.getTitulo());
        dto.setPreco(livro.getPreco());
        dto.setQuantidade(livro.getQuantidade());
        dto.setPaginas(livro.getPaginas());
        dto.setDataPublicacao(livro.getDataPublicacao());
        dto.setAutorId(livro.getAutor().getId());
        return dto;
    }
}
