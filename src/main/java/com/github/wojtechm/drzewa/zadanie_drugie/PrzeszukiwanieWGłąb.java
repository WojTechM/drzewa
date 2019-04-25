package com.github.wojtechm.drzewa.zadanie_drugie;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Makiela Wojciech
 */
class PrzeszukiwanieWGłąb {
    String czytajGraf(WęzełGrafu korzeń) {
        List<Integer> wartości = new ArrayList<>();
        List<WęzełGrafu> odwiedzone = new ArrayList<>();
        dodaj(korzeń,wartości, odwiedzone);
        return wartości.toString();
    }

    private void dodaj(WęzełGrafu korzeń, List<Integer> wartości, List<WęzełGrafu> odwiedzone) {
        if (korzeń == null || odwiedzone.contains(korzeń)) {
            return;
        }
        wartości.add(korzeń.wartość);
        odwiedzone.add(korzeń);
        for (WęzełGrafu węzeł : korzeń.powiązane) {
            dodaj(węzeł, wartości, odwiedzone);
        }
    }
}
