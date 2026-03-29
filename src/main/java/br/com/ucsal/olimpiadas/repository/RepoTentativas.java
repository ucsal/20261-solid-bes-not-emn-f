package br.com.ucsal.olimpiadas.repository;

import java.util.ArrayList;
import java.util.List;

import br.com.ucsal.olimpiadas.Tentativa;

public class RepoTentativas {
    private long proximaTentativaId = 1;
    private final List<Tentativa> tentativas = new ArrayList<>();

    public void salvar(Tentativa tentativa) {
        tentativa.setId(proximaTentativaId++);
        tentativas.add(tentativa);
    }

    public List<Tentativa> listarTodos() {
        return tentativas;

    }

}
