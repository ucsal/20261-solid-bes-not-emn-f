package br.com.ucsal.olimpiadas.repository;

import java.util.ArrayList;
import java.util.List;

import br.com.ucsal.olimpiadas.Participante;
import br.com.ucsal.olimpiadas.interfaces.IRepoParticipantes;

public class RepoParticipantes implements IRepoParticipantes{
    private long proximoParticipanteId = 1;
    private final List<Participante> participantes = new ArrayList<>();

    public void salvar(Participante participante){
        participante.setId(proximoParticipanteId++);
        participantes.add(participante);
    }
    public List<Participante> listarTodos(){
        return participantes;
    }

}
