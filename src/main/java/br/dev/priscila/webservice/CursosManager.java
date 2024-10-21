//nome: Priscila Herculano
//RA: 10420400

package br.dev.priscila.webservice;

import java.util.*;

import org.springframework.stereotype.Service;
@Service
public class CursosManager{
    private List<Curso> cursos;

    public CursosManager(){
        this.cursos = new ArrayList<>();
        this.cursos.add(new Curso("Sistemas de Informação", 3000));
        this.cursos.add(new Curso("Ciência da Computação", 3000));
    }

    public List<Curso> getCursos(){
        return this.cursos;
    }
}