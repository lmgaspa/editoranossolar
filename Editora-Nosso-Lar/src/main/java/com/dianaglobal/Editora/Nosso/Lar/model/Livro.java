package com.dianaglobal.Editora.Nosso.Lar.model;

import com.dianaglobal.Editora.Nosso.Lar.domain.Genero;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false, unique = true, length = 20)
    private String isbn;

    @Column(nullable = false, length = 150)
    private String titulo;

    @Column(nullable = false)
    private BigDecimal preco;

    @Column(nullable = false)
    private Integer quantidade;

    @Column(nullable = false)
    private Integer paginas;

    @Column(nullable = false)
    private String dataPublicacao;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 50)
    private Genero genero;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Autor autor;

}
