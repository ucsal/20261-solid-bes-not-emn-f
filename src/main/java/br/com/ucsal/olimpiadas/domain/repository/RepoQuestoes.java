package br.com.ucsal.olimpiadas.domain.repository;

import java.util.ArrayList;
import java.util.List;

import br.com.ucsal.olimpiadas.domain.entitity.Questao;
import br.com.ucsal.olimpiadas.interfaces.IRepoQuestoes;

public class RepoQuestoes implements IRepoQuestoes {
    private long proximaQuestaoId = 1;
    private final List<Questao> questoes = new ArrayList<>();

    public void salvar(Questao questao) {
        questao.setId(proximaQuestaoId++);
        questoes.add(questao);
    }

    public List<Questao> listarTodos() {
        return questoes;
    }

}
