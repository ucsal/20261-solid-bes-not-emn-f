package br.com.ucsal.olimpiadas.repository;

import java.util.ArrayList;
import java.util.List;

import br.com.ucsal.olimpiadas.Questao;

public class RepositorioDeQuestoes {
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
