package com.dianaglobal.Editora.Nosso.Lar.dto;

import lombok.Data;
import java.util.UUID;

@Data
public class AutorDTO {
    private UUID id;
    private String nome;
    private Integer quantidadeLivros;
}
