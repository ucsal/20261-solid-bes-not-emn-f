package br.com.ucsal.olimpiadas.repository;

import java.util.ArrayList;
import java.util.List;

import br.com.ucsal.olimpiadas.Prova;

public class RepositorioDeProvas {
    private long proximaProvaId = 1;
    private final List<Prova> provas = new ArrayList<>();

    public void salvar(Prova prova) {
        prova.setId(proximaProvaId++);
        provas.add(prova);
    }

    public List<Prova> listarTodos() {
        return provas;
    }

}
