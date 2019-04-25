package com.github.wojtechm.drzewa.zadanie_pierwsze;

/**
 * @author Makiela Wojciech
 */
class DrzewoBinarnychPoszukiwań {

    Węzeł korzeń;

    DrzewoBinarnychPoszukiwań(int wartość) {
        korzeń = new Węzeł(wartość);
    }

    void dodaj(int wartość) {
        dodaj(korzeń, wartość);
    }

    private void dodaj(Węzeł rodzic, int wartość) {
        if (wartość < rodzic.wartość) {
            dodajLewo(rodzic, wartość);
        } else {
            dodajPrawo(rodzic, wartość);
        }
    }

    private void dodajPrawo(Węzeł rodzic, int wartość) {
        if (rodzic.prawy == null) {
            rodzic.prawy = new Węzeł(wartość);
        } else {
            dodaj(rodzic.prawy, wartość);
        }
    }

    private void dodajLewo(Węzeł rodzic, int wartość) {
        if (rodzic.lewy == null) {
            rodzic.lewy = new Węzeł(wartość);
        } else {
            dodaj(rodzic.lewy, wartość);
        }
    }
}
