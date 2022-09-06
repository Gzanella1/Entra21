package com.entra21.PrimeiroProjetoSpring.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController//definido a classe java como um controlador
public class HelloWorldRestController {
    @GetMapping("/") //esse método sempre precisa de um identificador  ///mapeamento de caminhos
    public String helloWorld(){return "Hello World!";
    }

    @PostMapping("/")//
    public String greet(@RequestBody String user){   //@RequestBody dentro do corpo da requizição-   vai ter o texto usuario
        return "hello, "+ user;
    }
}
