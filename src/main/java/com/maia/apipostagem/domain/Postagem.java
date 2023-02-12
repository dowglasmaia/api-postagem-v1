package com.maia.apipostagem.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;


@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Postagem {
    private String id;
    private String titulo;
    private String descricao;
    private OffsetDateTime dataCriacao;
    private String autor;

}
