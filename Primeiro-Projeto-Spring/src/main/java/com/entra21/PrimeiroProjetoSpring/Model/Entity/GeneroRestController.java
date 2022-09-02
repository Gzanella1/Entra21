package com.entra21.PrimeiroProjetoSpring.Model.Entity;

import com.entra21.PrimeiroProjetoSpring.View.Repository.FranquiaRepository;
import com.entra21.PrimeiroProjetoSpring.View.Repository.GeneroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class GeneroRestController {

    @Autowired
    private GeneroRepository generoEntity;

    @GetMapping
    public List<GeneroEntity> getgenero(){
        return GeneroRepository.f
    }

}
