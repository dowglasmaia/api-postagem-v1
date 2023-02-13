package com.maia.apipostagem.service.mapper;

import com.maia.apipostagem.domain.Postagem;
import com.maia.provider.model.RequestPostagemVO;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.UUID;

public class PostagemRequestMapper {

    public static Postagem toPostagem( RequestPostagemVO postagem) {

        ZoneOffset offset = ZoneOffset.of("-03:00");

        return Postagem.builder()
                .textoPostagem(postagem.getDescricao())
                .titulo(postagem.getTitulo())
                .codPostagem( UUID.randomUUID().toString() )
                .dataHora(OffsetDateTime.now(offset))
                .autor("Dowglas Maia")
                .build();
    }
}
