package br.com.ucsal.olimpiadas.interfaces;

import java.util.List;

import br.com.ucsal.olimpiadas.Resposta;

public interface ICalcularNota {
    double calcular(List<Resposta> respostas);
}
