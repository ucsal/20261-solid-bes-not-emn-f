package br.com.ucsal.olimpiadas;

import br.com.ucsal.olimpiadas.interfaces.ITabuleiro;

public class QuestaoXadrez extends QuestaoObjetiva implements ITabuleiro {
    private String fenInicial;

    public String getFenInicial() {
        return fenInicial;
    }

    public void setFenInicial(String fenInicial) {
        this.fenInicial = fenInicial;
    }
}
