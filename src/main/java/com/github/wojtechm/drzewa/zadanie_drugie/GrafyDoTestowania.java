package com.github.wojtechm.drzewa.zadanie_drugie;

/**
 * @author Makiela Wojciech
 */
class GrafyDoTestowania {

    static WęzełGrafu korzeń1; // zaczyna na węźle o wartości 0
    static WęzełGrafu korzeń2; // zaczyna na węźle o wartości 6

    /*
     3   2
      \ / \
       0   6
      / \ /
     4   1
      \ /
       5
     */
    static {
        generujGraf();
    }

    private static WęzełGrafu generujGraf() {
        WęzełGrafu węzeł0 = new WęzełGrafu(0);
        WęzełGrafu węzeł1 = new WęzełGrafu(1);
        WęzełGrafu węzeł2 = new WęzełGrafu(2);
        WęzełGrafu węzeł3 = new WęzełGrafu(3);
        WęzełGrafu węzeł4 = new WęzełGrafu(4);
        WęzełGrafu węzeł5 = new WęzełGrafu(5);
        WęzełGrafu węzeł6 = new WęzełGrafu(6);
        powiążWęzły(węzeł0, węzeł1, węzeł2, węzeł3, węzeł4, węzeł5, węzeł6);
        korzeń1 = węzeł0;
        korzeń2 = węzeł6;
        return węzeł0;
    }

    private static void powiążWęzły(WęzełGrafu węzeł0, WęzełGrafu węzeł1, WęzełGrafu węzeł2, WęzełGrafu węzeł3, WęzełGrafu węzeł4, WęzełGrafu węzeł5, WęzełGrafu węzeł6) {
        węzeł0.dodajWęzeł(węzeł1);
        węzeł0.dodajWęzeł(węzeł2);
        węzeł0.dodajWęzeł(węzeł3);
        węzeł0.dodajWęzeł(węzeł4);
        węzeł4.dodajWęzeł(węzeł5);
        węzeł1.dodajWęzeł(węzeł5);
        węzeł1.dodajWęzeł(węzeł6);
        węzeł2.dodajWęzeł(węzeł6);
    }
}
