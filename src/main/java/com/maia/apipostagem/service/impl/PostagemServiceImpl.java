package com.maia.apipostagem.service.impl;

import com.maia.apipostagem.repository.PostagemRepository;
import com.maia.apipostagem.service.PostagemService;
import com.maia.apipostagem.service.mapper.PostagemRequestMapper;
import com.maia.provider.model.RequestPostagemVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PostagemServiceImpl implements PostagemService {

    @Autowired
    private PostagemRepository postagemRepository;

    @Override
    public void create(RequestPostagemVO postagem) {
        log.info("Start create ");
        try {
            var poste = PostagemRequestMapper.toPostagem(postagem);

            postagemRepository.insert(poste);

        } catch (Exception ex) {
            log.error("Error ao tentar salvar postagem");
            log.error(ex.getMessage());
            throw new RuntimeException("Error ao tentar salvar postagem");
        }
    }


}
