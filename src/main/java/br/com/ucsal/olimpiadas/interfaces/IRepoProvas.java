package br.com.ucsal.olimpiadas.interfaces;

import java.util.List;

import br.com.ucsal.olimpiadas.domain.entitity.Prova;

public interface IRepoProvas {
    void salvar(Prova prova);

    List<Prova> listarTodos();
}
