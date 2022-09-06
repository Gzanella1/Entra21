package com.entra21.PrimeiroProjetoSpring.Dto;

import lombok.Data;
import org.springframework.web.bind.annotation.PostMapping;

@Data
public class FranquiaDTO {
    private Long id;
    private String nome;
}
