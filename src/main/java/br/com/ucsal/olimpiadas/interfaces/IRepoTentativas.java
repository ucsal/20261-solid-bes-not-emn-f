package br.com.ucsal.olimpiadas.interfaces;

import java.util.List;

import br.com.ucsal.olimpiadas.domain.entitity.Tentativa;

public interface IRepoTentativas {
    void salvar(Tentativa tentativa);

    List<Tentativa> listarTodos();
}
