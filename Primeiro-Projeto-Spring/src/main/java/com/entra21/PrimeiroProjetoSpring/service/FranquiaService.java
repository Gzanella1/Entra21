package com.entra21.PrimeiroProjetoSpring.service;

import com.entra21.PrimeiroProjetoSpring.Dto.FranquiaDTO;
import com.entra21.PrimeiroProjetoSpring.View.Repository.FranquiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FranquiaService {
    @Autowired
    private FranquiaRepository franquiaRepository;

    public List<FranquiaDTO> getAll(){
        return  franquiaRepository.findAll().stream().map(fr-> {
            FranquiaDTO dto = new FranquiaDTO();
            dto.setId(fr.getId());
            dto.setNome(fr.getNome());
            return dto;
        }).collect(Collectors.toList());
    }
}
