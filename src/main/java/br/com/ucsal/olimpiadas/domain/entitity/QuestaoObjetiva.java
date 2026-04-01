package br.com.ucsal.olimpiadas.domain.entitity;

import java.util.Arrays;

public class QuestaoObjetiva extends Questao {
    private String[] alternativas = new String[5];
    private char alternativaCorreta;

    public String[] getAlternativas() {
        return alternativas;
    }

    public void setAlternativas(String[] alternativas) {
        if (alternativas == null || alternativas.length != 5) {
            throw new IllegalArgumentException("A questão deve possuir exatamente 5 alternativas.");
        }
        this.alternativas = Arrays.copyOf(alternativas, 5);
    }

    public char getAlternativaCorreta() {
        return alternativaCorreta;
    }

    public void setAlternativaCorreta(char alternativaCorreta) {
        this.alternativaCorreta = normalizar(alternativaCorreta);
    }

    public boolean isRespostaCorreta(char marcada) {
        return normalizar(marcada) == alternativaCorreta;
    }

    public static char normalizar(char c) {
        char up = Character.toUpperCase(c);
        if (up < 'A' || up > 'E') {
            throw new IllegalArgumentException("Alternativa deve estar entre A e E.");
        }
        return up;
    }
}
