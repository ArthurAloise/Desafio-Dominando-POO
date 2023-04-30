package br.com.POO.desafio;

import br.com.POO.desafio.dominio.Curso;
import br.com.POO.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){

        Curso curso = new Curso();
        curso.setTitulo("Java Avdvanced!");
        curso.setDescricao("Cuso completo");
        curso.setCargaHoraria(8);

        System.out.println(curso);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Duvidas Java");
        mentoria.setDescricao("Dúvidas com POO");
        mentoria.setData(LocalDate.now());

        System.out.println(mentoria);

    }
}
