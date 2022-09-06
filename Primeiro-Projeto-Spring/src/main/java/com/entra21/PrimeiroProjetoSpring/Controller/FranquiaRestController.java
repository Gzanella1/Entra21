package com.entra21.PrimeiroProjetoSpring.Controller;

import com.entra21.PrimeiroProjetoSpring.Dto.FranquiaDTO;
import com.entra21.PrimeiroProjetoSpring.Model.Entity.FranquiaEntity;
import com.entra21.PrimeiroProjetoSpring.View.Repository.FranquiaRepository;
import com.entra21.PrimeiroProjetoSpring.service.FranquiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/franquias")
public class FranquiaRestController {

    @Autowired
    private FranquiaService franquiaService;

    @GetMapping
    public List<FranquiaDTO> getFranquias() {
        return franquiaService.getAll();
    }

    @PostMapping
    public void addFranquia(@RequestBody FranquiaEntity entity) {
        franquiaRepository.save(entity);
    }

    @GetMapping("/{id}")
    public ResponseEntity<FranquiaDTO>  getAll(){
        return FranquiaRepository.findAll().stream().map(

        )
    }


    @DeleteMapping("/{id}")
    public void deleteFranquia(@PathVariable(name = "id") Long id) {
        franquiaRepository.deleteById(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<FranquiaEntity> updateFranquia(@PathVariable(name = "id") Long id,
                                                         @RequestBody String novoNome) {
        Optional<FranquiaEntity> entity = franquiaRepository.findById(id);
        if (entity.isPresent()) {
            entity.get().setNome(novoNome);
            return ResponseEntity.ok(franquiaRepository.save(entity.get()));
        } else {
            return ResponseEntity.notFound().build() ;
        }
    }
}
