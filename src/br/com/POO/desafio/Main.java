package br.com.POO.desafio;

import br.com.POO.desafio.dominio.Bootcamp;
import br.com.POO.desafio.dominio.Curso;
import br.com.POO.desafio.dominio.Dev;
import br.com.POO.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){

        Curso curso = new Curso();
        curso.setTitulo("Java Avdvanced!");
        curso.setDescricao("Cuso completo");
        curso.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Duvidas Java");
        mentoria.setDescricao("Dúvidas com POO");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Kotlin Plus Java");
        bootcamp.setDescricao("Upgrade de carreira com Java Development");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(mentoria);

        Dev devArthur = new Dev();
        devArthur.setName("Arthur Aloise");
        devArthur.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos incritos: \n" + devArthur.getConteudosInscritos());

        devArthur.progredir();
        devArthur.progredir();

        System.out.println("Conteudos concluidos: \n" + devArthur.getConteudosConcluidos());

        System.out.println("Conteudos incritos: \n" + devArthur.getConteudosInscritos());

        System.out.println("XP: " + devArthur.calcularValorXP());

    }
}
