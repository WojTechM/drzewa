package com.github.wojtechm.drzewa;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Makiela Wojciech
 */
class PrzeszukiwanieWGłąb {
    String czytajDrzewo(Węzeł korzeń) {
        List<Integer> wartości = new ArrayList<>();
        dodaj(wartości, korzeń);
        return wartości.toString();
    }

    private void dodaj(List<Integer> wartości, Węzeł węzeł) {
        if (węzeł == null) {
            return;
        }
        wartości.add(węzeł.wartość);
        dodaj(wartości, węzeł.lewy);
        dodaj(wartości, węzeł.prawy);
    }
}
