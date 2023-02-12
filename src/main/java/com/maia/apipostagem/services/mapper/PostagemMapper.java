package com.maia.apipostagem.services.mapper;

import com.maia.apipostagem.domain.Postagem;
import com.maia.provider.model.RequestPostagemVO;

import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.UUID;

public class PostagemMapper {

    public static Postagem toPostagem(RequestPostagemVO postagemVO){

        ZoneOffset zoneOffSet= ZoneOffset.of("-03:00");

        var poste =  Postagem.builder()
                .id(UUID.randomUUID().toString())
                .autor("Dowglas Maia")
                .dataCriacao(OffsetDateTime.now(zoneOffSet))
                .titulo(postagemVO.getTitulo())
                .descricao(postagemVO.getDescricao())
                .build();

        return poste;
    }


}
