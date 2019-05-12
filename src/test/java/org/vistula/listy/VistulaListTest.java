package org.vistula.listy;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class VistulaListTest {

    @Test
    public void listTest() {
        List<String> imiona = new ArrayList<>();
        imiona.add("Halina"); // dodałam imię do listy
        assert imiona.size() == 1; // size zwraca wielkość
        assert imiona.get(0).equals("Halina");
        imiona.remove(0); // usuwa element z listy z indeksem 0
        assert imiona.size() == 0;
        assert imiona.contains("Halina") == false; // czy zawiera

    }

    @Test
    public void ListZero() {
        VistulaList obiektVistulaList = new VistulaList();
        assert obiektVistulaList.getImiona().size() == 0;
    }

    @Test
    public void shouldSetList() {

        List<String> myList = new ArrayList<>();
        myList.add("Slawek");
        myList.add("Ewa");

        VistulaList obiekt = new VistulaList();
        obiekt.setImiona(myList);

        assert obiekt.getImiona().size()==2;
        assert obiekt.getImiona().get(1).equals("Ewa");
    }
}
