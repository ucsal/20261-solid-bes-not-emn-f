package br.com.ucsal.olimpiadas.interfaces;

import java.util.List;

import br.com.ucsal.olimpiadas.domain.entitity.Participante;

public interface IRepoParticipantes {
    void salvar(Participante participante);

    List<Participante> listarTodos();
}
