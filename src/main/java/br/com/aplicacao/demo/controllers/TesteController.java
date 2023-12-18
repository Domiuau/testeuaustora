package br.com.aplicacao.demo.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hideki")
public class TesteController {

    @GetMapping
    public ResponseEntity a () {
        return ResponseEntity.ok("frota f");
    }
}
