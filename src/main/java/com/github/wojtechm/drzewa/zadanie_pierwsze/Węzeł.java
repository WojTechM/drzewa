package com.github.wojtechm.drzewa.zadanie_pierwsze;

import java.util.Objects;

/**
 * @author Makiela Wojciech
 */
class Węzeł {

    int wartość;
    Węzeł lewy;
    Węzeł prawy;

    Węzeł(int value) {
        this.wartość = value;
    }

    @Override
    public String toString() {
        String format = "Wartość: %d, lewy: %s, prawy %s";
        return String.format(format, wartość, lewy == null ? "null" : lewy.wartość, prawy == null ? "null" : prawy.wartość);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Węzeł węzeł = (Węzeł) o;
        return wartość == węzeł.wartość &&
                Objects.equals(lewy, węzeł.lewy) &&
                Objects.equals(prawy, węzeł.prawy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(wartość, lewy, prawy);
    }
}
