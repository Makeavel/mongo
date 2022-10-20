package com.db.ecosistemadb.controller;

import com.db.ecosistemadb.model.Teste;
import com.db.ecosistemadb.service.TesteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/eco")
public class TesteController {

    @Autowired
    TesteService testeService;

    @PostMapping("/teste")
    public Teste createProfiles(@RequestBody Teste teste){
        return testeService.save(teste);
    }

    @GetMapping("/viewTeste/{id}")
    public Teste verPerfil(@PathVariable Integer id){
        return testeService.verUser(id);
    }
}
