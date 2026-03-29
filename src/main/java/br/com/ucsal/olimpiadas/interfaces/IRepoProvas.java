package br.com.ucsal.olimpiadas.interfaces;

import java.util.List;

import br.com.ucsal.olimpiadas.Prova;

public interface IRepoProvas {
    void salvar(Prova prova);

    List<Prova> listarTodos();
}
