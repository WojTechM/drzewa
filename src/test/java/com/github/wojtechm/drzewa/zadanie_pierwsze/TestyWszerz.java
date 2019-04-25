package com.github.wojtechm.drzewa.zadanie_pierwsze;

import com.github.wojtechm.drzewa.zadanie_pierwsze.DrzewaDoTestowania;
import org.testng.annotations.Test;

/**
 * @author Makiela Wojciech
 */
class TestyWszerz {

    @Test
    public void czyDziałaNaSymetrycznymDrzewie() {
        // arrange
        PrzeszukiwanieWszerz wszerz = new PrzeszukiwanieWszerz();
        String oczekiwane = "[5, 3, 7, 2, 4, 6, 8]";
        // act
        String coDostałem = wszerz.czytajDrzewo(DrzewaDoTestowania.symetryczne);
        // assert
        assert oczekiwane.equals(coDostałem) : String.format("Expected %s, got %s", oczekiwane, coDostałem);
    }

    @Test
    public void czyDziałaNaNiesymetrycznymDrzewie() {
        // arrange
        PrzeszukiwanieWszerz wszerz = new PrzeszukiwanieWszerz();
        String oczekiwane = "[0, 2, 1, 4, 3, 6, 5]";
        // act
        String coDostałem = wszerz.czytajDrzewo(DrzewaDoTestowania.niesymetryczne);
        // assert
        assert oczekiwane.equals(coDostałem) : String.format("Expected %s, got %s", oczekiwane, coDostałem);
    }
}
