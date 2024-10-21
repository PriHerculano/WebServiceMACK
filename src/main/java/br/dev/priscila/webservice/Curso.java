package br.dev.priscila.webservice;

import java.util.*;

public class Curso{
    private String nome;
    public int duracao;
    
    public Curso(){}
    
    public Curso(String nome, int duracao){
        this.nome = nome;
        this.duracao = duracao;
    }
    
    public String getNome(){
        return nome;
    }
    
    public int getDuracao(){
        return duracao;
    }
}