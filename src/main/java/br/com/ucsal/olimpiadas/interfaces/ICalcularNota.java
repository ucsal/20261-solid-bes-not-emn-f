package br.com.ucsal.olimpiadas.interfaces;

import java.util.List;

import br.com.ucsal.olimpiadas.domain.entitity.Resposta;

public interface ICalcularNota {
    double calcular(List<Resposta> respostas);
}
