package com.dianaglobal.Editora.Nosso.Lar.repository;

import com.dianaglobal.Editora.Nosso.Lar.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AutorRepository extends JpaRepository<Autor, UUID> { ;
}

