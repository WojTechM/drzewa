package com.github.wojtechm.drzewa.zadanie_drugie;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Makiela Wojciech
 */
class PrzeszukiwanieWszerz {
    String czytajGraf(WęzełGrafu korzeń) {
        List<Integer> wartości = new ArrayList<>();
        List<WęzełGrafu> odwiedzone = new ArrayList<>();
        Queue<WęzełGrafu> doOdwiedzenia = new LinkedList<>();
        doOdwiedzenia.add(korzeń);
        dodaj(wartości, odwiedzone, doOdwiedzenia);
        return wartości.toString();
    }

    private void dodaj(List<Integer> wartości, List<WęzełGrafu> odwiedzone, Queue<WęzełGrafu> doOdwiedzenia) {
        while (!doOdwiedzenia.isEmpty()) {
            WęzełGrafu węzełGrafu = doOdwiedzenia.poll();
            if (odwiedzone.contains(węzełGrafu)) {
                continue;
            }
            wartości.add(węzełGrafu.wartość);
            odwiedzone.add(węzełGrafu);
            doOdwiedzenia.addAll(węzełGrafu.powiązane);
        }
    }
}
