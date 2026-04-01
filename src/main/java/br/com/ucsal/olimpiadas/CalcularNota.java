package br.com.ucsal.olimpiadas;

import java.util.List;

import br.com.ucsal.olimpiadas.domain.entitity.Resposta;
import br.com.ucsal.olimpiadas.interfaces.ICalcularNota;

public class CalcularNota implements ICalcularNota {
    public double calcular(List<Resposta> respostas) {
        double total = 0;
        for (Resposta r : respostas) {
            if (r.isCorreta())
                total += 1;
        }
        return total;
    }

}
