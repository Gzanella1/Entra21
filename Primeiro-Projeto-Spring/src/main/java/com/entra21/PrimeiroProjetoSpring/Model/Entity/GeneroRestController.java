package com.entra21.PrimeiroProjetoSpring.Model.Entity;

import com.entra21.PrimeiroProjetoSpring.View.Repository.FranquiaRepository;
import com.entra21.PrimeiroProjetoSpring.View.Repository.GeneroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

public class GeneroRestController {

    @Autowired
    private GeneroRepository generoRepository;

    @GetMapping
    public List<GeneroEntity> getGenero(){
     return generoRepository.findAll();
    }

    @PostMapping//criando um registro
    public void addGenero(@RequestBody GeneroEntity generoEntity){
        generoRepository.save(generoEntity);
    }

    @GetMapping("/{id}")
    public ResponseEntity getFranquia(@PathVariable(name="id") long id ){
        Optional<GeneroEntity> genero= generoRepository.findById(id);

        if (genero.isPresent()){
            return ResponseEntity.ok(genero.get());
        }else{
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")//deletando o id
    public void deletGenero(@PathVariable(name="id") Long id){
        generoRepository.deleteById(id);
    }

    @PutMapping("/{id}") //Atualizar
    public GeneroEntity updateGenero(@PathVariable(name = "id") Long id, @RequestBody String novoNome){
        Optional <GeneroEntity> entity= generoRepository.findById(id);
        if (entity.isPresent()) {
            entity.get().setNome(novoNome);
            return ResponseEntity.ok(generoRepository.save(entity.get()));
        }else{
            return ResponseEntity.notFound().build();
        }
    }


}
