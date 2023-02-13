package com.maia.apipostagem.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Postagem {
    private String codPostagem;
    private String titulo;
    private String textoPostagem;
    private String autor;
    private OffsetDateTime dataHora;

}
