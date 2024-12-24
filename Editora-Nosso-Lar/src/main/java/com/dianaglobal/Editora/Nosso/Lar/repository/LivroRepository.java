package com.dianaglobal.Editora.Nosso.Lar.repository;

import com.dianaglobal.Editora.Nosso.Lar.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface LivroRepository extends JpaRepository<Livro, UUID> {

    // Busca todos os livros por um autor específico
    List<Livro> findByAutorId(UUID autorId);

    // Exemplo de consulta customizada por gênero
    List<Livro> findByGenero(String genero);
}
