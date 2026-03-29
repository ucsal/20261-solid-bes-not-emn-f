package br.com.ucsal.olimpiadas.repository;

import java.util.ArrayList;
import java.util.List;

import br.com.ucsal.olimpiadas.Prova;
import br.com.ucsal.olimpiadas.interfaces.IRepoProvas;

public class RepoProvas implements IRepoProvas {
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
