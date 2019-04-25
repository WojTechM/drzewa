package com.github.wojtechm.drzewa.zadanie_drugie;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Makiela Wojciech
 */
class WęzełGrafu {
    int wartość;
    List<WęzełGrafu> powiązane;

    WęzełGrafu(int wartość) {
        this.wartość = wartość;
        powiązane = new ArrayList<>();
    }

    void dodajWęzeł(WęzełGrafu węzeł) {
        powiązane.add(węzeł);
        węzeł.powiązane.add(this);
    }
}
