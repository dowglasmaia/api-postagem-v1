package com.maia.apipostagem.controller;


import com.maia.provider.api.PostagensApi;
import com.maia.provider.model.RequestPostagemVO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class PostagemController implements PostagensApi {




    @Override
    public ResponseEntity<Void> create(RequestPostagemVO body) {

        System.out.println("### Passou por aqui ####");

        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}
