package com.entra21.PrimeiroProjetoSpring.Controller;

import com.entra21.PrimeiroProjetoSpring.Model.Entity.DVDEntity;
import com.entra21.PrimeiroProjetoSpring.View.Repository.DvdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/dvds")
public class DvdRestController {

    @Autowired
    private DvdRepository dvdRepository;

    @GetMapping
    public List<DVDEntity> getAllDvds() {
        return dvdRepository.findAll();
    }

}
