package com.escola.controller;

import com.escola.dto.EscolaDto;
import com.escola.service.EscolaService;
import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/escola")
public class EscolasRestController {

    @Autowired
    private EscolaService escolaService;

    @PostMapping("/add")
    public void  addEscolas(@RequestBody EscolaDto escolaDto) {
            escolaService.addEscola(escolaDto);
}

    @GetMapping("buscar")
    public List<EscolaDto> buscar(){
        return escolaService.buscar();
    }
}
