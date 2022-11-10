package com.escola.service;


import com.escola.Entity.EscolasEntity;
import com.escola.dto.EscolaDto;
import com.escola.repository.EscolaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EscolaService{

    @Autowired
    private EscolaRepository escolaRepository;

    public void addEscola(EscolaDto escolaDto){
        EscolasEntity ee =new EscolasEntity();
        ee.setNome(escolaDto.getNomeE());
        ee.setTelefone(escolaDto.getTelefone());
        escolaRepository.save(ee);
    }

    public List<EscolaDto> buscar (){
        return escolaRepository.findAll().stream().map(er ->{
        EscolaDto dto=new EscolaDto();
        dto.setNomeE(er.getNome());
        dto.setTelefone(er.getTelefone());
        return dto;
        }).collect(Collectors.toList());
    }
}