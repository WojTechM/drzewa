package com.github.wojtechm.drzewa.zadanie_pierwsze;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Makiela Wojciech
 */
class PrzeszukiwanieWszerz {

    String czytajDrzewo(Węzeł korzeń) {
        List<Integer> wartości = new ArrayList<>();
        dodaj(wartości, korzeń);
        return wartości.toString();
    }

    private void dodaj(List<Integer> wartości, Węzeł węzeł) {
        Queue<Węzeł> doOdwiedzenia = new LinkedList<>();
        doOdwiedzenia.add(węzeł);
        dodajWartościWęzłówDoOdwiedzeniaIIchDzieci(wartości, doOdwiedzenia);
    }

    private void dodajWartościWęzłówDoOdwiedzeniaIIchDzieci(List<Integer> wartości, Queue<Węzeł> doOdwiedzenia) {
        while (sąWęzłyDoOdwiedzenia(doOdwiedzenia)) {
            Węzeł węzeł = doOdwiedzenia.poll();
            wartości.add(węzeł.wartość);
            dodajDzieciDoDoOdwiedzenia(doOdwiedzenia, węzeł);
        }
    }

    private void dodajDzieciDoDoOdwiedzenia(Queue<Węzeł> doOdwiedzenia, Węzeł węzeł) {
        if (węzeł.lewy != null) doOdwiedzenia.add(węzeł.lewy);
        if (węzeł.prawy != null) doOdwiedzenia.add(węzeł.prawy);
    }

    private boolean sąWęzłyDoOdwiedzenia(Queue<Węzeł> doOdwiedzenia) {
        return !doOdwiedzenia.isEmpty();
    }
}
