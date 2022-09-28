package com.entra21.primeiroprojetospring.view.service;

import com.entra21.primeiroprojetospring.model.dto.FranquiaDTO;
import com.entra21.primeiroprojetospring.model.dto.FranquiaPayloadDTO;
import com.entra21.primeiroprojetospring.model.dto.GeneroDTO;
import com.entra21.primeiroprojetospring.model.dto.GeneroPayLoadDTO;
import com.entra21.primeiroprojetospring.model.entity.FranquiaEntity;
import com.entra21.primeiroprojetospring.model.entity.GeneroEntity;
import com.entra21.primeiroprojetospring.view.repository.GeneroRepository;
import jdk.jshell.execution.LoaderDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GeneroService {

    @Autowired
    private GeneroRepository generoRepository;

    public List<GeneroDTO> getAll() {
        return generoRepository.findAll().stream().map(gr -> {
            GeneroDTO dto = new GeneroDTO();
            dto.setNome(gr.getNome());
            dto.setId(gr.getId());
            return dto;
        }).collect(Collectors.toList());
    }

    public void save(GeneroPayLoadDTO input) {
        GeneroEntity newEntity = new GeneroEntity();
        newEntity.setNome(input.getNome());
        generoRepository.save(newEntity);
    }



    public void delete(Long id) {
        generoRepository.deleteById(id);
    }

    public GeneroDTO getById(Long id) {
        GeneroEntity e = generoRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Genero não encontrada!"));
        GeneroDTO dto = new GeneroDTO();
        dto.setId(e.getId());
        dto.setNome(e.getNome());
        return dto;
    }
    public GeneroDTO update(Long id, String novoNome) {
        GeneroEntity e = generoRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Genero não encontrada!"));
        e.setNome(novoNome);
        e = generoRepository.save(e);
        GeneroDTO dto = new GeneroDTO();
        dto.setNome(e.getNome());
        dto.setId(e.getId());
        return dto;
    }
}