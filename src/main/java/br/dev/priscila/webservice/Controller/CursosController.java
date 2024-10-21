//nome: Priscila Herculano
//RA: 10420400

package br.dev.priscila.webservice.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.dev.priscila.webservice.Curso;
import br.dev.priscila.webservice.CursosManager;

@RequestMapping("/api")
@RestController
public class CursosController {
    
    private final CursosManager manager;

    CursosController(CursosManager manager){
        this.manager = manager;
    }

    @GetMapping("/cursos")
    List<Curso> all(){
        return manager.getCursos();
    }
}