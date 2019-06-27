package com.github.wojtechm.drzewa.zadanie_pierwsze;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * @author Makiela Wojciech
 */
public class PrzeszukiwanieWGłąbDrzewa {

    private static final String WIADOMOŚĆ = "Oczekiwałem %s, dostałem %s";

    @Test
    public void czyDziałaNaSymetrycznymDrzewie() {
        // arrange
        PrzeszukiwanieWGłąb wGłąb = new PrzeszukiwanieWGłąb();
        String oczekiwane = "[5, 3, 2, 4, 7, 6, 8]";
        // act
        String coDostałem = wGłąb.czytajDrzewo(DrzewaDoTestowania.symetryczne);
        // assert
        assert oczekiwane.equals(coDostałem) : String.format(WIADOMOŚĆ, oczekiwane, coDostałem);
    }

    @Test
    public void czyDziałaNaNiesymetrycznymDrzewie(){
        // arrange
        PrzeszukiwanieWGłąb wGłąb = new PrzeszukiwanieWGłąb();
        String oczekiwane = "[0, 2, 1, 4, 3, 6, 5]";
        // act
        String coDostałem = wGłąb.czytajDrzewo(DrzewaDoTestowania.niesymetryczne);
        // assert
        assert oczekiwane.equals(coDostałem) : String.format(WIADOMOŚĆ, oczekiwane, coDostałem);
    }

    @Test
    public void czyDziałaNaSchodkachDrzewie(){
        // arrange
        PrzeszukiwanieWGłąb wGłąb = new PrzeszukiwanieWGłąb();
        String oczekiwane = "[0, 1, 6, 3, 2, 4, 5]";
        // act
        String coDostałem = wGłąb.czytajDrzewo(DrzewaDoTestowania.schodki);
        // assert
        assert oczekiwane.equals(coDostałem) : String.format(WIADOMOŚĆ, oczekiwane, coDostałem);
    }


    @Test
    public void czyZwracaPustąTablicęGdyKorzeńJestNullem() {
        // arrange
        PrzeszukiwanieWGłąb wGłąb = new PrzeszukiwanieWGłąb();
        String oczekiwane = "[]";
        // act
        String coDostałem = wGłąb.czytajDrzewo(null);
        // assert
        assert oczekiwane.equals(coDostałem) : String.format(WIADOMOŚĆ, oczekiwane, coDostałem);
    }
}