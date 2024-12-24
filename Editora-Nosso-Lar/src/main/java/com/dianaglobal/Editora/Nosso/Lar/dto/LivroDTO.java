package com.dianaglobal.Editora.Nosso.Lar.dto;

import lombok.Data;
import java.math.BigDecimal;
import java.util.UUID;

@Data
public class LivroDTO {
    private UUID id;
    private String isbn;
    private String titulo;
    private BigDecimal preco;
    private Integer quantidade;
    private Integer paginas;
    private String dataPublicacao;
    private Genero genero;
    private UUID autorId; // Referência ao autor
}

