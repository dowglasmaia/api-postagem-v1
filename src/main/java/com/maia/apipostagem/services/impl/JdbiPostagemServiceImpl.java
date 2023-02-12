package com.maia.apipostagem.services.impl;

import com.maia.apipostagem.repository.jdbi.JdbiPostagemRepository;
import com.maia.apipostagem.services.PostagemService;
import com.maia.apipostagem.services.mapper.PostagemMapper;
import com.maia.provider.model.RequestPostagemVO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class JdbiPostagemServiceImpl implements PostagemService {


    @Autowired
    private JdbiPostagemRepository postagemRepository;



    @Override
    public void create(RequestPostagemVO body) {
        log.info(" Start create Postagem");
        try {
            var postagem = PostagemMapper.toPostagem(body);
            postagemRepository.create(postagem);
        } catch (Exception ex) {
            log.error(" Error ao Tentar salvar uma Postagem {}", body);
            log.error(ex.getMessage());
        }
    }

}
