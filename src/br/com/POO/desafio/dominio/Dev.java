package br.com.POO.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Dev {
    private String name;
    private Set<Conteudo> consteudosInscritos = new LinkedHashSet<>();
    private final Set<Conteudo> consteudosConcluidos = new LinkedHashSet<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Conteudo> getConsteudosInscritos() {
        return consteudosInscritos;
    }

    public void setConsteudosInscritos(Set<Conteudo> consteudosInscritos) {
        this.consteudosInscritos = consteudosInscritos;
    }

    public Set<Conteudo> getConsteudosConcluidos() {
        return consteudosConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(name, dev.name) && Objects.equals(consteudosInscritos, dev.consteudosInscritos) && Objects.equals(consteudosConcluidos, dev.consteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, consteudosInscritos, consteudosConcluidos);
    }
}

