package com.github.wojtechm.drzewa.zadanie_drugie;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * @author Makiela Wojciech
 */
public class PrzeszukiwanieWszerzGrafu {

    private static final String WIADOMOŚĆ = "Oczekiwałem %s, dostałem %s";

    @Test
    public void czyDziałaNaGrafieIdącOdŚrodka() {
        // arrange
        PrzeszukiwanieWszerz wszerz = new PrzeszukiwanieWszerz();
        String oczekiwane = "[0, 1, 2, 3, 4, 5, 6]";
        // act
        String coDostałem = wszerz.czytajGraf(GrafyDoTestowania.korzeń1);
        // assert
        assert oczekiwane.equals(coDostałem) : String.format(WIADOMOŚĆ, oczekiwane, coDostałem);
    }

    @Test
    public void czyDziałaNaGrafieIdącOdBrzegu() {
        // arrange
        PrzeszukiwanieWszerz wszerz = new PrzeszukiwanieWszerz();
        String oczekiwane = "[6, 1, 2, 0, 5, 3, 4]";
        // act
        String coDostałem = wszerz.czytajGraf(GrafyDoTestowania.korzeń2);
        // assert
        assert oczekiwane.equals(coDostałem) : String.format(WIADOMOŚĆ, oczekiwane, coDostałem);
    }

    @Test
    public void czyZwracaPustąTablicęGdyKorzeńJestNullem() {
        // arrange
        PrzeszukiwanieWszerz wszerz = new PrzeszukiwanieWszerz();
        String oczekiwane = "[]";
        // act
        String coDostałem = wszerz.czytajGraf(null);
        // assert
        assert oczekiwane.equals(coDostałem) : String.format(WIADOMOŚĆ, oczekiwane, coDostałem);
    }
}