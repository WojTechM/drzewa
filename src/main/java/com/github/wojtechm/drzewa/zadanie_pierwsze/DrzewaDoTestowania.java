package com.github.wojtechm.drzewa.zadanie_pierwsze;

/**
 * @author Makiela Wojciech
 */
class DrzewaDoTestowania {

    /*
            5
           / \
          3   7
         / \ / \
        2  4 6  8
     */
    static Węzeł symetryczne;

    /*
        0
         \
          2
         / \
        1   4
           / \
          3   6
             /
            5
     */
    static Węzeł niesymetryczne;

    /*

        0
         \
          1
           \
            6
           /
          3
         /
        2
         \
          4
           \
            5
     */
    static Węzeł schodki;

    static {
        symetryczne = generujSymetryczne();
        niesymetryczne = generujNiesymetryczne();
        schodki = generujSchodki();
    }

    private static Węzeł generujSymetryczne() {
        DrzewoBinarnychPoszukiwań drzewo = new DrzewoBinarnychPoszukiwań(5);
        drzewo.dodaj(3);
        drzewo.dodaj(7);
        drzewo.dodaj(2);
        drzewo.dodaj(4);
        drzewo.dodaj(6);
        drzewo.dodaj(8);
        return drzewo.korzeń;
    }

    private static Węzeł generujNiesymetryczne() {
        DrzewoBinarnychPoszukiwań drzewo = new DrzewoBinarnychPoszukiwań(0);
        drzewo.dodaj(2);
        drzewo.dodaj(1);
        drzewo.dodaj(4);
        drzewo.dodaj(3);
        drzewo.dodaj(6);
        drzewo.dodaj(5);
        return drzewo.korzeń;
    }

    private static Węzeł generujSchodki() {
        DrzewoBinarnychPoszukiwań drzewo = new DrzewoBinarnychPoszukiwań(0);
        drzewo.dodaj(1);
        drzewo.dodaj(6);
        drzewo.dodaj(3);
        drzewo.dodaj(2);
        drzewo.dodaj(4);
        drzewo.dodaj(5);
        return drzewo.korzeń;
    }

}
