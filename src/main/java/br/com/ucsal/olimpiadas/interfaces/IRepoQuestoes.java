package br.com.ucsal.olimpiadas.interfaces;

import java.util.List;

import br.com.ucsal.olimpiadas.Questao;

public interface IRepoQuestoes {
    void salvar(Questao questao);

    List<Questao> listarTodos();
}
