package com.github.wojtechm.drzewa.zadanie_drugie;

import org.testng.annotations.Test;

/**
 * @author Makiela Wojciech
 */
public class PrzeszukiwanieWGłąbGrafu {

    @Test
    public void czyDziałaNaGrafieIdącOdŚrodka() {
        // arrange
        PrzeszukiwanieWGłąb wGłąb = new PrzeszukiwanieWGłąb();
        String oczekiwane = "[0, 1, 5, 4, 6, 2, 3]";
        // act
        String coDostałem = wGłąb.czytajGraf(GrafyDoTestowania.korzeń1);
        // assert
        assert oczekiwane.equals(coDostałem) : String.format("Expected %s, got %s", oczekiwane, coDostałem);
    }

    @Test
    public void czyDziałaNaGrafieIdącOdBrzegu() {
        // arrange
        PrzeszukiwanieWGłąb wGłąb = new PrzeszukiwanieWGłąb();
        String oczekiwane = "[6, 1, 0, 2, 3, 4, 5]";
        // act
        String coDostałem = wGłąb.czytajGraf(GrafyDoTestowania.korzeń2);
        // assert
        assert oczekiwane.equals(coDostałem) : String.format("Expected %s, got %s", oczekiwane, coDostałem);
    }
}