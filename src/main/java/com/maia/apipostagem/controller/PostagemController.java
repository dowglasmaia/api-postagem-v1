package com.maia.apipostagem.controller;


import com.maia.apipostagem.services.PostagemService;
import com.maia.provider.api.PostagensApi;
import com.maia.provider.model.RequestPostagemVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class PostagemController implements PostagensApi {


    @Autowired
    public PostagemService postagemService;

    @Override
    public ResponseEntity<Void> create(RequestPostagemVO body) {

        postagemService.create(body);

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

}
