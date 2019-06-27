package com.github.wojtechm.drzewa.zadanie_pierwsze;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * @author Makiela Wojciech
 */
public class PrzeszukiwanieWszerzDrzewa {

    private static final String WIADOMOŚĆ = "Oczekiwałem %s, dostałem %s";

    @Test
    public void czyDziałaNaSymetrycznymDrzewie() {
        // arrange
        PrzeszukiwanieWszerz wszerz = new PrzeszukiwanieWszerz();
        String oczekiwane = "[5, 3, 7, 2, 4, 6, 8]";
        // act
        String coDostałem = wszerz.czytajDrzewo(DrzewaDoTestowania.symetryczne);
        // assert
        assert oczekiwane.equals(coDostałem) : String.format(WIADOMOŚĆ, oczekiwane, coDostałem);
    }

    @Test
    public void czyDziałaNaNiesymetrycznymDrzewie() {
        // arrange
        PrzeszukiwanieWszerz wszerz = new PrzeszukiwanieWszerz();
        String oczekiwane = "[0, 2, 1, 4, 3, 6, 5]";
        // act
        String coDostałem = wszerz.czytajDrzewo(DrzewaDoTestowania.niesymetryczne);
        // assert
        assert oczekiwane.equals(coDostałem) : String.format(WIADOMOŚĆ, oczekiwane, coDostałem);
    }

    @Test
    public void czyZwracaPustąTablicęGdyKorzeńJestNullem() {
        // arrange
        PrzeszukiwanieWszerz wszerz = new PrzeszukiwanieWszerz();
        String oczekiwane = "[]";
        // act
        String coDostałem = wszerz.czytajDrzewo(null);
        // assert
        assert oczekiwane.equals(coDostałem) : String.format(WIADOMOŚĆ, oczekiwane, coDostałem);
    }
}